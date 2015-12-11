package com.gof.designpattern.nullobject;

import com.gof.designpattern.nullobject.basis.Color;
import com.gof.designpattern.nullobject.basis.AvailableColor;
import com.gof.designpattern.nullobject.basis.NotAvailableColor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yl3 on 11.12.15.
 */
public class ColorFactory {


    public static final Set<String> names = new HashSet<String>(Arrays.asList("Red", "Green", "Blue"));

    public static Color getColor(String name){

        if (names.contains(name)) {
            return new AvailableColor(name);
        }
        return new NotAvailableColor();
    }

}
