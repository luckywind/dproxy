package cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
//自定义MethodInterceptor
public class MyMethodInterceptor implements MethodInterceptor {

    /**
     * sub：cglib生成的代理对象
     * method：被代理对象方法
     * objects：方法入参
     * methodProxy: 代理方法
     */
    public Object intercept(Object sub, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("======插入前置通知========");
        Object obj = methodProxy.invokeSuper(sub, objects);
        System.out.println("======插入后置通知========");
        return obj;
    }
}