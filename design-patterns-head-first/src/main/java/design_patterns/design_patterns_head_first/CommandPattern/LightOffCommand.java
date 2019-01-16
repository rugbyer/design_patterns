package design_patterns.design_patterns_head_first.CommandPattern;

public class LightOffCommand implements Command{
    
    Light light;
    
    public LightOffCommand(Light light){
        this.light = light;
    }

    public void execute() {
        light.on();
    }

}
