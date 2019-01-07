package design_patterns.design_patterns_head_first.StrategyPattern;

public class FlyNoWay implements FlyBehavior{
    
    public void fly(){
        System.out.println("I can't fly!!");
    }

}
