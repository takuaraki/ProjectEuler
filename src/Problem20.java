import java.math.BigInteger;


public class Problem20 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        BigInteger bi = BigInteger.ONE;
        
        for(int i=2; i<=100; i++){
            bi = bi.multiply(BigInteger.valueOf(i));
        }
        
        char chars[] = bi.toString().toCharArray();
        int sum = 0;
        for(int i=0; i<chars.length; i++){
            //System.out.print(chars[i]);
            sum += Character.digit(chars[i], 10);
        }
        
        System.out.println(sum);
    }

}
