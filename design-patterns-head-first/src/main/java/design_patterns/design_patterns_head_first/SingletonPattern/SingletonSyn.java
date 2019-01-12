package design_patterns.design_patterns_head_first.SingletonPattern;

public class SingletonSyn {
    
    private static SingletonSyn instance;
    
    private SingletonSyn(){};
    
    public static synchronized SingletonSyn getInstance(){
        if(instance==null){
            instance = new SingletonSyn();
        }
        return instance;
    }

}
