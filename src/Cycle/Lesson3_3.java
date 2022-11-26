package Cycle;
import java.util.Scanner;

public class Lesson3_3 {
    public static void main(String[] args) {
        SumOfNumbers();
    }

    public static void SumOfNumbers() {
        int sum = 0;
        int c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number,please.To end the method,enter the number 0.");
        int number = scanner.nextInt();
        c = number % 2;
            for (int i = 0; i <= number; i++) {
                sum += i;
            }
            if (c == 0) {
                System.out.println("Sum of numbers:" + sum);
            } else System.out.println("This number is uneven:");
        }
    }
