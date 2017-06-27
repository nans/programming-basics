package pattern.behavioral.chainOfResponsibility.notifier;

public class CollectorNotifierApplication {

    public CollectorNotifierApplication() {
        Notifier catalogNotifier = new CatalogNotifier(Rarity.POPULAR);
        Notifier emailNotifier = new EmailNotifier(Rarity.RARE);
        Notifier smsNotifier = new SMSNotifier(Rarity.EXTREMELY_RARE);
        Notifier phoneNotifier = new PhoneNotifier(Rarity.UNIQUE);

        catalogNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);
        smsNotifier.setNextNotifier(phoneNotifier);

        System.out.println("\nFound a silver coin (1995)");
        catalogNotifier.notifyCollector("Found a silver coin (Year: 1995)", Rarity.POPULAR);


        System.out.println("\nFound a golden coin (995)");
        catalogNotifier.notifyCollector("Found a golden coin (Year: 995)", Rarity.RARE);

        System.out.println("\nFound a sword (1st century BC)");
        catalogNotifier.notifyCollector("Found a sword (1st century BC)", Rarity.EXTREMELY_RARE);

        System.out.println("\nFound jewelery (2st century BC)");
        catalogNotifier.notifyCollector("Found jewelery (2st century BC)", Rarity.UNIQUE);

    }
}
