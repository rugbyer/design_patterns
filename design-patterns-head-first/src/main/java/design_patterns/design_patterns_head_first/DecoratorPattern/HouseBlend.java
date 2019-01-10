package design_patterns.design_patterns_head_first.DecoratorPattern;

public class HouseBlend extends Beverage{
    
    public HouseBlend(){
        description="House Blend Coffee";
    }
    

    @Override
    public double cost() {
        return .89;
    }

}
