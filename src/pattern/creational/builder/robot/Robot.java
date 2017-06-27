/*
 * Author: Derek Banas
 * http://www.newthinktank.com/2012/09/builder-design-pattern-tutorial/
 */
package pattern.creational.builder.robot;

public class Robot implements RobotPlan {
    private String robotHead;
    private String robotArms;
    private String robotTorso;
    private String robotLegs;

    public String getRobotHead() {
        return robotHead;
    }

    public String getRobotArms() {
        return robotArms;
    }

    public String getRobotTorso() {
        return robotTorso;
    }

    public String getRobotLegs() {
        return robotLegs;
    }

    public void setRobotHead(String head) {
        robotHead = head;
    }

    public void setRobotTorso(String torso) {
        robotTorso = torso;
    }

    public void setRobotArms(String arms) {
        robotArms = arms;
    }

    public void setRobotLegs(String legs) {
        robotLegs = legs;
    }
}
