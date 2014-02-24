
public class Problem3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		long num = 600851475143L;

		for(long i=2; i<600851475143L; i++){
			if(isPrime(i)){		
				while(num%i == 0){
					num = num/i;
					System.out.println(i);
				}
			}
		}
		
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
