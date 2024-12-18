package BuilderDesignPattern;

public class TestRobotBuilder {
    public static void main(String[] args) {
        RobotBuilder OldstyleRobot = new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(OldstyleRobot);

        robotEngineer.makeRobot();

        Robot firstRobot = robotEngineer.getRobot();

        System.out.println("Robot Built");

        System.out.println("Robot Head Type : "+firstRobot.getRobotHead());
        System.out.println("Robot Head Type : "+firstRobot.getRobotTorso());
        System.out.println("Robot Head Type : "+firstRobot.getRobotArms());
        System.out.println("Robot Head Type : "+firstRobot.getRobotLegs());
    }

}
