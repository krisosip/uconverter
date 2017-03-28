/*
 * Copyright (c) 2017 Dimitrijs Fedotovs
 * This software may be modified and distributed under the terms of the MIT license.
 * See the LICENSE file for details.
 */

package guru.bug.uconverter.format;

import guru.bug.uconverter.model.Formatter;

public class BasicFormatter implements Formatter {

    @Override
    public String format(double value) {
        return String.format("%.2f", value);
    }
}
