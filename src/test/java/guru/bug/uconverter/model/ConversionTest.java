/*
 * Copyright (c) 2017 Dimitrijs Fedotovs
 * This software may be modified and distributed under the terms of the MIT license.
 * See the LICENSE file for details.
 */

package guru.bug.uconverter.model;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by krisosip on 28/03/2017.
 */
public class ConversionTest {
    @Test
    public void convert() throws Exception {
        Converter source = mock(Converter.class);
        Converter target = mock(Converter.class);
        when(source.toStandard(1.0)).thenReturn(10.0);
        when(target.fromStandard(10.0)).thenReturn(20.0);

        Conversion conv = new Conversion(source, target);
        assertEquals(20.0,conv.convert(1.0),0.0001);
    }

    @Test
    public void getSourceValue() throws Exception {

    }

    @Test
    public void setSourceValue() throws Exception {

    }

    @Test
    public void getTargetValue() throws Exception {

    }

    @Test
    public void getFormattedSourceValue() throws Exception {

    }

    @Test
    public void getFormattedTargetValue() throws Exception {

    }

}