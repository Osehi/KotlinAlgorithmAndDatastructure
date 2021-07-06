package operabilitykotlinjava;

public class Customer {
    private String firstName;
    private String lastName;
    private int age;

    // constructor
    public Customer(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // firstName getter
    public String getFirstName(){
        return firstName;
    }

    // firstName setter
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    // lastName getter
    public String getLastName(){
        return lastName;
    }

    // lastName setter
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    // age getter
    public int getAge(){
        return age;
    }

    // age setter
    public void setAge(int age){
        this.age = age;
    }
}


