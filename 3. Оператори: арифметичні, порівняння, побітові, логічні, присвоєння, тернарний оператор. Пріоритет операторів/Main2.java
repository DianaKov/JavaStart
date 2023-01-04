/**
 * Завдання 3.2
 */
package academy.sample;

/**
 * Class that demonstrates Java operators using.
 *
 * @author D.V. Kovalevska
 * @version 1.0
 */
    public class Main2 {
/**
 * Start method of the class.
 *
 * @param args command line arguments
 */
        public static void main(String[] args){
            int d = 4%16;
            System.out.println("d в десятковій системі = " + d); //d в десятковій системі = 4
            System.out.println("d в бінарній системі = " + Integer.toBinaryString (d)); //d в бінарній системі = 100
            System.out.println("d в шістнадцятковій системі = " + Integer.toHexString (d)); //d в шістнадцятковій системі = 4

            int m = 9;
            System.out.println("m в десятковій системі = " + m); //m в десятковій системі = 9
            System.out.println("m в бінарній системі = " + Integer.toBinaryString (m)); //m в бінарній системі = 1001
            System.out.println("m в шістнадцятковій системі = " + Integer.toHexString (m)); //m в шістнадцятковій системі = 9

            //int a = d OR m
            int a = d|m;
            System.out.println("a в десятковій системі = " + a); //a в десятковій системі = 13
            System.out.println("a в бінарній системі = " + Integer.toBinaryString (a)); //a в бінарній системі = 1101
            System.out.println("a в шістнадцятковій системі = " +Integer.toHexString (a)); //a в шістнадцятковій системі = d

            //int b = a XOR d >>> 3
            int b = a^d >>> 3;
            System.out.println("b в десятковій системі = " + b); //b в десятковій системі = 13
            System.out.println("b в бінарній системі = " + Integer.toBinaryString (b)); //b в бінарній системі = 1101
            System.out.println("b в шістнадцятковій системі = " +Integer.toHexString (b)); //b в шістнадцятковій системі = d

            //int c = a AND NOT d << 2
            int c = a & ~ d << 2;
            System.out.println("c в десятковій системі = " + c); // c в десятковій системі = 12
            System.out.println("c в бінарній системі = " + Integer.toBinaryString (c)); //c в бінарній системі = 1100
            System.out.println("c в шістнадцятковій системі = " +Integer.toHexString (c)); //c в шістнадцятковій системі = c

            //int e = (a == b) ? 0 : 5
            int e = (a == b) ? 0 : 5;
            if(a == b) {
                e = 0;
            }else{
                e=5;
            }
            System.out.println("e в десятковій системі = " + e); //e в десятковій системі = 0
            System.out.println("e в бінарній системі = " + Integer.toBinaryString (e)); //e в бінарній системі = 0
            System.out.println("e в шістнадцятковій системі = " + Integer.toHexString (e)); //e в шістнадцятковій системі = 0

 // Виконайте обнуління старших 28 бітів отриманих результатів типу int шляхом операції побітового І (AND) з маскою 0xf.
            int mask =0xf;
            System.out.println("Mask в десятковій системі  " + mask); //Mask в десятковій системі  15
            mask = mask & (~(1<<28));
            System.out.println("Oбнуління старших 28 бітів отриманих результатів " + Integer.toBinaryString (mask)); //Oбнуління старших 28 бітів отриманих результатів 1111

        }
}
