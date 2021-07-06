public class Car {
    // fields or properties
    private String type;
    private String model;
    private String color;
    private int speed;

    // constructor
    public Car(String type, String model, String color, int speed){
        this.type = type;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    // add getter and setter
    // to protect the the state of my properties
    // modifiers like "private"
    // for me to access it I must use getter and setter

    // getter for type
    public String getType(){
        return type;
    }

    // setter type
    public void setType(String type){
        this.type = type;
    }

    // getter for model
    public String getModel(){
        return model;
    }

    // setter for model
    public void setModel(String model){
        this.model = model;
    }

    // getter for color
    public String getColor(){
        return color;
    }

    // setter for color
    public void setColor(String color){
        this.color = color;
    }

    // getter for speed
    public int getSpeed(){
        return speed;
    }

    // setter for speed
    public void setSpeed(int speed){
        this.speed = speed;
    }
}
