import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;


public class Problem30 {

    private static ArrayList<int[]> array;
    
    public static void main(String[] args) {
        array = new ArrayList<int[]>();
        f(4,new int[]{0});
        int sum = 0;
        
        for(int i=0; i<array.size(); i++){
            int tmp[] = array.get(i);
            BigInteger bi = BigInteger.ZERO;
            for(int j=0; j<tmp.length; j++){
                bi = bi.add(BigInteger.valueOf((int)Math.pow(tmp[j], 5)));
            }
            //System.out.println(bi.intValue());
            char[] chars = bi.toString().toCharArray();
            
            if(judge(tmp,chars)){
                System.out.println(bi.intValue());
                sum += bi.intValue();
            }
        }
        
        System.out.println(sum);
    }
    
    public static boolean judge(int[] i, char[] c){
        if(i.length != c.length){ 
            return false;
        }
        
        int content_i[] = new int[10];
        int content_c[] = new int[10];
        
        for(int j=0; j<i.length; j++){
            content_i[i[j]] += 1;
            content_c[c[j]-'0'] += 1;
        }
        
        if(Arrays.equals(content_i, content_c)){
            return true;
        }else{
            return false;
        }
    }
    
    public static void f(int digit, int[] i){
        for(int j=i[i.length-1]; j<10; j++){
            if(digit >= 2){
                int array[] = new int[i.length+1];
                for(int k=0; k<i.length; k++){
                    array[k] = i[k];
                }
                array[i.length] = j;
                
                f(digit-1, array);
            }else{
                i[0] = j;
                int tmp[] = new int[i.length];
                for(int k=0; k<i.length; k++){
                    tmp[k] = i[k];
                }
                array.add(tmp);
            }
        }
    }
}
