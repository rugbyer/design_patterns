package design_patterns.design_patterns_head_first.TemplatePattern;

public class Coffee extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
        
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Suger and Milk");  
    }

}
