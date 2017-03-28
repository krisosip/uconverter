/*
 * Copyright (c) 2017 Dimitrijs Fedotovs
 * This software may be modified and distributed under the terms of the MIT license.
 * See the LICENSE file for details.
 */

package guru.bug.uconverter.convert.weight;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class TonsConverter extends AbstractWeightConverter {
    @Override
    public String getUnitName() {
        return "Tons";
    }

    @Override
    public double toStandard(double tons) {
        return tons * 1000;
    }

    @Override
    public double fromStandard(double kg) {
        return kg / 1000;
    }
}
