
public class Problem35 {

    public static void main(String[] args) {
        int count = 0;
        
        for(int i=2; i<1000000; i++){
            int target = i;
            int digitNum = Integer.toString(target).length();
            boolean isCyclic = true;
            
            for(int j=0; j<digitNum; j++){
                if(!isPrime(target)){
                    isCyclic = false;
                    break;
                }
                int lastDigit = target%10; // ‘f”‚©‚Ç‚¤‚©‚Ì”»’è‚ð‚µ‚Ä‚¢‚é‚Ì‚ÅC0‚Í‚ ‚è‚¦‚È‚¢D
                target = target/10 + lastDigit*(int)Math.pow(10, digitNum-1);
            }
            
            if(isCyclic){
                System.out.println(i);
                count++;
            }
        }
        
        System.out.println(count);
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
