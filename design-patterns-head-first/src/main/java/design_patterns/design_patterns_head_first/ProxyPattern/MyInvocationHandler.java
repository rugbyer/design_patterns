package design_patterns.design_patterns_head_first.ProxyPattern;

import java.lang.reflect.Method;

public interface MyInvocationHandler {
    Object invoke( Object proxy, Method method,Object[] args) throws IllegalAccessException, IllegalArgumentException;

}
