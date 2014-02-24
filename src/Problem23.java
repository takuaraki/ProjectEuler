import java.util.ArrayList;


public class Problem23 {

    public static void main(String[] args) {
        int nums[] = new int[28123];
        ArrayList<Integer> abundant = new ArrayList<Integer>();
        for(int i=0; i<28123; i++){
            nums[i] = i+1;
            if(isAbundant(i+1)){
                abundant.add(Integer.valueOf(i+1));
            }
        }
        
        for(int i=0; i<abundant.size(); i++){
            for(int j=i; j<abundant.size(); j++){
                // ‰ßè”‚Ì˜a‚Å•\‚³‚ê‚é”‚ðœ‚­
                int sumOfTwoAbundant = abundant.get(i).intValue()+abundant.get(j).intValue();
                if(sumOfTwoAbundant <= 28123){
                    nums[sumOfTwoAbundant-1] = 0;
                }
            }
        }
        
        int sum = 0;
        for(int i=0; i<28123; i++){
            sum += nums[i];
        }
        
        System.out.print(sum);
    }

    public static boolean isAbundant(int num){
        int sum = 1;
        for(int i=2; i<=num/2; i++){
            sum += (num%i==0) ? i : 0;
        }
        
        return (sum>num) ? true : false;
    }
}
