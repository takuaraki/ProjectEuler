
public class Problem39 {

    /* a < b < c
     * a^2 + b^2 = c^2
     * a + b + c = p
     */
    public static void main(String[] args) {
        int max_count = 0;
        int ans = 0;
        
        for(int p=3; p<=1000; p++){
            System.out.print(p+" : ");
            int count = 0;
            
            for(int c=p/3+1; c<=p-2; c++){
                for(int a=1; a<=p/3-1; a++){
                    int b = p - c - a;
                    if(a*a+b*b == c*c){
                        System.out.print(a+","+b+","+c+" ");
                        count++;
                    }
                }
            }
            
            System.out.println();
            
            if(count > max_count){
                ans = p;
                max_count = count;
            }
        }
        
        System.out.println(ans+" " +max_count);
    }

}
