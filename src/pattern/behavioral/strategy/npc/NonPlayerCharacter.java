package pattern.behavioral.strategy.npc;

public class NonPlayerCharacter {
    private String npcName;
    private String guildName;

    public void setBehavior(AIStrategy npcBehavior) {
        this.npcBehavior = npcBehavior;
    }

    private AIStrategy npcBehavior;

    public NonPlayerCharacter(String newName, String newGuildName, AIStrategy newBehavior) {
        npcName = newName;
        guildName = newGuildName;
        npcBehavior = newBehavior;
    }

    public void onAttack() {
        System.out.println(npcName + " from guild " + guildName + " was attacked and try: " + npcBehavior.onAttack());
    }

    public void onPlayerSpeak() {
        System.out.println("When user speak with " + npcName + " from guild " + guildName + ", NPC try: " + npcBehavior.onPlayerSpeak());
    }

    public void onDie() {
        System.out.println("When " + npcName + " from guild " + guildName + " died - " + npcBehavior.onDie());
    }

    public void getProfession() {
        System.out.println(npcName + " profession is " + npcBehavior.profession());
    }
}
