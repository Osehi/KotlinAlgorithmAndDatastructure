package systeminteraction;

import java.util.Scanner;

public class Start {

    public static void main(String[] args){
        String s = "Hello Osehi";
        Scanner scan = new Scanner(s);
        System.out.println("Boolean Result: " + scan.hasNext());
        // print the String
        System.out.println("The content: " + scan.nextLine());
        scan.close();
        System.out.println("-----Enter your Details ----");
        Scanner in = new Scanner(System.in);
        // ask for his name
        System.out.print("Enter your name: ");
        // receive the name:
        String name = in.next();
        System.out.println("Name: " + name);
        // I need something else
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        System.out.println("Age: " + age);
        // I need your salary info
        System.out.print("Please enter salary: ");
        double d = in.nextDouble();
        System.out.println("Your salary: " + d);
        in.close();
    }
}
