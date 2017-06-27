package pattern.creational.abstractFactory.weapon;

public class NegevFactory implements IMachineGunExhibition {
    public IMachineGun createWeapon() {
        return new Negev();
    }
}
