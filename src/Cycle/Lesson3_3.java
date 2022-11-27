package Cycle;
import java.util.Scanner;

public class Lesson3_3 {
    public static void main(String[] args) {
        sum_of_numbers();
    }

    public static void sum_of_numbers() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number,please.");
        int number = scanner.nextInt();
            for (int i = 0; i <= number; i++) {
                sum += i;
            }
            if (number>0) {
                System.out.println("Sum of numbers:" + sum);
            } else System.out.println("This number is negative.");
        }
    }
