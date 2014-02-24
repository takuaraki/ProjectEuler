
public class Problem37 {

    public static void main(String[] args) {
        int sum = 0;
        
        for(int i=10; i<1000000; i++){
            if(isTruncatable(i)){
                System.out.println(i);
                sum += i;
            }
        }
        
        System.out.println(sum);
    }

    public static boolean isTruncatable(int n){
        return isRightTruncatable(n) && isLeftTruncatable(n);
    }
    
    public static boolean isRightTruncatable(int n){
        while(n != 0){
            if(!isPrime(n)){
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static boolean isLeftTruncatable(int n){
        int digitNum = String.valueOf(n).length();
        
        while(digitNum != 0){
            if(!isPrime(n)){
                return false;
            }
            n = n%(int)Math.pow(10, digitNum-1);
            digitNum--;
        }
        return true;
    }
    
    public static boolean isPrime(int n){
        if(n<2) return false;
        
        if(n==2){
            return true;
        }else if(n%2==0){
            return false;
        }
        for(int i=3; i<=Math.pow(n , 0.5); i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
