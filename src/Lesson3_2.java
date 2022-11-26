import java.util.Scanner;

public class Lesson3_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount of money:");
        float money = in.nextFloat();
        System.out.print("Enter the period:");
        int period = in.nextInt();

        for(int i = 1; i <= period; i++){
            money += money * 0.07;
        }
        System.out.printf("After %d month the deposit amount will be %f", period, money);
    }
}