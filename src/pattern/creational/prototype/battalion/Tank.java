package pattern.creational.prototype.battalion;

public class Tank implements Armor {
    private String type;
    private int power;
    private int weight;

    public void setGroup(int group) {
        this.group = group;
    }

    private String name;

    public String getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    private int group;

    public Tank(String name, int weight, int power, String type, int group) {
        this.name = name;
        this.weight = weight;
        this.power = power;
        this.type = type;
        this.group = group;
    }

    public void printDescription() {
        System.out.println("Tank type " + getType() + ", name: " + getName() + ", group " + getGroup());
    }

    public Armor makeCopy() throws CloneNotSupportedException {
        return (Armor) super.clone();
    }
}
