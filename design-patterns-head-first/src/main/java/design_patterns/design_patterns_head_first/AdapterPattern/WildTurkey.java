package design_patterns.design_patterns_head_first.AdapterPattern;

public class WildTurkey implements Turkey{

    public void gobble() {
        System.out.println("Gobble gobble");
        
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
        
    }

}
