package sample;
/**
 * Class that demonstrates Java operators using.
 *
 * @author D.V.Kovalevska
 * @version 1.0
 */
import java.util.Scanner;

public class enhancedSwitch {
    /**
     * Start method of the class.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the number and press Enter");
        Scanner scr = new Scanner(System.in);
        int number = scr.nextInt();
        String numberNum = switch (number) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "Other";
        };
        System.out.println(numberNum);
    }
}
