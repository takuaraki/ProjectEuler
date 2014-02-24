
public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int sum = 0;
		
		for(int i=0; i<1000; i++){
			if(i%5==0 || i%3==0){
				sum = sum + i;
			}
		}
		
		System.out.print(sum);

	}

}
