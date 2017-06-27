/*
 * Author: Derek Banas
 * http://www.newthinktank.com/2012/09/builder-design-pattern-tutorial/
 */
package pattern.creational.builder.robot;

public interface RobotBuilder {
    public void buildRobotHead();
    public void buildRobotTorso();
    public void buildRobotArms();
    public void buildRobotLegs();
    public Robot getRobot();
}
