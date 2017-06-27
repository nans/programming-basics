package pattern.structural.decorator.monster;

public class LegDecorator extends MonsterDecorator {
    private String side;
    private int size;

    public LegDecorator(Monster newMonsterToBeDecorated, String newSide, int newSize) {
        super(newMonsterToBeDecorated);
        side = newSide;
        size = newSize;
    }

    @Override
    public int armor() {
        return super.armor() + 2 * size;
    }

    @Override
    public String extremity() {
        return super.extremity() + side + " leg with " + size + " size;";
    }
}
