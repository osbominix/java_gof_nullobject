package com.gof.designpattern;

import com.gof.designpattern.nullobject.ColorFactory;
import com.gof.designpattern.nullobject.basis.Color;

/**
 * Created by yl3 on 11.12.15.
 */
public class CommandCenter {


    public static void main(String[] args) {
        Color Color1 = ColorFactory.getColor("Red");
        Color Color2 = ColorFactory.getColor("Green");
        Color Color3 = ColorFactory.getColor("Blue");
        Color Color4 = ColorFactory.getColor("Black");

        System.out.println("Color:");
        System.out.println(Color1.paint());
        System.out.println(Color2.paint());
        System.out.println(Color3.paint());
        System.out.println(Color4.paint());
    }
}
