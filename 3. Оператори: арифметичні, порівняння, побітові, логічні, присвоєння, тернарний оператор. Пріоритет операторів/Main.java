/**
         * Завдання 3.1
         */
package academy.prog.lesson3;

/**
 * Class that demonstrates Java operators using.
 *
 * @author D.V. Kovalevska
 * @version 1.0
 */
public class Main1 {
    /**
     * Start method of the class.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // 1. Розробіть програму, яка обчислює значення арифметичного виразу (a + b)^2 / (a^2 + 3b^2)
        short a = 1995;
        short b = 4*9;
        short number = (short)((a+b)*(a+b)/((a*a)+3*(b*b)));
        System.out.println(number); //1

        //2. a) Обчислення без використання проміжних змінних - відразу з виведенням на екран результату;
        System.out.println("The result of expression: " + number); // The result of expression: 1

        // 2. b) Обчислення з використанням проміжних змінних;
        byte a1 = (byte) 1995;
        byte b1 = (byte) 4*9;
        byte oneNumber = (byte) ((a1*b1)*(a1*b1));
        byte twoNumber = (byte) ((a1*a1) + 3*(b1*b1));
        byte result3 = (byte) (oneNumber/twoNumber);
        System.out.println("The result of oneNumber: " + oneNumber); // The result of oneNumber: -112
        System.out.println("The result of twoNumber: " + twoNumber); // The result of twoNumber: 41
        System.out.println("The result of expression: " + result3);  //  The result of expression: -2

        // 3. Повторити обчислення (a + b)^2 / (a^2 + 3b^2) через float
        float num1 = 1995;
        float num2 = 4*9;
        float result = (float)(((num1+num2)*(num1+num2)) / (num1*num1+3*(num2*num2)));
        System.out.println("The result: " + result); //The result: 1.0354044

        // 4. Повторити обчислення (a + b)^2 / (a^2 + 3b^2) через double
       double data1 = 1995;
       double data2 = 4*9;
       double result2 = (double)(data1+data2)*(data1+data2) / ((data1*data1) + 3*(data2*data2));
        System.out.println("The result2: " + result2); //The result2: 1.0354043875958134

    }
}
