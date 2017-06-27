package pattern.structural.decorator.monster;

public class MonsterWithHead implements Monster {
    private String name;

    public MonsterWithHead(String newName) {
        name = newName;
    }

    public int armor() {
        return 1;
    }

    public String extremity() {
        return "head;";
    }


    public String name() {
        return name;
    }
}
