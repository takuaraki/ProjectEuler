
public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int sum = 0;
		int f1 = 1;
		int f2 = 2;
		int x = 0;
		
		while(f1 < 4000000){
			if(f1%2==0){
				sum += f1;
			}
			x = f2;
			f2 += f1;
			f1 = x;
			
		}
		
		System.out.print(sum);

	}

}
