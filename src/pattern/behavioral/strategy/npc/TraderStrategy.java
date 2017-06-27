package pattern.behavioral.strategy.npc;

public class TraderStrategy implements AIStrategy {
    public String onAttack() {
        return "Call guards.";
    }

    public String onPlayerSpeak() {
        return "Show products.";
    }

    public String onDie() {
        return "Drop goods.";
    }

    public String profession() {
        return "Trader";
    }
}
