import java.time.LocalTime;
public class AirPurifier {
    LocalTime current = LocalTime.now();
    String model;
    String serialNo;
    int speed;
    boolean power;
    //Set the speed to a range of 1 to 100.
    void setSpeed(int speed){
        if(power){
            if (speed >= 1 && speed <= 100) {
                this.speed = speed;
                System.out.println("Air purifier speed set to: " + speed);
            } else {
                //Warning if the speed is more than 100 or less than 1.
                System.out.println("Speed must be in the range of 1 to 100.");
            }
        } else {
            System.out.println("Cannot set speed when the air purifier is off.");
        }

    }
    //Turn on
    void turnOn(){power=true;
        System.out.println("Air purifier turned on.");}
    //Turn off
    void turnOff(){power=false;
        System.out.println("Air purifier turned off.");}
    //Set the turn-on time.
    void TurnOnTime(int time){
        if(!power && current.plusHours(time).equals(LocalTime.now()))turnOn();
        System.out.println("Turned on at " + current.plusHours(time));
    }
    //Set the turn-off time.
    void TurnOffTime(int time){
        if(power && current.plusHours(time).equals(LocalTime.now()))turnOff();
        System.out.println("Turned off at " + current.plusHours(time));
    }
    //Set model name , serial number , colour and most made.
    AirPurifier (String model,String serialNo){
        this.model = model;
        this.serialNo = serialNo;
    }
    static  String PopColour = "White";
    static  String mostmade() {return "Blueair";}
}
