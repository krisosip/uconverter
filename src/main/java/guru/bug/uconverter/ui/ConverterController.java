/*
 * Copyright (c) 2017 Dimitrijs Fedotovs
 * This software may be modified and distributed under the terms of the MIT license.
 * See the LICENSE file for details.
 */

package guru.bug.uconverter.ui;

import guru.bug.uconverter.Registry;
import guru.bug.uconverter.model.Conversion;
import guru.bug.uconverter.model.Converter;
import guru.bug.uconverter.model.UnitType;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * Created by krisosip on 30/03/2017.
 */
public class ConverterController {
    public ComboBox<Converter> sourceUnit;
    public ComboBox<Converter> targetUnit;
    public TextField sourceValue;
    public TextField targetValue;

    public void initUnit(UnitType unitType) {
        for (Converter conv : Registry.getAllConverters()) {
            if (conv.getUnitType() != unitType) {
                continue;
            }

            sourceUnit.getItems().add(conv);
            targetUnit.getItems().add(conv);
        }
        sourceUnit.getSelectionModel().select(0);
        targetUnit.getSelectionModel().select(0);
    }

    public void convert(ActionEvent actionEvent) {
        double srcVal = Double.parseDouble(sourceValue.getText());
        Converter srcConv = sourceUnit.getValue();
        Converter trgConv = targetUnit.getValue();
        Conversion conversion = new Conversion(srcConv, trgConv);
        conversion.setSourceValue(srcVal);
        targetValue.setText(conversion.getFormattedTargetValue());
    }

    public void swap(ActionEvent actionEvent) {
        Converter srcConv = sourceUnit.getValue();
        Converter trgConv = targetUnit.getValue();
        Converter a = srcConv;
        srcConv = trgConv;
        trgConv = a;
        sourceUnit.getSelectionModel().select(srcConv);
        targetUnit.getSelectionModel().select(trgConv);
    }
}
