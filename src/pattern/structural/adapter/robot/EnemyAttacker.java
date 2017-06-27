/*
 * Author: Derek Banas
 * http://www.newthinktank.com/2012/09/adapter-design-pattern-tutorial/
 */
package pattern.structural.adapter.robot;

public interface EnemyAttacker {
    public void fireWeapon();
    public void driveForward();
    public void assignDriver(String driverName);
}
