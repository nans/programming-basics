package pattern.structural.decorator.monster;

public class HandDecorator extends MonsterDecorator {
    private String side;
    public HandDecorator(Monster newMonsterToBeDecorated, String newSide) {
        super(newMonsterToBeDecorated);
        this.side = newSide;
    }

    @Override
    public int armor() {
        return super.armor() + 1;
    }

    @Override
    public String extremity() {
        return super.extremity() + side + " hand;";
    }
}
