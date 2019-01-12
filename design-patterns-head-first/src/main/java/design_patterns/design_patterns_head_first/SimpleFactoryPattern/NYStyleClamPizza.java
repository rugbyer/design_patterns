package design_patterns.design_patterns_head_first.SimpleFactoryPattern;

public class NYStyleClamPizza extends Pizza{
    public void prepair(){
        System.out.println("NyStyleClamPizza prepair!");
    }
    public void bake(){
        System.out.println("NyStyleClamPizza bake!");
    }
    public void cut(){
        System.out.println("NyStyleClamPizza cut!");
    }
    public void box(){
        System.out.println("NyStyleClamPizza box!");
    }

}
