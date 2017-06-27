/*
 * Author: Derek Banas
 * http://www.newthinktank.com/2012/09/builder-design-pattern-tutorial/
 */
package pattern.creational.builder.robot;

public class OldRobotBuilder implements RobotBuilder {
    private Robot robot;

    public OldRobotBuilder() {
        robot = new Robot();
    }

    public void buildRobotHead() {
        robot.setRobotHead("Tin Head");
    }

    public void buildRobotTorso() {
        robot.setRobotTorso("Tin Torso");
    }

    public void buildRobotArms() {
        robot.setRobotArms("Blowtorch Arms");
    }

    public void buildRobotLegs() {
        robot.setRobotLegs("Rollar Skates");
    }

    public Robot getRobot() {
        return robot;
    }
}
