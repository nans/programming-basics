package pattern.creational.abstractFactory.wiki;

public class ProductB1 implements AbstractProductB {
    @Override
    public void interact(AbstractProductA a) {
        System.out.println(this.getClass().getName() + " interacts with " + a.getClass().getName());
    }
}
