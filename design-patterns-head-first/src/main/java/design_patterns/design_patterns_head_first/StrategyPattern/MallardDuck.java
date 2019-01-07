package design_patterns.design_patterns_head_first.StrategyPattern;

public class MallardDuck extends Duck{
    
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("I'm a real Mallard duck!");
    }
}
