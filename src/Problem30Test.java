import java.util.ArrayList;


public class Problem30Test {

    static int sum = 0;
    static ArrayList<int[]> nums;
   
    public static void main(String[] args) {
        int numerals[] = {0,1,2,3,4,5,6,7,8,9};
        int numsLength = 10;
        int digitNum = 4;
        nums = new ArrayList<int[]>();
        
        /*for(int i=0; i<10; i++){
            for(int j=i; j<10; j++){
                System.out.println(i+""+j);
            }
        }*/
        
        
        /*for(int i=0; i<10; i++){
            for(int j=i; j<10; j++){
                for(int k=j; k<10; k++){
                    for(int l=k; l<10; l++){
                        sum++;
                        System.out.println(i+""+j+""+k+""+l);
                        int array[] = new int[4];
                        array[0] = i;
                        array[1] = j-1;
                        array[2] = k-2;
                        array[3] = l-3;
                        nums.add(array);
                    }
                }
            }
        }*/
        
        f(4,new int[]{0});
        
        for(int i=0; i<nums.size(); i++){
            for(int j=0; j<4; j++){
                System.out.print(nums.get(i)[3-j]);
            }
            System.out.println();
        }
        
        //System.out.println(sum);
    }

    public static void f(int digit, int[] i){
        for(int j=i[i.length-1]; j<10; j++){
            if(digit >= 2){
                int array[] = new int[i.length+1];
                for(int k=0; k<i.length; k++){
                    array[k] = i[k];
                }
                array[i.length] = j;
                
                f(digit-1, array);
            }else{
                i[0] = j;
                int tmp[] = new int[i.length];
                for(int k=0; k<i.length; k++){
                    tmp[k] = i[k];
                }
                
                //for(int k=i.length-1; k>=0; k--){
                //    System.out.print(i[k]);
                //}
                //System.out.println();
                nums.add(tmp);
            }
        }
    }
    
    /*public static void f(int digit, int i){
        for(int j=i; j<10; j++){
            if(digit >= 2){
                f(digit-1, j);
            }else{
                sum++;
            }
        }
    }*/
    
    /*public static void f(int digit, int i){
        digit--;
        for(int j=i; j<10; j++){
            if(digit >= 2){
                f(digit, j);
            }else{
                for(int k=j; k<10; k++){
                    sum++;
                }
            }
        }
    }*/
}
