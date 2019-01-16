package design_patterns.design_patterns_head_first.CommandPattern;

public class LightOnCommand implements Command{
    
    Light light;
    
    public LightOnCommand(Light light){
        this.light=light;
    }

    public void execute() {
        light.on();   
    }

}
