package Task4.Present;

public class MainPresent {
    public static void main(String[] args) {
        int totalCost1 = 0, totalCost2 = 0;
        int totalWeight1 = 0, totalWeight2 = 0;
        Candy candy1 = new Candy("Candyname1", 100, 50, "Caramel");
        Candy candy2 = new Candy("Candyname2", 50, 30, "Barbariska");
        JellyBean jBean1 = new JellyBean("JBeanname1", 80, 50, "Fruit");
        JellyBean jBean2 = new JellyBean("JBeanname2", 30, 50, "Fresh");
        Chocolate choc1 = new Chocolate("Chocname1", 100, 100, "Dark");
        Chocolate choc2 = new Chocolate("Chocname2", 100, 100, "White");

        Sweets[] present1 = {candy1, jBean1, choc1};
        Sweets[] present2 = {candy2, jBean2, choc2};

        for (Sweets present:present1) {
            totalCost1 += present.getPrice()*present.getWeight();
            totalWeight1 += present.getWeight();
        }
        for (Sweets present:present2) {
            totalCost2 += present.getPrice()*present.getWeight();
            totalWeight2 += present.getWeight();
        }

        System.out.println("Состав первого подарка:");
        for (Sweets present:present1) {
            System.out.println(present.getName());
        }
        System.out.println("Вес подарка: " + totalWeight1 + "\n" + "Стоимость подарка: " + totalCost1);


        System.out.println("\nСостав второго подарка:");
        for (Sweets present:present2) {
            System.out.println(present.getName());
        }
        System.out.println("Вес подарка: " + totalWeight2 + "\n" + "Стоимость подарка: " + totalCost2);


    }
}
