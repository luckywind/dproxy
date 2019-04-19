package hello;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class HelloProxyHandler implements InvocationHandler {

    private IHello target;  // 原始对象

    public HelloProxyHandler(IHello target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /**
         * 这里可以任意附加一些逻辑
         */
        System.out.println("before print");
        method.invoke(target, args);  // 调用原始对象的方法
        System.out.println("after print");
        return null;
    }

}