package com.gof.designpattern.nullobject.basis;

/**
 * Created by yl3 on 11.12.15.
 */
public class NotAvailableColor extends Color {

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String paint() {
        return "Color not Available.";
    }
}
