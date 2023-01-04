package academy.prog.lesson4HW;
/**
 * Class that demonstrates Java operators using.
 *
 * @author D.V.Kovalevska
 * @version 1.0
 */
import java.util.Scanner;

public class IfElseHw {
    /**
     * Start method of the class.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
// Напишіть программу, яка запитує користувача число, зчитує його з клвіатури та зберігає у змінній int  під назвою number.
        System.out.println("Please enter the number and press Enter");
        Scanner scr = new Scanner(System.in);
        int number = scr.nextInt();
//Потім друкує "One" ... "Nine", якщо змінна дорівнює і "Other" якщо number >9 або <9 відповідно
        if (number == 1){
            System.out.println("One");
        }  else if (number ==2){
            System.out.println("Two");
        } else if (number == 3){
            System.out.println("Tree");
        } else if (number == 4){
            System.out.println("Four");
        } else if (number == 5) {
            System.out.println("Five");
        } else if (number == 6) {
            System.out.println("Six");
        } else if (number == 7) {
            System.out.println("Seven");
        } else if (number == 8) {
            System.out.println("Eight");
        } else if (number == 9) {
            System.out.println("Nine");
        } else {
            System.out.println("Other");
        }
    }
}
