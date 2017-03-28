/*
 * Copyright (c) 2017 Dimitrijs Fedotovs
 * This software may be modified and distributed under the terms of the MIT license.
 * See the LICENSE file for details.
 */

package guru.bug.uconverter.format;

import guru.bug.uconverter.convert.temperature.CelsiusConverter;
import guru.bug.uconverter.model.Converter;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by krisosip on 28/03/2017.
 */
public class BasicFormatterTest {
    private BasicFormatter formatter = new BasicFormatter();

    @Test
    public void format() throws Exception {
        double value = 54.578347584375;
        Converter converter = mock(Converter.class);
        when(converter.getUnitAbbr()).thenReturn("X");
        assertEquals("54.58 X", formatter.format(value, converter));
    }

}