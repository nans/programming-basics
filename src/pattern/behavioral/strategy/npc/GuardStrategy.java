package pattern.behavioral.strategy.npc;

public class GuardStrategy implements AIStrategy {
    public String onAttack() {
        return "Attack the enemy. Increase the reward for the enemy's head.";
    }

    public String onPlayerSpeak() {
        return "To do nothing.";
    }

    public String onDie() {
        return "Drop armor and weapon.";
    }

    public String profession() {
        return "Guard";
    }
}
