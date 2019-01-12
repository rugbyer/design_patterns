package design_patterns.design_patterns_head_first.SimpleFactoryPattern;

public class NYStyleCheesePizza extends Pizza{
    public void prepair(){
        System.out.println("NyStyleCheesePizza prepair!");
    }
    public void bake(){
        System.out.println("NyStyleCheesePizza bake!");
    }
    public void cut(){
        System.out.println("NyStyleCheesePizza cut!");
    }
    public void box(){
        System.out.println("NyStyleCheesePizza box!");
    }

}
