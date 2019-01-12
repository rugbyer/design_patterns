package design_patterns.design_patterns_head_first.SimpleFactoryPattern;

public class NYStylePizzaStore extends PizzaStore{


    @Override
    Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if(type.equals("clam")){
            return new NYStyleClamPizza();
        }
        return null;
    }

}
