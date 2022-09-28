/**
 * @author: MARK ANDREW B. DUZA
 *          BSIT 103
 *          Computer Programming E-LMS Activity
 */

public class App {
    public static void main(String[] args) throws Exception {
        // number of rows
        int rows = 20;
        // symbol
        String symbol = "^";

        // upper section
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // symbol
            System.out.print(symbol);
            Thread.sleep(100);
            for (int k = 1; k < (i - 1) * 2; k++) {
                // space
                System.out.print(" ");
            }
            if (i == 1) {
                // proceeds to the next line
                System.out.println();
            } else {
                // prints the symbol and then proceeds to the next line
                System.out.println(symbol);
                Thread.sleep(100);
            }
        }

        // lower section
        int MIN_NUM = 1;
        for (int i = rows - 1; i >= MIN_NUM; i--) {
            for (int j = rows; j > i; j--) {
                // space
                System.out.print(" ");
            }
            // symbol
            System.out.print(symbol);
            Thread.sleep(100);
            for (int k = 1; k < (i - 1) * 2; k++) {
                // space
                System.out.print(" ");
            }
            if (i == 1) {
                // proceeds to the next line
                System.out.println();
            } else {
                System.out.println(symbol);
                Thread.sleep(100);
            }
        }
    }
}
