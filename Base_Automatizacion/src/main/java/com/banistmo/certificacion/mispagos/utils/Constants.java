package com.banistmo.certificacion.mispagos.utils;

public enum Constants {

    URL("https://mispagos.banistmolabs.com/");

    private String constant = "https://mispagos.banistmolabs.com/";

    Constants(String constant) {
        this.constant = constant;
    }

    public String getConstant() {
        return constant;
    }
}
