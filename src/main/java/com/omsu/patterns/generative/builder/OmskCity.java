package com.omsu.patterns.generative.builder;

public class OmskCity extends Builder {

    @Override
    public void buildCityMuseum() {
        city.setMuseum("Omsk State Museum of History and Local Lore");
    }

    @Override
    public void buildCityMail() {
        city.setMail("Russian Mail");
    }

    @Override
    public void buildCityTheatre() {
        city.setMail("Dramatic theatre");
    }

    @Override
    public void buildCityHyperMarket() {
        city.setHyperMarket("MEGA");
    }
}
