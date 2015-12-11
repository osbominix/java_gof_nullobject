package com.gof.designpattern.nullobject.basis;

/**
 * Created by yl3 on 11.12.15.
 */
public class AvailableColor extends Color {


    public AvailableColor(String name) {
        this.name = name;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String paint() {
        return "Paint " + name;
    }
}
