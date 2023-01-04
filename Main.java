/* Виводить на екран ПІБ та забезпечує введення рядка (ПІБ) з клавіатури */
package sample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kovalevska Diana Vyacheslavivna");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
    }
}
