import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();

            double finalAmount;

            if (type.equals("CARD"))
                finalAmount = amount * 1.02;
            else if (type.equals("WALLET"))
                finalAmount = amount * 1.01;
            else
                finalAmount = amount;

            System.out.printf("%s: %.2f%n", type, finalAmount);
            total += finalAmount;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}