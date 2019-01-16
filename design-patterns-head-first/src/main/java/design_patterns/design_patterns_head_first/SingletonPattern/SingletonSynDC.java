package design_patterns.design_patterns_head_first.SingletonPattern;

public class SingletonSynDC {
    
    private volatile static SingletonSynDC instance;
    
    private SingletonSynDC (){};
    
    public static SingletonSynDC getInstance(){
        if(instance ==null){
            synchronized(SingletonSynDC.class){
                if(instance ==null){
                    instance = new SingletonSynDC();
                }
            }
        }
        return instance;
    }

}
