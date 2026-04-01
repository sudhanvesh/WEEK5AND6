import java.util.Scanner;

public class BonusEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalBonus = 0, totalOld = 0, totalNew = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            System.out.print("Enter years: ");
            int years = sc.nextInt();

            double bonus;

            if (years > 5)
                bonus = salary * 0.05;
            else
                bonus = salary * 0.02;

            double newSalary = salary + bonus;

            totalBonus += bonus;
            totalOld += salary;
            totalNew += newSalary;
        }

        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOld);
        System.out.println("Total New Salary = " + totalNew);

        sc.close();
    }
}