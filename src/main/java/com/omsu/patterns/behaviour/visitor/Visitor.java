package com.omsu.patterns.behaviour.visitor;

public interface Visitor {
    String visit(Cognac cognac);
    String visit(Grappa grappa);
    String visit(Rum rum);
    String visit(Tequilla Tequilla);
    String visit(Whiskey whiskey);
}
