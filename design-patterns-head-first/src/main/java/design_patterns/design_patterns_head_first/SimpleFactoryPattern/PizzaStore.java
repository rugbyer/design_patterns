package design_patterns.design_patterns_head_first.SimpleFactoryPattern;

public abstract class PizzaStore {
    
    
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepair();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    
    abstract Pizza createPizza(String type);

}
