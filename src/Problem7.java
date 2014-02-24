
public class Problem7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count=0;
		int ans=1;
		
		while(count<10001){
			ans++;
			if(isPrime(ans)){
				count++;
			}
		}
		
		System.out.println(ans);
	}
	
	static boolean isPrime(long n){
		if(n==2){
			return true;
		}else if(n%2==0){
			return false;
		}
		for(int i=3; i<=Math.pow(n , 0.5); i+=2){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}

}
