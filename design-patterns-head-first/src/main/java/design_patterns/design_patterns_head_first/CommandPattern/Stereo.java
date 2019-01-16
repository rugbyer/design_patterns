package design_patterns.design_patterns_head_first.CommandPattern;

public class Stereo {
    int volume;
    String name;
    public Stereo(String name){
        this.name = name;
    }
    public void on(){
        System.out.println(name+" Stereo On");
    }
    
    public void setCD(){
        System.out.println(name+" Stereo setCD");
    }
    
    public void setVolume(int volume){
        this.volume = volume;
        System.out.println(name+" Stereo setVolume "+volume);
    }

}
