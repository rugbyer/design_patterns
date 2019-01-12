package design_patterns.design_patterns_head_first.SimpleFactoryPattern;

public class PizzaStore {
    
    SimplePizzaFactory factory;
    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }
    
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.prepair();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
