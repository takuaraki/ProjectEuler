
public class Problem12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long tri = 1;
		int add_num = 2;
		
		while(divisor_num(tri) < 500 && add_num < 100000000){
			tri += add_num;
			add_num++;
		}
		
		System.out.println(tri);

	}
	
	static int divisor_num(long a){
		int num = 0;
		for(int i=1; i<Math.pow(a, 0.5); i++){
			if(a%i==0) num++;
		}
		num = num*2;
		if(a%Math.pow(a, 0.5)==0) num++;
		return num;
	}

}
