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
public class PoundConverter extends AbstractWeightConverter {

    public static final double CONST = 2.2046;

    @Override
    public String getUnitName() {
        return "Pounds";
    }

    @Override
    public String getUnitAbbr() {
        return "lb";
    }

    @Override
    public double toStandard(double lb) {
        return lb / CONST;
    }

    @Override
    public double fromStandard(double kg) {
        return kg * CONST;
    }
}
