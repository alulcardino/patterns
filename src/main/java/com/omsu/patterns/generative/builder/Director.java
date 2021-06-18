package com.omsu.patterns.generative.builder;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public City getStudio() {
        return builder.getCity();
    }

    public void buildStudio() {
        builder.buildCityMuseum();
        builder.buildCityMail();
        builder.buildCityTheatre();
        builder.buildCityHyperMarket();
    }
}
