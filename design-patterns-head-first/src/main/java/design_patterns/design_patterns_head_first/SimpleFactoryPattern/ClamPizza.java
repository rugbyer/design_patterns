package design_patterns.design_patterns_head_first.SimpleFactoryPattern;

public class ClamPizza extends Pizza{
    
    public void prepair(){
        System.out.println("ClamPizza prepair!");
    }
    public void bake(){
        System.out.println("ClamPizza bake!");
    }
    public void cut(){
        System.out.println("ClamPizza cut!");
    }
    public void box(){
        System.out.println("ClamPizza box!");
    }

}
