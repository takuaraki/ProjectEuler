
public class Problem31 {

    public static void main(String[] args) {
        int sum = 0;
        
        for(int e2=0; e2<=200; e2+=200){
            for(int e1=0; e2+e1<=200; e1+=100){
                for(int p50=0; e2+e1+p50<=200; p50+=50){
                    for(int p20=0; e2+e1+p50+p20<=200; p20+=20){
                        for(int p10=0; e2+e1+p50+p20+p10<=200; p10+=10){
                            for(int p5=0; e2+e1+p50+p20+p10+p5<=200; p5+=5){
                                for(int p2=0; e2+e1+p50+p20+p10+p5+p2<=200; p2+=2){
                                    sum++;
                                }
                            }
                        }
                    }
                }
            }
        }
        
        /*for(int e2=0; e2*200<=200; e2++){
            for(int e1=0; e2*200+e1*100<=200; e1++){
                for(int p50=0; e2*200+e1*100+p50*50<=200; p50++){
                    for(int p20=0; e2*200+e1*100+p50*50+p20*20<=200; p20++){
                        for(int p10=0; e2*200+e1*100+p50*50+p20*20+p10*10<=200; p10++){
                            for(int p5=0; e2*200+e1*100+p50*50+p20*20+p10*10+p5*5<=200; p5++){
                                for(int p2=0; e2*200+e1*100+p50*50+p20*20+p10*10+p5*5+p2*2<=200; p2++){
                                    sum++;
                                }
                            }
                        }
                    }
                }
            }
        }*/
        
        System.out.println(sum);
    }

}
