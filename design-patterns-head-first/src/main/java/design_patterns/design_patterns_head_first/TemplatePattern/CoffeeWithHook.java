package design_patterns.design_patterns_head_first.TemplatePattern;

public class CoffeeWithHook extends CaffeineBeverageWithHook{

    @Override
    void brew() {
        System.out.println("Dripping Coffee with filter");
        
    }

    @Override
    void addCondiments() {
        System.out.println("Add Sugar and Milk");
        
    }
    
    public boolean CustomerWantsCondiments(){
        return true;
    }

}
