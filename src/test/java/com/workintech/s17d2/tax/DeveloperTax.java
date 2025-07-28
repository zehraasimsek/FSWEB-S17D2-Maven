package com.workintech.s17d2.tax;

public class DeveloperTax implements Taxable{
    @Override
    public double getSimpleTaxRate() {
        return 15d;
    }

    @Override
    public double getMiddleTaxRate() {
        return 25d;
    }

    @Override
    public double getUpperTaxRate() {
        return 35d;
    }
}
