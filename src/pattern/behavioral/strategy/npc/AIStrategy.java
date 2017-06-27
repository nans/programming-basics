package pattern.behavioral.strategy.npc;

public interface AIStrategy {
    public String onAttack();
    public String onPlayerSpeak();
    public String onDie();
    public String profession();
}
