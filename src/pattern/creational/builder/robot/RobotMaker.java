/*
 * Author: Derek Banas
 * http://www.newthinktank.com/2012/09/builder-design-pattern-tutorial/
 */
package pattern.creational.builder.robot;

public class RobotMaker {
    public RobotMaker() {
        RobotBuilder oldStyleRobot = new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);
        robotEngineer.makeRobot();
        Robot firstRobot = robotEngineer.getRobot();
        System.out.println("Robot Built");
        System.out.println("Robot Head Type: " + firstRobot.getRobotHead());
        System.out.println("Robot Torso Type: " + firstRobot.getRobotTorso());
        System.out.println("Robot Arm Type: " + firstRobot.getRobotArms());
        System.out.println("Robot Leg Type: " + firstRobot.getRobotLegs());
    }
}
