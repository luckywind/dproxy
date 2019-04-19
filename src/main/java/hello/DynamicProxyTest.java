package hello;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {
    public static void main(String[] args) {
        IHello hello = enhanceHello(new RealHello()); // 增强原始方法
        hello.say("world");
    }

    /**
     * 创建代理类
     * @param target
     * @return
     */
    public static IHello enhanceHello(IHello target) {
        return (IHello) Proxy.newProxyInstance(DynamicProxyTest.class.getClassLoader(), new Class<?>[]{IHello.class},
                new HelloProxyHandler(target));
    }

}
