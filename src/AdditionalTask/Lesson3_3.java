package AdditionalTask;
public class Lesson3_3 {

    public static void main(String[] args) {
        final String TAB = "    ";
        for (int y = 0; y < 3; y++) {
            for (int j = 1; j <= 9; j++) {
                for (int x = 0; x < 3; x++) {
                    int i = 1 + y * 3 + x;
                    System.out.printf("%2d x %d = %2d" + TAB, i, j, i * j);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}