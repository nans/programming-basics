/*
 * Author: Derek Banas
 * http://www.newthinktank.com/2012/09/factory-design-pattern-tutorial/
 */
package pattern.creational.factory.ufo;

public class RocketEnemyShip extends EnemyShip {

    public RocketEnemyShip(){
        setName("Rocket Enemy Ship");
        setDamage(10.0);
    }
}
