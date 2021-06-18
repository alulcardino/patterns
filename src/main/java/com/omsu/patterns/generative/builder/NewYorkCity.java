package com.omsu.patterns.generative.builder;

public class NewYorkCity extends Builder{
    @Override
    public void buildCityMuseum() {
        city.setMuseum("Metropolitan Museum");
    }

    @Override
    public void buildCityMail() {
        city.setMail("USA mail");
    }

    @Override
    public void buildCityTheatre() {
        city.setTheatre("Lincoln Center");
    }

    @Override
    public void buildCityHyperMarket() {
        city.setHyperMarket("Morton Williams Supermarkets");
    }
}
