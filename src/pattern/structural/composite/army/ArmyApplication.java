package pattern.structural.composite.army;

public class ArmyApplication {
    public ArmyApplication() {
        System.out.println("ArmyApplication");
        UnitSquad marine = new UnitSquad("Sea Wolves", "Machinegun, heavy machinegun, LWCMS mortar...");
        marine.add(new Unit("Bob", "PFC", 1));
        marine.add(new Unit("Alex", "PFC", 3));
        marine.add(new Unit("Andrew", "CPL", 5));
        marine.add(new Unit("Travis", "SGT", 7));

        UnitSquad infantry = new UnitSquad("Tigers", "Primarily foot-mobile, usually transported by motorized assets...");
        infantry.add(new Unit("Noah", "PV2", 1));
        infantry.add(new Unit("Liam", "SPC", 3));
        infantry.add(new Unit("Mason", "SPC", 3));
        infantry.add(new Unit("Jacob", "PV2", 2));
        infantry.add(new Unit("William", "PV2", 2));
        infantry.add(new Unit("Ethan", "SGT", 8));

        UnitComponent allSquads = new UnitSquad("All available units", "Every unit Available");
        allSquads.add(marine);
        allSquads.add(infantry);

        Army firstArmy = new Army(allSquads);
        firstArmy.getArmyList();
        System.out.println("\n");
    }
}
