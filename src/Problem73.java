
public class Problem73 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count=0;
		
		for(int d=4; d<=12000; d++){		
			for(int n=d/3; n<d/2; n++){
				if(gcd(n,d)==1) count++;
			}
		}
		
		System.out.println(count);

	}
	
	static int gcd(int a, int b){
		int tmp;
		
		if(a==0||b==0){
			return 1;
		}
		if(a<b){
			tmp=b;
			b=a;
			a=tmp;	
		}
		
		if(a%b==0) return b;
		
		while(true){
			tmp = a%b;
			if(b%tmp==0) return tmp;
			a=b;
			b=tmp;
		}
		
	}

}
