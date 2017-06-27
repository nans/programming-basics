package pattern.structural.composite.army;

import java.util.ArrayList;

public class UnitSquad extends UnitComponent {
    private ArrayList unitComponents = new ArrayList();

    private String squadTitle;
    private String squadDescription;

    public UnitSquad(String newSquadTitle, String newSquadDescription) {
        squadTitle = newSquadTitle;
        squadDescription = newSquadDescription;
    }

    public String getSquadTitle() {
        return squadTitle;
    }

    public String getSquadDescription() {
        return squadDescription;
    }

    public void add(UnitComponent newUnit) {
        unitComponents.add(newUnit);
    }

    public void remove(UnitComponent newUnit) {
        unitComponents.remove(newUnit);
    }

    public UnitComponent getComponentByIndex(int componentIndex) {
        return (UnitComponent) unitComponents.get(componentIndex);
    }

    public void displayUnitInfo(){
        System.out.println(getSquadTitle() + " - " + getSquadDescription() + "\n");
        for (Object unitComponent : unitComponents) {
            ((UnitComponent)unitComponent).displayUnitInfo();
        }
        System.out.println("\n");
    }
}
