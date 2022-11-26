package Cycle;
public class Lesson3_5 {
    public static void main(String[] args) {
        Numbers();
    }

    public static void Numbers() {
        int sum=0;
        int count=0;
        for (int i=sum;i<10;i++){
          count++;
          System.out.println(count+" sequence element="+sum);
          sum+=-5;
        }

    }
}