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
public class KelvinConverterTest {
    private KelvinConverter converter = new KelvinConverter();

    @org.junit.Test
    public void getUnitName() throws Exception {
        assertEquals("Kelvin", converter.getUnitName());
    }
    @org.junit.Test
    public void toStandart() throws Exception {
        assertEquals(100.0, converter.toStandard(100.0),0.0001);
    }

    @org.junit.Test
    public void fromStandart() throws Exception {
        assertEquals(100.0, converter.toStandard(100.0),0.0001);
    }

}