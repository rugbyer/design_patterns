package design_patterns.design_patterns_head_first.SingletonPattern;

public class SingletonStatic {
    
    private static SingletonStatic instance = new SingletonStatic();
    
    private SingletonStatic(){};
    
    public static SingletonStatic getInstance(){
        return instance;
    }

}
