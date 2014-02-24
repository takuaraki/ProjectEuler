
public class Problem33 {

    public static void main(String[] args) {
        for(int i=11; i<100; i++){
            for(int j=i-1; j>=10; j--){
                int bunbo = i;
                int bunsi = j;
                int bunbo10 = bunbo/10;
                int bunbo1 = bunbo%10;
                int bunsi10 = bunsi/10;
                int bunsi1 = bunsi%10;
                //System.out.println(bunsi10+""+bunsi1+"/"+bunbo10+bunbo1);

                /*if(bunsi10==bunbo10){
                    int gcd = gcd(bunsi1,bunbo1);
                    while(gcd != 1){
                        bunsi1 /= gcd;
                        bunbo1 /= gcd;
                        gcd = gcd(bunsi1,bunbo1);
                    }
                    
                    gcd = gcd(bunsi,bunbo);
                    while(gcd != 1){
                        bunsi /= gcd;
                        bunbo /= gcd;
                        gcd = gcd(bunsi,bunbo);
                    }
                    
                    if(bunsi1 == bunsi && bunbo1 == bunbo){
                        System.out.println(j+"/"+i);
                    }
                }*/
                
                if(bunsi1==bunbo10){
                    int gcd = gcd(bunsi10,bunbo1);
                    while(gcd != 1){
                        bunsi10 /= gcd;
                        bunbo1 /= gcd;
                        gcd = gcd(bunsi10,bunbo1);
                    }
                    
                    gcd = gcd(bunsi,bunbo);
                    while(gcd != 1){
                        bunsi /= gcd;
                        bunbo /= gcd;
                        gcd = gcd(bunsi,bunbo);
                    }
                    
                    if(bunsi10 == bunsi && bunbo1 == bunbo){
                        System.out.println(j+"/"+i);
                    }
                }
            }
        }

    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
