package design_patterns.design_patterns_head_first.ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler{
    PersonBean person;
    
    public OwnerInvocationHandler(PersonBean person){
        this.person = person;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException, IllegalArgumentException {
        try{
            if(method.getName().startsWith("get")){
                return method.invoke(person, args);
            }else if (method.getName().equals("setHotOrNotRating")){
                throw new IllegalAccessException();
            }else if(method.getName().startsWith("set")){
                return method.invoke(person, args);
            }
        }catch(InvocationTargetException e){
            e.printStackTrace();
        }
        return null;
    }

}