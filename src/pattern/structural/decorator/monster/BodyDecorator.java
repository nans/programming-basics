package pattern.structural.decorator.monster;

public class BodyDecorator extends MonsterDecorator {
    public BodyDecorator(Monster newMonsterToBeDecorated) {
        super(newMonsterToBeDecorated);
    }

    @Override
    public int armor(){
        return super.armor() + 5;
    }

    @Override
    public String extremity() {
        return super.extremity() + "body;";
    }
}
