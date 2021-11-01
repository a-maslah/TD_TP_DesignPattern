package Robotic;

public class AppTest {
    public static void main(String[] args) {
        Robotic robotic = new RoboticImpl();
        System.out.println("------------------");
        robotic.doActivty();
        System.out.println("------------------");
        robotic.cook();
        robotic.doActivty();

        System.out.println("------------------");
        robotic.walk();
        robotic.doActivty();
        robotic.cook();
        robotic.doActivty();
        System.out.println("------------------");

        robotic.off();
        robotic.doActivty();
        robotic.cook();
        System.out.println("------------------");

        robotic.walk();
        robotic.doActivty();
        robotic.off();
        robotic.doActivty();

    }
}
