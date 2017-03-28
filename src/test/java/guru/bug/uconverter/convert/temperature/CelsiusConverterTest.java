/*
 * Copyright (c) 2017 Dimitrijs Fedotovs
 * This software may be modified and distributed under the terms of the MIT license.
 * See the LICENSE file for details.
 */

package guru.bug.uconverter.convert.temperature;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by krisosip on 28/03/2017.
 */
public class CelsiusConverterTest {
    private CelsiusConverter converter = new CelsiusConverter();
    @Test
    public void getUnitName() throws Exception {
        assertEquals("Celsius", converter.getUnitName());
    }

    @Test
    public void toStandard() throws Exception {
        assertEquals(273.15, converter.toStandard(0.0),0.0001);
    }

    @Test
    public void fromStandard() throws Exception {
        assertEquals(0.0, converter.fromStandard(273.15),0.0001);
    }

}