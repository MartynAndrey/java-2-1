public class Main {
    public static void main(String[] args) {
        double ticketPrice = 485.9;
        double bonusMileCost = 20;

        if (ticketPrice <= 0) {
            System.out.println("The price of ticket cannot be less than zero.");
            return;
        }
        if (bonusMileCost <= 0) {
            System.out.println("The cost of one bonus mile cannot be less than zero.");
            return;
        }

        int bonusMileCount = (int)(ticketPrice / bonusMileCost);
        System.out.println("The count of bonus miles = " + bonusMileCount);
    }
}
