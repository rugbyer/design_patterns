package design_patterns.design_patterns_head_first.DecoratorPattern;

public class Mocha extends CondimentDecorator{
    Beverage beverage;
    
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        
        return beverage.getDescription()+",Mocha";
    }

    @Override
    public double cost() {
        return .20+beverage.cost();
    }

}
