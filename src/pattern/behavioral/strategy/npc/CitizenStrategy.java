package pattern.behavioral.strategy.npc;

public class CitizenStrategy implements AIStrategy {
    public String onAttack() {
        return "Call guards and run away.";
    }

    public String onPlayerSpeak() {
        return "Say hello.";
    }

    public String onDie() {
        return "Drop money.";
    }

    public String profession() {
        return "Citizen";
    }
}
