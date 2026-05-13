package com.pluarlsight;

public class Jewelry extends FixedAsset {
    private double karat;

    public Jewelry(String name, double value, double karat) {
        super("Jewlery", 0);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        double baseValue = 0;
    }
}
