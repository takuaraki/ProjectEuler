public class Problem9 {
	public static void main(String[] args) {
		int b=1;
		
		for(int c=334; c<1000; c++){
			for(int a=1; a<(1000-c)/2; a++){
				b=1000-a-c;
				if(a*a+b*b==c*c){
					System.out.print(a*b*c);
					break;
				}
			}
		}
	}
}
