
public class Problem40 {
    
    public static void main(String[] args) {
        int ans = 1;
        
        for(int i=0; i<7; i++){
            System.out.println(d((int)Math.pow(10, i)));
            ans *= d((int)Math.pow(10, i));
        }
        
        System.out.println(ans);
    }

    public static int d(int n){
        int delta = n - firstIndex(n);
        int digitNum = digitNum(n);
        int quotient = delta/digitNum;
        int remainder = delta%digitNum;
        char num[] = String.valueOf((int)Math.pow(10, digitNum-1) + quotient).toCharArray();
        
        return num[remainder] - '0';
    }
    
    public static int firstIndex(int n){
        int i = 0;
        int digitNum = 1;
        while(n > i + digitNum*(int)(9*Math.pow(10, digitNum-1))){
            i += digitNum*(int)(9*Math.pow(10, digitNum-1));
            digitNum++;
        }
        
        return i+1;
    }
    
    public static int digitNum(int n){
        int i = 0;
        int digitNum = 1;
        while(n > i + digitNum*(int)(9*Math.pow(10, digitNum-1))){
            i += digitNum*(int)(9*Math.pow(10, digitNum-1));
            digitNum++;
        }
        
        return digitNum;
    }
}
