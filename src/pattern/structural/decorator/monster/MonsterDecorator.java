package pattern.structural.decorator.monster;

public class MonsterDecorator implements Monster {
    protected Monster monsterToBeDecorated;

    public MonsterDecorator(Monster newMonsterToBeDecorated) {
        monsterToBeDecorated = newMonsterToBeDecorated;
    }

    public int armor() {
        return monsterToBeDecorated.armor();
    }

    public String extremity() {
        return monsterToBeDecorated.extremity();
    }

    public String name() {
        return monsterToBeDecorated.name();
    }
}
