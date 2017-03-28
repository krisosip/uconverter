/*
 * Copyright (c) 2017 Dimitrijs Fedotovs
 * This software may be modified and distributed under the terms of the MIT license.
 * See the LICENSE file for details.
 */

package guru.bug.uconverter;

import guru.bug.uconverter.convert.length.InchesConverter;
import guru.bug.uconverter.convert.length.MetersConverter;
import guru.bug.uconverter.convert.length.MilesConverter;
import guru.bug.uconverter.convert.temperature.CelsiusConverter;
import guru.bug.uconverter.convert.temperature.FahrenheitConverter;
import guru.bug.uconverter.convert.temperature.KelvinConverter;
import guru.bug.uconverter.convert.weight.KilogramsConverter;
import guru.bug.uconverter.convert.weight.PoundConverter;
import guru.bug.uconverter.convert.weight.TonsConverter;
import guru.bug.uconverter.model.Converter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public final class Registry {
    private static final Converter[] converters = new Converter[]{
            new InchesConverter(),
            new MetersConverter(),
            new MilesConverter(),
            new CelsiusConverter(),
            new FahrenheitConverter(),
            new KelvinConverter(),
            new KilogramsConverter(),
            new PoundConverter(),
            new TonsConverter()
    };


    private Registry() {
    }

    public static List<Converter> getAllConverters() {
        return Collections.unmodifiableList(Arrays.asList(converters));
    }

}
