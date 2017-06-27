package pattern.structural.composite.army;

public class Unit extends UnitComponent {
    private String name;
    private String rank;
    private int experience;

    public Unit(String newName, String newRank, int newExperience) {
        name = newName;
        rank = newRank;
        experience = newExperience;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public int getExperience() {
        return experience;
    }

    public void displayUnitInfo() {
        System.out.println(getName() + " (" + getRank() + ")" + " has combat experience in " + getExperience() + " years.");
    }
}
