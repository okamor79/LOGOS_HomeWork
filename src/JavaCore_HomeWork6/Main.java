package JavaCore_HomeWork6;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.setName("ROBOT");
        robot.work();
        CoffeRobot coffeRobot = new CoffeRobot();
        coffeRobot.setName("CoffeRobot");
        coffeRobot.work();
        RobotDancer robotDancer = new RobotDancer();
        robotDancer.setName("RobotDancer");
        robotDancer.work();
        RobotCoocker robotCooker = new RobotCoocker();
        robotCooker.setName("RobotCoocker");
        robotCooker.work();


    }
}
