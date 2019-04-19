package hello;

class RealHello implements IHello {

    @Override
    public void say(String s) {
        System.out.println("hello " + s);
    }

}