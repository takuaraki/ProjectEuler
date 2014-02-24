
public class Problem10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long sum = 2;
		
		for(int i=3; i<=2000000; i+=2){
			if(isPrime(i)){
				sum += i;
			}
		}
		
		System.out.println(sum);

	}
	
	static boolean isPrime(int n){
		if(n%2==0){
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
