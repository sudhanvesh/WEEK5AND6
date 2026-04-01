import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        double total = 0.0;
        int i = 0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            if (input <= 0) {
                break;
            }

            arr[i] = input;
            i++;

            if (i == 10) {
                break;
            }
        }

        // Display + Sum
        for (int j = 0; j < i; j++) {
            System.out.println("Value " + (j + 1) + " = " + arr[j]);
            total += arr[j];
        }

        System.out.println("Total = " + total);

        sc.close();
    }
}