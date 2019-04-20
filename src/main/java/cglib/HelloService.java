package cglib;

public class HelloService {
    public HelloService() {
        System.out.println("HelloService 构造");
    }

    /**
     * final 方法，不会被cglib覆盖
     * @param name
     * @return
     */
    final public String sayOthers(String name) {
        System.out.println("HelloService:sayOthers>>" + name);
        return null;
    }

    public void sayHello() {
        System.out.println("HelloService:sayHello");
    }

}
