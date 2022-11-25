import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lesson3_1 {
    public static void main(String[] args) throws IOException {
        int number = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (number != 100) {
            System.out.println("Enter the month number,please.To end the method,enter the number 100.");
            number = Integer.parseInt(reader.readLine());
            switch (number) {
                case 1:
                    System.out.println("It's January!");
                    break;
                case 2:
                    System.out.println("It's February!");
                    break;
                case 3:
                    System.out.println("It's March!");
                    break;
                case 4:
                    System.out.println("It's April!");
                    break;
                case 5:
                    System.out.println("It's May!");
                    break;
                case 6:
                    System.out.println("It's June!");
                    break;
                case 7:
                    System.out.println("It's July!");
                    break;
                case 8:
                    System.out.println("It's August!");
                    break;
                case 9:
                    System.out.println("It's September!");
                    break;
                case 10:
                    System.out.println("It's October!");
                    break;
                case 11:
                    System.out.println("It's November!");
                    break;
                case 12:
                    System.out.println("It's December!");
                    break;
                case 100:
                    System.out.println("The end.");
                    break;
                default:
                    System.out.println("Error,there is no such month!!!");

            }

        }
        System.out.println("\nEnd of the method.");
    }
}
