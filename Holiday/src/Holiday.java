public class Holiday {

    // properties
    private String name;
    private int day;
    private String month;

    // constructor
    public Holiday(String name, int day, String month){
        this.name = name;
        this.day = day;
        this.month = month;
    }

    // add getter
    public String myMonth(){
        return this.month;
    }

    // method inSameMonth; I had to make it static and it worked
    // I was able to access my months, two different months
    // the getter was a safer
    public static Boolean inSameMonth(String month1, String month2){
        if (month1 == month2){
            return true;
        } else {
            return false;
        }
    }

    // method avgDate
    public double avgDate(Holiday[] arr){
        // to get the average of day variable
        // use a loop to get content in the array and sum
        int sum = 0;
        double avgDate = 0.0;
        for (int i= 0; i <= arr.length; i++){
            // the instance of holiday
            sum+= arr[i].day;
            avgDate = sum / arr.length;
        }
        return avgDate;
    }

    // this generates an independence day code
    public void independenceHoliday(){
        String name = "Independence Day";
        int day = 4;
        String month = "July";
        Holiday independenceDay = new Holiday(name, day, month);
        System.out.println("Here is the holiday instance: " + independenceDay);
    }

}
