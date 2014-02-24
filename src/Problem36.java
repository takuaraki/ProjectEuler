
public class Problem36 {

    public static void main(String[] args) {
        int sum = 0;
        
        for(int i=1; i<1000000; i++){
            char decimal[] = String.valueOf(i).toCharArray();
            char binary[] = Integer.toBinaryString(i).toCharArray();
            
            if(isPalindromic(decimal) && isPalindromic(binary)){
                System.out.println(i + " " + Integer.toBinaryString(i));
                sum += i;
            }
        }
        
        System.out.println(sum);
    }

    public static boolean isPalindromic(char[] num){
        for(int i=0; i<num.length/2; i++){
            if(num[i] != num[num.length-1-i]){
                return false;
            }
        }
        
        return true;
    }
}
