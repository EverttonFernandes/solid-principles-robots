package solid.principles.srp.good.driver;

public class DriverRobot {

    private String name;

    public DriverRobot(String name) {
        this.name = name;
    }

    public static void robotPresentation (){
        System.out.println("Hello my name is: ");
        System.out.println("I am a driver");
    }

}
