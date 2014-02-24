
public class Problem4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int answer=0;
		
		for(int i=999; i>100; i--){
			for(int j=999; j>100; j--){
				if(judge(i*j)){
					if(i*j>answer){
						answer = i*j;
					}
				}
			}
		}
		
		System.out.print(answer);

	}
	
	static boolean judge(int a){
		
		int keta = (int)Math.ceil(Math.log10(a));
		int array[] = new int[keta];
		for(int i=0; i<keta; i++){
			array[i] = (int)(a/Math.pow(10, i))%10;
		}
		int i = 0;
		while(i<keta){
			if(array[i]!=array[keta-1-i]){
				return false;
			}
			i++;
		}
		return true;
			
	}
			
}

