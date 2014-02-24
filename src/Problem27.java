
public class Problem27 {

    public static void main(String[] args) {
        int abs_a_sup = 1000;
        int abs_b_sup = 1000;
        int max_a = 0;
        int max_b = 0;
        int max_n = 0;
        
        for(int b=2; b<abs_b_sup; b++){
            if(!isPrime(b)) continue;
            
            for(int a=1-b; a<abs_a_sup; a++){
                int n = 0;
                while(isPrime(f(n,a,b))){
                    n++;
                }
                
                if(n > max_n){
                    max_a = a;
                    max_b = b;
                    max_n = n;
                }
            } 
        }
        
        System.out.println(max_a*max_b);
    }

    public static int f(int n, int a, int b){
        return n*n + a*n + b;
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
