package whatisaclass;

import java.util.Scanner;

public class Car {
    // properties
    String name;
    // the constructor
    public Car(String name){
        this.name = name;
    }

    public static void main(String[] args){
//        Car volvo = new Car("Volvo");
//        System.out.println(volvo.name);

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a variable name for your object");
//        String name = in.nextLine();
//        // use the given variable name to create an instance
//        Car givenNameOfObject = new Car(name);
//        System.out.println("My object is: " + givenNameOfObject.name);
//        in.close();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = in.nextLine();
        System.out.println("This is my name " + name);
    }
}
