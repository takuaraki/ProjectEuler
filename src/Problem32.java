import java.util.ArrayList;


public class Problem32 {

    private static int sum;
    private static ArrayList<Integer> matched;
    
    public static void main(String[] args) {
        sum = 0;
        matched = new ArrayList<Integer>();
        
        long startTime = System.currentTimeMillis();
        
        permutation(new int[]{1,2,3,4,5,6,7,8,9},new int[]{},0);
        
        /*for(int i=0; i<matched.size(); i++){
            System.out.println(matched.get(i).intValue());
        }*/
        System.out.println("sum = " + sum);
        
        System.out.println("Time = "+(System.currentTimeMillis()-startTime)/1000.0);
    }

    public static void pursue(int[] t){
        int product = t[5]*1000+t[6]*100+t[7]*10+t[8];
        boolean b144 = (t[0] * (t[1]*1000+t[2]*100+t[3]*10+t[4]) == product);
        boolean b234 = ((t[0]*10+t[1]) * (t[2]*100+t[3]*10+t[4]) == product);
        
        if(b144 || b234){
            if(!matched.contains(Integer.valueOf(product))){
                matched.add(Integer.valueOf(product));
                sum += product;
            }
        }
    }
    
    public static int[] permutation(int[] s, int[] t, int num){
        if(num == 9){
            pursue(t);
            /*for(int i=0; i<t.length; i++){
                System.out.print(t[i]);
            }
            System.out.println();*/
        }else{
            for(int i=0; i<s.length; i++){
                int t1[] = added(t, s[i]);
                int s1[] = removed(s, i);
                permutation(s1,t1,num+1);
            }
        }
        
        return null;
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
    
    // array —v‘f‚ð’Ç‰Á‚³‚ê‚é”z—ñ
    // num ’Ç‰Á‚³‚ê‚é—v‘f
    public static int[] added(int[] array, int num){
        int tmp[] = new int[array.length+1];
        for(int i=0; i<array.length; i++){
            tmp[i] = array[i];
        }
        tmp[tmp.length-1] = num;
        return tmp;
    }
    
    public static void loop(int start_index, int index){
        for(int i=0; i<index; i++){
            
            loop(start_index, index-1);
        }
    }
    
    // 16 Feb 2005 07:54 pm 
    // Zom-B  
    /*public static void main(String[] args) {
        int[] table = new int[10000];
        double l1 = Math.log(1000 * Math.sqrt(10));
        double l2 = Math.log(10000);
        
        long startTime = System.currentTimeMillis();
        
        for(int A=0; A<9999; A++)
        {
          int max = (int)Math.exp(l2-Math.log(A));
          for(int B=(int)Math.exp(l1-Math.log(A)); B<max; B++)
          {
            String all=""+A+B+(A*B);
            if (all.length() == 9)
            {
              char c = '1';
              for(; c<='9'; c++)
              {
                if (all.indexOf(c) == -1) break;
              }
              if (c > '9') table[A*B] = A*B;
            }
          }
        }
        
        int sum=0;
        for(int i=0; i<table.length; i++) sum+=table[i];
        
        System.out.println("Sum = "+sum);
        System.out.println("Time = "+(System.currentTimeMillis()-startTime)/1000.0);
    }*/
}
