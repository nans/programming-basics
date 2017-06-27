package pattern.structural.composite.unit;

public class UnitApplication {
    public UnitApplication() {
        System.out.println("UnitApplication");

        Soldier soldier1 = new Soldier();
        Soldier soldier2 = new Soldier();
        Soldier soldier3 = new Soldier();
        Soldier soldier4 = new Soldier();

        Commando commando1 = new Commando();
        Commando commando2 = new Commando();
        Commando commando3 = new Commando();
        Commando commando4 = new Commando();

        CompositeUnit solders = new CompositeUnit();
        solders.add(soldier1);
        solders.add(soldier2);
        solders.add(soldier3);
        solders.add(soldier4);

        CompositeUnit commandos = new CompositeUnit();
        commandos.add(commando1);
        commandos.add(commando2);
        commandos.add(commando3);
        commandos.add(commando4);

        CompositeUnit army = new CompositeUnit();
        army.add(solders);
        army.add(commandos);
        army.description();
        System.out.println("\n");
    }
}
