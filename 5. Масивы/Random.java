package array;
/**
 * @author D.V.Kovalevska
 *  * @version 1.0
 */
import java.util.Arrays;
import java.util.Random;

public class ArrayHwThree {
    public static void main(String[] args) {

        Random rn = new Random();

        int[] array1 = new int[15];
        for (int i=0; i<array1.length; i++){
            array1[i]=rn.nextInt(10);
        }
        System.out.println(Arrays.toString(array1));

        int [] array2 = new int[30];
        array2 = Arrays.copyOf(array1,30);
        System.arraycopy(array1, 0, array2, 15, 15);
        for(int i=15; i<array2.length; i++) {
            array2[i] = array2[i]*2 ;
        }
        System.out.println(Arrays.toString(array2));
    }
}
