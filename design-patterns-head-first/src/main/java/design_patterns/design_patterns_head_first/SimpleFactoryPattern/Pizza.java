package design_patterns.design_patterns_head_first.SimpleFactoryPattern;

public abstract class Pizza {
    public void prepair(){
        System.out.println("prepair!");
    }
    public void bake(){
        System.out.println("bake!");
    }
    public void cut(){
        System.out.println("cut!");
    }
    public void box(){
        System.out.println("box!");
    }
}
