package ControlStructures;
import java.util.Scanner;
public class Lesson3_2 {
public static void main(String[]args){
    TimeOfYear();

}
public static void TimeOfYear(){
System.out.println("Enter the number month,please.");
    Scanner scanner=new Scanner(System.in);
    int number= scanner.nextInt();
    if(number==1||number==2||number==12){
        System.out.println("Winter!");
    }
    else if(number==3||number==4||number==5){
        System.out.println("Spring!");
    }
    else if(number==6||number==7||number==8){
        System.out.println("Summer!");
    }
    else if(number==9||number==10||number==11){
        System.out.println("Autumn!");
    }
    else if (number<=0||number>12){
        System.out.println("Error,there is no such month!!!");
    }
    System.out.println("\nEnd of the method.");

}
}
