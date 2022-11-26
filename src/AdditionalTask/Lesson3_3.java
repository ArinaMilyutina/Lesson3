package AdditionalTask;
public class Lesson3_3 {
    public static void main(String[] args) {
        int q = 1;

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                q = j * i;
                System.out.println(i + "*" + j + "=" + q);}
            }
        }
    }
