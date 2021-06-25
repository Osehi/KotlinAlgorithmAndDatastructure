public class CellPhone extends Phone {
    @Override
    void browse() {
        System.out.println("I cannot browse with cell phone");
    }

    @Override
    void call() {
        super.call();
        System.out.println("I can make call");
    }
}
