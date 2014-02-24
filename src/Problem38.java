
public class Problem38 {

    public static void main(String[] args) {
        for(int i=1; i<1000000; i++){
            if(isPM(i)){
                System.out.print(i+" ");
                printPandigitalNum(i);
            }
        }
    }

    public static boolean isPM(int n){
        int nums[] = {1,2,3,4,5,6,7,8,9};
        
        int count = 1;
        for(int i=1; count<10; i++){
            int multiple = n*i;
            while(multiple !=0){
                int lastDigit = multiple%10;
                if(lastDigit != 0 && nums[lastDigit-1] != 0){
                    nums[lastDigit-1] = 0;
                }else{
                    return false;
                }
                multiple /=10;
                count++;
            }
        }
        return true;
    }
    
    public static void printPandigitalNum(int n){
        int count = 1;
        for(int i=1; count<10; i++){
            int multiple = n*i;
            System.out.print(multiple);
            while(multiple !=0){
                multiple /=10;
                count++;
            }
        }
        System.out.println();
    }
}
