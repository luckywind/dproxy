import java.lang.reflect.Proxy;

public class test {

    public static void main(String[] args) {
        NumberOperationImp proxied = new NumberOperationImp();
        NumberOperationInterface real = wrap(proxied);
        int res = real.add(1, 2);
        System.out.println("res="+res);
    }
    public static NumberOperationInterface wrap(NumberOperationInterface proxied) {
        return (NumberOperationInterface) Proxy.newProxyInstance(
                NumberOperationInterface.class.getClassLoader(),
                new Class[]{NumberOperationInterface.class},
                new NumberOperationIMpProxyHandler(proxied)
        );
    }



}
