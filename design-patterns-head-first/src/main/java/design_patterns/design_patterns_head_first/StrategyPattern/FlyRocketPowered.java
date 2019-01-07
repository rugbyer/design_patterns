package design_patterns.design_patterns_head_first.StrategyPattern;

public class FlyRocketPowered implements FlyBehavior{
    public void fly(){
        System.out.println("I'm flying with a rocket!");
    }

}
