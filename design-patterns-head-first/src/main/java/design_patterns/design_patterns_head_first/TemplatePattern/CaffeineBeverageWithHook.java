package design_patterns.design_patterns_head_first.TemplatePattern;

public abstract class CaffeineBeverageWithHook {
    public final void prepareReciple(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }   
        
    }
    abstract void brew();
    abstract void addCondiments();
    void boilWater(){
        System.out.println("Boiling water");
    }
    
    void pourInCup(){
        System.out.println("Pouring into cup");
    }
    
    boolean customerWantsCondiments(){
        return true;
    }
}
