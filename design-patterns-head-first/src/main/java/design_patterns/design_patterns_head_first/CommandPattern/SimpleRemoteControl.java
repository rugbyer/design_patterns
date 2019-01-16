package design_patterns.design_patterns_head_first.CommandPattern;

public class SimpleRemoteControl {
    Command solt;
    public SimpleRemoteControl(){
         
    }
    
    public void setCommand(Command command){
        solt = command;
    }
    
    public void buttonWasPressed(){
        solt.execute();
    }
    

}
