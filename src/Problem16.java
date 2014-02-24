import java.math.BigInteger;


public class Problem16 {

    public static void main(String[] args) {
        int ans[] = new int[1000];
        ans[0] = 1;
        for(int i=1; i<1000; i++){
            ans[i] = 0;
        }
        
        for(int i=0; i<1000; i++){
            for(int j=999; j>0; j--){
                ans[j] = ans[j]*2%10;
                if(ans[j-1] >= 5){
                    ans[j]++;
                }
            }
            ans[0] = ans[0]*2%10;
        }       
        
        int sum = 0;
        for(int i=0; i<1000; i++){
            sum += ans[i];
        }
        
        System.out.println(sum);
        
        /*long sum = 0;
        char chars[] = BigInteger.valueOf(2).pow(1000).toString().toCharArray();
        for(int n = 0; n<chars.length; n++)
           sum +=Character.digit(chars[n],10);
        System.out.println(sum);*/
    }

}
