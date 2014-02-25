
public class Problem41 {

    public static void main(String[] args) {
        f(new int[]{1,2,3,4,5,6,7}, 0);
    }

    public static void f(int s[], int t){
        if(s.length == 1){
            t = t*10 + s[0];
            if(isPrime(t)){
                System.out.println(t);
            }
        }else {
            for(int i=0; i<s.length; i++){
                int t2 = t*10 + s[i];
                int s2[] = removed(s, i);
                f(s2, t2);
            }
        }
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
    
    // array —v‘f‚ðŽæ‚èœ‚©‚ê‚é”z—ñ
    // index Žæ‚èœ‚©‚ê‚é—v‘f‚Ì”Ô†
    public static int[] removed(int[] array, int index){
        int tmp[] = new int[array.length-1];
        int tmp_index = 0;
        for(int i=0; i<array.length; i++){
            if(i!=index){
                tmp[tmp_index] = array[i];
                tmp_index++;
            }
        }
        return tmp;
    }
}
