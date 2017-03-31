/*
 * Copyright (c) 2017 Dimitrijs Fedotovs
 * This software may be modified and distributed under the terms of the MIT license.
 * See the LICENSE file for details.
 */

package guru.bug.uconverter.ui;

import guru.bug.uconverter.model.UnitType;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

/**
 * Created by krisosip on 30/03/2017.
 */
public class MainController {
    public TabPane unitTabs;

    public void initialize() throws IOException {
        for (UnitType t: UnitType.values()){
            Tab tab = new Tab(t.toString());
            tab.setClosable(false);

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/convert-panel.fxml"));
            Pane root = loader.load();
            ConverterController converterController = loader.getController();

            converterController.initUnit(t);
            tab.setContent(root);

            unitTabs.getTabs().add(tab);
        }
    }
}
