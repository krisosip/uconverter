/*
 * Copyright (c) 2017 Dimitrijs Fedotovs
 * This software may be modified and distributed under the terms of the MIT license.
 * See the LICENSE file for details.
 */

package guru.bug.uconverter.model;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class IncompatibleConvertersException extends RuntimeException {
    public IncompatibleConvertersException(Converter source, Converter target) {
        super(String.format("Cannot convert %s (%s) to %s (%s)",
                source.getUnitName(), source.getUnitType(),
                target.getUnitName(), target.getUnitType()));
    }
}
