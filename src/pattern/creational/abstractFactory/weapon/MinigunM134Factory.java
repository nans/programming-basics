package pattern.creational.abstractFactory.weapon;

public class MinigunM134Factory implements IMachineGunExhibition {
    public IMachineGun createWeapon() {
        return new MinigunM134();
    }
}
