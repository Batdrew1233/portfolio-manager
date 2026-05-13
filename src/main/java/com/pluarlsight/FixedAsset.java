package com.pluarlsight;

import com.plualsight.finance.IValuable;

public abstract class FixedAsset implements IValuable {

    private String name;
    private double value;

    public FixedAsset(String name, double value) {
        this.name = name;
        this.value = value;
    }


    public abstract double getValue();
}
