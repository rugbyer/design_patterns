package design_patterns.design_patterns_head_first.StrategyPattern;

public class Quack implements QuackBehavior{
    public void quack(){
        System.out.println("Quack!");
    }
}
