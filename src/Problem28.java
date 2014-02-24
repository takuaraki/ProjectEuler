
public class Problem28 {

    public static void main(String[] args) {
        int edge = 1;
        int sum = 1;
        
        for(int i=3; i<=1001; i+=2){
            for(int j=0; j<4; j++){
                edge += i-1;
                sum += edge;
            }
        }
        
        System.out.println(sum);
    }

}
