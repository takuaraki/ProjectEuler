import java.util.Arrays;

public class Hogehoge {
    public static void main(String[] args) {
        for(int i=0; i<100; i++){
            if(isTriNum(i)){
                System.out.println(i);
            }
        }
    }
    
    public static boolean isTriNum(int num){
        int i = 1;
        while(num >= i*(i+1)/2){
            if(num == i*(i+1)/2){
                return true;
            }
            i++;
        }
        return false;
    }
    
    // array 要素を取り除かれる配列
    // index 取り除かれる要素の番号
    public static void remove(int[] array, int index){
        int tmp[] = new int[array.length-1];
        int tmp_index = 0;
        for(int i=0; i<array.length; i++){
            if(i!=index){
                tmp[tmp_index] = array[i];
                tmp_index++;
            }
        }
        array = tmp;
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
    
    public static boolean isPower(int num) {
        if (num == 1) return false;

        for (int n = 2; Math.pow(num, 1.0 / n) >= 2.0; n++) {
            double nThRoot = Math.pow(num, 1.0 / n);
            if (nThRoot - Math.floor(nThRoot) == 0.0)
                return true;
        }

        return false;
    }
}
