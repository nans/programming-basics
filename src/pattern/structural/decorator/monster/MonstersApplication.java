package pattern.structural.decorator.monster;

import java.util.ArrayList;

public class MonstersApplication {
    public MonstersApplication() {
        System.out.println("MonstersApplication");
        //decorator
        ArrayList<Monster> monstersList = new ArrayList<>();
        monstersList.add(new LegDecorator(new LegDecorator(new HandDecorator(new HandDecorator(new BodyDecorator(new MonsterWithHead("Frankenstein")), "left"), "right"), "right", 1), "left", 2));
        monstersList.add(new HandDecorator(new HandDecorator(new BodyDecorator(new MonsterWithHead("Zombie")), "left"), "right"));
        monstersList.add(new MonsterWithHead("ZombieLoaf"));

        Monster theHardMonster = monstersList.get(0);

        for (int i = 1; i < monstersList.size(); i++) {
            System.out.println("Test " + monstersList.get(i).name() + " - armor: " + monstersList.get(i).armor() + "; extremity: " + monstersList.get(i).extremity());
            if (monstersList.get(i).armor() > theHardMonster.armor()) {
                theHardMonster = monstersList.get(i);
            }
        }

        System.out.println("The Hard Monster is " + theHardMonster.name() + " with armor: " + theHardMonster.armor());
        System.out.println("\n");
    }
}
