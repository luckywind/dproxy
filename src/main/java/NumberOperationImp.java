/**
 * 被代理类
 */
public class NumberOperationImp implements NumberOperationInterface {
    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
