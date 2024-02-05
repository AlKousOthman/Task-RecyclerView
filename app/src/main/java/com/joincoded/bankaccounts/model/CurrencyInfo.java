package com.joincoded.bankaccounts.model;

public class CurrencyInfo {

    private String currencyCode;
    private String currencyName;
    private double currencyRate;

    public CurrencyInfo(String currencyCode, String currencyName, Double currencyRate) {
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
        this.currencyRate = currencyRate;

    }

    public String getCurrencyCode() {
        return currencyCode;
    }
    public String getCurrencyName() {
        return currencyName;
    }

    public double getCurrencyRate() {
        return currencyRate;
    }
}
