package pattern.behavioral.strategy.npc;

public class NpcApplication {
    public NpcApplication() {
        NonPlayerCharacter cityGuard = new NonPlayerCharacter("Bob", "Guards", new GuardStrategy());

        System.out.println("\nLook on NPC and check it profession");
        cityGuard.getProfession();
        System.out.println("\n Try to speak with NPC");
        cityGuard.onPlayerSpeak();
        System.out.println("\n Try to kill NPC");
        cityGuard.onAttack();
        System.out.println("\n NPC killed");
        cityGuard.onDie();


        NonPlayerCharacter cityTrader = new NonPlayerCharacter("James", "Traders", new TraderStrategy());
        System.out.println("\n Look on new NPC and check it profession");
        cityTrader.getProfession();
        System.out.println("\n Try to speak with NPC");
        cityTrader.onPlayerSpeak();
        System.out.println("\n We buy all the goods and NPC becomes a citizen.");
        cityTrader.setBehavior(new CitizenStrategy());
        System.out.println("\n Check it profession again");
        cityTrader.getProfession();
        System.out.println("\n Try to speak with NPC");
        cityTrader.onPlayerSpeak();
        System.out.println("\n Try to kill NPC");
        cityTrader.onAttack();
        System.out.println("\n NPC killed");
        cityTrader.onDie();
    }
}
