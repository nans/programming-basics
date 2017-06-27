package pattern.structural.composite.unit;

import java.util.ArrayList;
import java.util.List;

public class CompositeUnit implements Unit {
    private List<Unit> childUnits = new ArrayList<Unit>();

    public void description() {
        childUnits.forEach(Unit::description);
    }

    public void add(Unit unit) {
        childUnits.add(unit);
    }

    public void remove(Unit unit) {
        childUnits.remove(unit);
    }
}
