/*
 * Author: Derek Banas
 * http://www.newthinktank.com/2012/09/builder-design-pattern-tutorial/
 */
package pattern.creational.builder.robot;

public interface RobotPlan {
    public void setRobotHead(String head);
    public void setRobotTorso(String torso);
    public void setRobotArms(String arms);
    public void setRobotLegs(String legs);
}
