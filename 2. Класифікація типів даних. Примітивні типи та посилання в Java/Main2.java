package sample;
/**
 * Class that changes data type
 * @author Diana Kovalevska
 * @version 1.0
 */
public class Main {
    /**
     * Start method of the class.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        //sumDate:4+9+1995=2008//

        int sumDate = 2008;
        short shortDate = (short) sumDate;
        System.out.println(shortDate);
        // result 2008
        byte byteDate = (byte) sumDate;
        System.out.println(byteDate);
        // result -40
        char charNum = (char) sumDate;
        System.out.println(charNum);
        // result ߘ;
    }
