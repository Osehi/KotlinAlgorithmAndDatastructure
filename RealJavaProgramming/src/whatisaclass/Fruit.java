package whatisaclass;

public class Fruit {
    String name;

    public Fruit(String name){
        this.name = name;
    }

    public static void main(String[] args){
        Fruit apple = new Fruit("Apple");
        Fruit orange = new Fruit("Orange");
        Fruit grape = new Fruit("Grape");
        System.out.println(apple.name);
        System.out.println(orange.name);
        System.out.println(grape.name);
    }

}

