public class LandPhone extends Phone {
    @Override
    void browse() {
        System.out.println("I cannot browse with Land Phone");
    }

    @Override
    void call() {
        super.call();
        System.out.println("I can make call");
    }
}
