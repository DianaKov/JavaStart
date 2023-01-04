package array;
/**
 * @author D.V.Kovalevska
 *  * @version 1.0
 */
import java.util.Scanner;
import java.util.Arrays;

public class ArrayHwTwo {
    public static void main(String[] args) {
        System.out.print("Задайте размер массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Введите элементы масcива через пробел");
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr1));//
    }
}
