/*
 * Copyright (c) 2017 Dimitrijs Fedotovs
 * This software may be modified and distributed under the terms of the MIT license.
 * See the LICENSE file for details.
 */

package guru.bug.uconverter.convert.weight;

import guru.bug.uconverter.model.Converter;
import guru.bug.uconverter.model.UnitType;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public abstract class AbstractWeightConverter extends Converter {
    @Override
    public UnitType getUnitType() {
        return UnitType.WEIGHT;
    }
}
