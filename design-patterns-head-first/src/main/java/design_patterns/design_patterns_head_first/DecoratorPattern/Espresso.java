package design_patterns.design_patterns_head_first.DecoratorPattern;

public class Espresso extends Beverage{
    
    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
