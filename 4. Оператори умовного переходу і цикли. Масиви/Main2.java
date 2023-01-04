package academy.prog.lesson4HW;
/**
 * Class that demonstrates Java operators using.
 *
 * @author D.V.Kovalevska
 * @version 1.0
 */
import java.util.Scanner;

public class SwitchHw {
    /**
     * Start method of the class.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the number and press Enter");
        Scanner scr = new Scanner(System.in);
        int number = scr.nextInt();
        String numberNum;
            switch (number) {
                case 1:
                    numberNum = "One";
                    break;
                case 2:
                    numberNum = "Two";
                    break;
                case 3:
                    numberNum = "Three";
                    break;
                case 4:
                    numberNum = "Four";
                    break;
                case 5:
                    numberNum = "Five";
                    break;
                case 6:
                    numberNum = "Six";
                    break;
                case 7:
                    numberNum = "Seven";
                    break;
                case 8:
                    numberNum = "Eight";
                    break;
                case 9:
                    numberNum = "Nine";
                    break;
                default:
                    numberNum = "Other";
            }
            System.out.println(numberNum);
        }
    }
