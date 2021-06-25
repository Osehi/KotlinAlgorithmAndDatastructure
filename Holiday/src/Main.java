public class Main {

    public static void main(String[] args){
        Holiday one = new Holiday("salah", 5, "July");
        Holiday two = new Holiday("Princess", 14, "July");
        System.out.println(one.myMonth());
        System.out.println(Holiday.inSameMonth(one.myMonth(), two.myMonth()));

    }

}
