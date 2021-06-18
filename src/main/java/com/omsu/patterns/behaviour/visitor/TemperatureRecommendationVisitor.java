package com.omsu.patterns.behaviour.visitor;

public class TemperatureRecommendationVisitor implements Visitor {
    @Override
    public String visit(Cognac cognac) {
        return "Cognac. Beverage temperature: 19°С. Cognac varieties with a short exposure (up to three years): 8-15°С";
    }

    @Override
    public String visit(Grappa grappa) {
        return "Grappa. Beverage temperature: 5-10°C. An older drink is drunk at room temperature (16-19°С).";
    }

    @Override
    public String visit(Rum rum) {
        return "Rum. Beverage temperature: 17-19°С. Rum varieties with a short exposure (gold, spiced, white): 8-15°С";
    }

    @Override
    public String visit(Tequilla tequila) {
        return "Tequila. Beverage temperature is at room temperature";
    }

    @Override
    public String visit(Whiskey whiskey) {
        return "Whiskey. Beverage temperature: 18-20°С)";
    }
}
