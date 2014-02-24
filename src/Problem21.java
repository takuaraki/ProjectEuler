
public class Problem21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int ans=0;
		
		for(int a=1; a<10000; a++){
			for(int b=1; b<a; b++){
				if(divisor_sum(a)==b && divisor_sum(b)==a){
					ans+=a+b;
				}
			}
		}
		
		System.out.print(ans);

	}
	
	static int divisor_sum(long a){
		if(a==1) return 0;
		int sum = 1;
		for(int i=2; i<=Math.pow(a, 0.5); i++){
			if(a%i==0){
				if(i!=Math.pow(a, 0.5)){
					sum += i + a/i;
				}else{
					sum += i;
				}
				
			}
		}
		return sum;
	}

}
