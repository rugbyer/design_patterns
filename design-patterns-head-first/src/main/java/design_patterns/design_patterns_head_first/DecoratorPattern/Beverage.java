package design_patterns.design_patterns_head_first.DecoratorPattern;

public abstract class Beverage {
    String description="Unknown Beverage";
    public String getDescription(){
        return description;
    }
    public abstract double cost();

}
