public class Problem29 {

    public static void main(String[] args) {
        int a_max = 100;
        int a_min = 2;
        int b_max = 100;
        int b_min = 2;

        int repeated = 0;

        for (int a = a_min; a <= a_max; a++) {
            if (isPower(a)) continue;

            int powNum = 2;
            int powered = (int) Math.pow(a, powNum);
            if (powered > a_max) break;

            do {
                int array[] = new int[a_max+1];
                for (int i = 0; i < a_max+1; i++) {
                    array[i] = 0;
                }
                
                for (int i = 1; i < powNum; i++) {
                    int tmpPow = powNum;
                    int tmpI = i;
                    int gcd = gcd(tmpI,tmpPow);
                    
                    while(gcd != 1){
                        tmpI /= gcd;
                        tmpPow /= gcd;
                        gcd = gcd(tmpI,tmpPow);
                    }
                    
                    for(int j=Math.max(tmpI, b_min); j<=(b_max/tmpPow)*tmpI; j+=tmpI){
                        array[j]=1;
                    }
                }

                for(int i=0; i<a_max+1; i++){
                    repeated += array[i];
                }
                
                powNum++;
                powered = (int) Math.pow(a, powNum);
            } while (powered < a_max);
        }
        
        System.out.println((a_max-a_min+1)*(b_max-b_min+1)-repeated);

    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static boolean isPower(int num) {
        if (num == 1)
            return false;

        for (int n = 2; Math.pow(num, 1.0 / n) >= 2.0; n++) {
            double nThRoot = Math.pow(num, 1.0 / n);
            if (nThRoot - Math.floor(nThRoot) == 0.0)
                return true;
        }

        return false;
    }

}
