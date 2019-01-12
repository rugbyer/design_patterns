package design_patterns.design_patterns_head_first.SimpleFactoryPattern;

public class CheesePizza extends Pizza{
    
    public void prepair(){
        System.out.println("CheesePizza prepair!");
    }
    public void bake(){
        System.out.println("CheesePizza bake!");
    }
    public void cut(){
        System.out.println("CheesePizza cut!");
    }
    public void box(){
        System.out.println("CheesePizza box!");
    }

}
