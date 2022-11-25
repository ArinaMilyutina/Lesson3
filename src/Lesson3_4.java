import java.util.Scanner;

public class Lesson3_4 {
    public static void main(String[]args){
        Temperature();
    }
    public static void Temperature(){
        System.out.println("Enter the temperature,please.");
        Scanner scanner=new Scanner(System.in);
        int t= scanner.nextInt();
        if(t>-5){
            System.out.println("Warm weather.");
        }
        else if(t<=-5&&t<-20){
            System.out.println("Normal weather.");
        }
        else if (-20<=t){
            System.out.println("Cold weather.");
        }
        System.out.println("End of the method.");
    }
}
