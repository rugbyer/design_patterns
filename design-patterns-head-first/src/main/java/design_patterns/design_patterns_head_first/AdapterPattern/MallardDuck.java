package design_patterns.design_patterns_head_first.AdapterPattern;

public class MallardDuck implements Duck{

    public void quack() {
        System.out.println("Quack");
        
    }

    public void fly() {
        System.out.println("I'm flying");
        
    }

}
