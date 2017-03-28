/*
 * Copyright (c) 2017 Dimitrijs Fedotovs
 * This software may be modified and distributed under the terms of the MIT license.
 * See the LICENSE file for details.
 */

package guru.bug.uconverter.format;

import guru.bug.uconverter.convert.temperature.CelsiusConverter;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by krisosip on 28/03/2017.
 */
public class BasicFormatterTest {
    private BasicFormatter formatter = new BasicFormatter();

    @Test
    public void format() throws Exception {
        double value = 54.578347584375;
        CelsiusConverter converter = new CelsiusConverter();
        assertEquals("54.58 C", formatter.format(value, converter));
    }

}