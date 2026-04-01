import java.util.Scanner;

public class Friendsname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] age = new int[3];
        double[] height = new double[3];
        String[] name = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + name[i] + ": ");
            age[i] = sc.nextInt();

            System.out.print("Enter height of " + name[i] + ": ");
            height[i] = sc.nextDouble();
        }

        int min = 0, max = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[min])
                min = i;

            if (height[i] > height[max])
                max = i;
        }

        System.out.println("Youngest: " + name[min]);
        System.out.println("Tallest: " + name[max]);

        sc.close();
    }
}