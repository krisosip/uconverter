/*
 * Copyright (c) 2017 Dimitrijs Fedotovs
 * This software may be modified and distributed under the terms of the MIT license.
 * See the LICENSE file for details.
 */

package guru.bug.uconverter.model;

import guru.bug.uconverter.format.BasicFormatter;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public abstract class Converter {

    public abstract UnitType getUnitType();

    public abstract String getUnitName();

    public String getUnitAbbr() {
        return getUnitName().substring(0, 1);
    }

    public Formatter getFormatter() {
        return new BasicFormatter();
    }

    public double toStandard(double value) {
        return value;
    }

    public double fromStandard(double stdValue) {
        return stdValue;
    }

    @Override
    public String toString(){
        return getUnitName();
    }
}
