package sample;
/**
 * Class that demonstrates Java operator For.
 *
 * @author D.V.Kovalevska
 * @version 1.0
 */
public class OperatorFor {
    /**
     * Start method of the class.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
