import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//代理处理器，通过实现InvocationHandler接口定义

/**
 * 1.由于我们的例子是代理本地对象，那么处理函数是需要被代理对象的信息。
 * 可以看到，我们从构造函数中将被代理对象保存在该类中，即可从处理函数中访问到。
 *
 * 2,在invoke函数中，对代理对象的所有方法的调用都被转发至该函数处理。在这里可以灵活的自定义各种你能想到的逻辑。
 * 在代码中，我们使用反射调用被代理对象的同名方法实现。
 */
public class NumberOperationIMpProxyHandler implements InvocationHandler {

    private Object proxied;

    public NumberOperationIMpProxyHandler(Object proxied) {
        this.proxied = proxied;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.printf("调用函数%s \n",method.getName());
        return method.invoke(proxied, args);
    }
}
