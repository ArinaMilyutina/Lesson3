package ControlStructures;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lesson3_5 {
    public static void main(String[] args) throws IOException {
        int number=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (number!=8) {
            System.out.println("Enter the number,please.To end the method,enter the number 8.");

            number = Integer.parseInt(reader.readLine());

            switch (number) {
                case 1:
                    System.out.println("Red.");
                    break;
                case 2:
                    System.out.println("Orange.");
                    break;
                case 3:
                    System.out.println("Yellow.");
                    break;
                case 4:
                    System.out.println("Green.");
                    break;
                case 5:
                    System.out.println("Cyan.");
                    break;
                case 6:
                    System.out.println("Blue.");
                    break;
                case 7:
                    System.out.println("Purple.");
                    break;
                case 8:
                    System.out.println("The end.");
                    break;
                default:
                    System.out.println("Error,please enter the number again.!");

            }
        }
        System.out.println("End of the method.");
    }
}

