import java.util.Scanner;

public class Lesson3_3 {
    public static void main(String[]args){
        EvenNumber();
    }
    public static void EvenNumber(){
        System.out.println("Enter the number,please.");
        Scanner scanner=new Scanner(System.in);
        int number = scanner.nextInt();
        int remainder=number%2;
         {
            if (remainder==0){
                System.out.println("An even number.");
            }
            else
                System.out.println("An uneven number.");
        }
        System.out.println("End of the method.");
    }
}
