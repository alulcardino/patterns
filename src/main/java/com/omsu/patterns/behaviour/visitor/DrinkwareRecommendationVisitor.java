package com.omsu.patterns.behaviour.visitor;

public class DrinkwareRecommendationVisitor implements Visitor {
    @Override
    public String visit(Cognac cognac) {
        return "For cognac drinkware is Snifter";
    }

    @Override
    public String visit(Grappa grappa) {
        return "For grappa drinkware is shot glass Tulip";
    }

    @Override
    public String visit(Rum rum) {
        return "For rum drinkware is Rocks";
    }

    @Override
    public String visit(Tequilla tequilla) {
        return "For tequila drinkware is Shot glass";
    }

    @Override
    public String visit(Whiskey whiskey) {
        return "For whiskey drinkware is Old-fashion";
    }
}