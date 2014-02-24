
public class Problem26 {

    public static void main(String[] args) {
        
        int remainder[] = new int[1000];
        
        int max_length = 0;
        int max_d = 0;
        
        for(int d=2; d<1000; d++){
            int num = 1;
            int length=0;
            while(num!=0){
                num *= 10;
                num = num%d;
                remainder[length] = num;
                for(int i=0; i<length; i++){
                    if(remainder[i] == 0) break;
                    if(remainder[i] == num){
                        num=0; 
                        break;
                    }
                }
                length++;
            }
            
            if(length>max_length){
                max_d = d;
                max_length = length;
            }
        }
        
        System.out.println(max_d);
    }

}
