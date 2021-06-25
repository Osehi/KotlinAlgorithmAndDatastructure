public class SmartPhone extends Phone {
    @Override
    void browse() {
        System.out.println("I can browse with a smart phone");
    }

    @Override
    void call() {
        super.call();
        System.out.println("I can make call");
    }
}
