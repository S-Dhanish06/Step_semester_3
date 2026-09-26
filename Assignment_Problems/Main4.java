import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            double salary = sc.nextDouble();

            double bonus;

            if (type.equals("FULLTIME"))
                bonus = salary * 0.10;
            else if (type.equals("PARTTIME"))
                bonus = salary * 0.05;
            else
                bonus = 2000;

            System.out.printf("%s: %.2f%n", name, bonus);
            total += bonus;
        }

        System.out.printf("Total Bonus: %.2f%n", total);
    }
}