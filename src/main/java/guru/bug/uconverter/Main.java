/*
 * Copyright (c) 2017 Dimitrijs Fedotovs
 * This software may be modified and distributed under the terms of the MIT license.
 * See the LICENSE file for details.
 */

package guru.bug.uconverter;

import asg.cliche.Command;
import asg.cliche.Shell;
import asg.cliche.ShellFactory;
import guru.bug.uconverter.model.Conversion;
import guru.bug.uconverter.model.Converter;

import java.io.IOException;
import java.util.List;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class Main {

    @Command
    public void list() {
        List<Converter> list = Registry.getAllConverters();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(i + 1);
            System.out.print(" \t ");
            System.out.println(list.get(i).getUnitName());
        }
    }

    @Command
    public String convert(int sourceIdx, int targetIdx, double value) {
        List<Converter> list = Registry.getAllConverters();
        Converter src = list.get(sourceIdx - 1);
        Converter trg = list.get(targetIdx - 1);
        Conversion conv = new Conversion(src, trg);
        conv.setSourceValue(value);
        return String.format("%s = %s", conv.getFormattedSourceValue(), conv.getFormattedTargetValue());
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        Shell shell = ShellFactory.createConsoleShell("convert", "Universal Converter", main);
        shell.commandLoop();
    }

}
