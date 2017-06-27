/*
 * Author: Derek Banas
 * http://www.newthinktank.com/2012/09/builder-design-pattern-tutorial/
 */
package pattern.creational.builder.robot;

public class RobotEngineer {
    private RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder newRobotBuilder) {
        robotBuilder = newRobotBuilder;
    }

    public Robot getRobot() {
        return robotBuilder.getRobot();
    }

    public void makeRobot() {
        robotBuilder.buildRobotArms();
        robotBuilder.buildRobotHead();
        robotBuilder.buildRobotLegs();
        robotBuilder.buildRobotTorso();
    }
}
