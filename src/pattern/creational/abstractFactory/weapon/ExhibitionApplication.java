package pattern.creational.abstractFactory.weapon;

public class ExhibitionApplication {
    public ExhibitionApplication(){
        IMachineGunExhibition factory = new MinigunM134Factory();
        IMachineGun minigunM134 = factory.createWeapon();
        minigunM134.printSpecifications();

        factory = new NegevFactory();
        IMachineGun negev = factory.createWeapon();
        negev.printSpecifications();
    }
}
