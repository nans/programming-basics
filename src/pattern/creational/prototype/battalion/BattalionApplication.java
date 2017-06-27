package pattern.creational.prototype.battalion;

public class BattalionApplication {
    public BattalionApplication() {
        Tank t34Unit1 = new Tank("T-34", 32000, 500, "medium", 1);
        System.out.println("Unit 1:");
        t34Unit1.printDescription();

        try {
            Tank t34Unit2 = (Tank) t34Unit1.makeCopy();
            System.out.println("Unit 2:");
            t34Unit2.printDescription();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        try {
            Tank t34Unit3 = (Tank) t34Unit1.makeCopy();
            System.out.println("Unit 3:");
            t34Unit3.printDescription();
            t34Unit3.setGroup(2);
            System.out.println("Unit 3 with new group:");
            t34Unit3.printDescription();
            System.out.println("Unit 1:");
            t34Unit1.printDescription();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
