package design_patterns.design_patterns_head_first.SimpleFactoryPattern;

public class SimplePizzaFactory {
    
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }else if(type.equals("clam")){
            pizza = new ClamPizza();
        }
        return pizza;
    }

}
