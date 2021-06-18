package com.omsu.patterns.generative.builder;

public abstract class Builder {
    protected City city;

    public City getCity() {
        return city;
    }

    public void createCity() {
        city = new City();
    }

    public abstract void buildCityMuseum();
    public abstract void buildCityMail();
    public abstract void buildCityTheatre();
    public abstract void buildCityHyperMarket();
}
