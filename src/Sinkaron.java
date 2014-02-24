
public class Sinkaron {
    public static void main(String[] args) {
        int hiyoko  = 40;
        int kani = 0;
        int kamome = 0;
        int gorira = 0;
        int hito = 0;
        
        int count = 0;
        
        while(hiyoko!=1 || kani!=1 || kamome!=1 || gorira!=1 || hito!=36){
            count++;
            hito += gorira/2;
            gorira = gorira%2 + kamome/2;
            kamome = kamome%2 + kani/2;
            kani = kani%2 + hiyoko/2;
            hiyoko = 40 - hito - gorira - kamome - kani;
            System.out.println(hiyoko+", "+kani+", "+kamome+", "+gorira+", "+hito);
        }
        
        System.out.println("count = "+count);
    }

}
