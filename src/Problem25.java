import java.math.BigInteger;


public class Problem25 {
    
    public static void main(String[] args) {
        BigInteger f1 = BigInteger.ONE;
        BigInteger f2 = BigInteger.ONE;
        BigInteger tmp = null;
        int count = 2;
        
        while(f2.toString().length() < 1000){
            count++;
            tmp = f2;
            f2 = f2.add(f1);
            f1 = tmp;
        }
        
        System.out.println(count);
    }

}
