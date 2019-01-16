package design_patterns.design_patterns_head_first.CommandPattern;

public class Light {
    String name;
    public Light(String name){
        this.name = name;
    }
    
    public void on(){
        
        System.out.println(name + " Light On");
        
    }
    public void off(){
        System.out.println(name + " Light Off");
    }

}
