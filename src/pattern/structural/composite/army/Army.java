package pattern.structural.composite.army;

public class Army {
    private UnitComponent unitList;

    public Army(UnitComponent newUnitList) {
        unitList = newUnitList;
    }

    public void getArmyList() {
        unitList.displayUnitInfo();
    }
}
