public class JavaExceptionExample {

    public static void main(String[] args){

        try {
            int data = (100/0); // this gives an exception
            // int data = (100/2) no error
            System.out.println(data);
        } catch (ArithmeticException e){
            System.out.println("rest of the code..");
        }

    }

}
// the example of a delivery service; aimed to deliver a parcel
// to edo-tech-park on Monday 28-June-2021
// there was a failure in the delivery
// an Error Handling company stepped in to handle that failure
// and ensure it was delivered.
// That Error handling company is the same as handling
// Exceptions in Java.
