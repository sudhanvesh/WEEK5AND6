import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int largest = 0, second = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit > largest) {
                second = largest;
                largest = digit;
            } else if (digit > second && digit != largest) {
                second = digit;
            }

            num = num / 10;
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + second);

        sc.close();
    }
}