
public class Probrem6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=0; i<=100; i++){
			sum1 += Math.pow(i,2);
			sum2 += i;
		}

		System.out.println(sum2*sum2 - sum1);
		
	}

}
