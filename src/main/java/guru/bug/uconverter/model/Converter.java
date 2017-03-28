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
public interface Converter {

    UnitType getUnitType();

    String getUnitName();

    default String getUnitAbbr() {
        return getUnitName().substring(0, 1);
    }

    default Formatter getFormatter() {
        return new BasicFormatter();
    }

    default double toStandard(double value) {
        return value;
    }

    default double fromStandard(double stdValue) {
        return stdValue;
    }
}
