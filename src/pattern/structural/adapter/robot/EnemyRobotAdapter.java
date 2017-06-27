/*
 * Author: Derek Banas
 * http://www.newthinktank.com/2012/09/adapter-design-pattern-tutorial/
 */
package pattern.structural.adapter.robot;

public class EnemyRobotAdapter implements EnemyAttacker{

    EnemyRobot theRobot;

    public EnemyRobotAdapter(EnemyRobot newRobot){

        theRobot = newRobot;

    }

    public void fireWeapon() {

        theRobot.smashWithHands();

    }

    public void driveForward() {

        theRobot.walkForward();

    }

    public void assignDriver(String driverName) {

        theRobot.reactToHuman(driverName);

    }



}
