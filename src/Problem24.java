import java.util.ArrayList;
import java.util.Collections;


public class Problem24 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        ArrayList<String> nums = new ArrayList<String>();
        String ans[] = new String[10];
        int n = 1;
        int kaijou[] = {1,2,6,24,120,720,5040,40320,362880}; 
        
        for(int i=0; i<10; i++){
            nums.add(String.valueOf(i));
        }

        for(int i=8; i>=0; i--){
            int amari = n%kaijou[i];
            if(amari == 0){
                ans[i+1] = nums.get(n/kaijou[i]-1);
                nums.remove(n/kaijou[i]-1);
                Collections.reverse(nums);
                for(int j=0; j<nums.size(); j++){
                    ans[i+j] = nums.get(j);
                }
                break;
            }else{
                ans[i+1] = nums.get(n/kaijou[i]);
                n = n%kaijou[i];
            }
        }

        for(int i=9; i>=0; i--){
            System.out.print(ans[i]);
        }
    }

}
