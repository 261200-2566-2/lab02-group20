// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AirPurifier myAirPurifier = new AirPurifier("ModelZ", "650610791");
        myAirPurifier.TurnOnTime(5);
        myAirPurifier.TurnOffTime(6);
        myAirPurifier.turnOn();
        myAirPurifier.setSpeed(75);
        myAirPurifier.setSpeed(101);
        myAirPurifier.turnOn();
        myAirPurifier.setSpeed(10);
        System.out.println(myAirPurifier.model);
        System.out.println(myAirPurifier.serialNo);
        System.out.println(myAirPurifier.speed);
        System.out.println(AirPurifier.mostmade());
        System.out.println(AirPurifier.PopColour);
        myAirPurifier.turnOff();
    }
}