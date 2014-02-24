
public class Problem17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int ans=0;
		int array[] = new int[4];
		int keta;
		
		for(int i=1; i<=1000; i++){
			if(Math.log10(i)==(int)Math.ceil(Math.log10(i))){
				keta = (int)Math.ceil(Math.log10(i))+1;
			}else{
				keta = (int)Math.ceil(Math.log10(i));
			}
				
			for(int j=0; j<keta; j++){
				array[j]= (int)(i/Math.pow(10, j))%10;	
			}
			switch(keta){
			case 1:ans += add2(i); break;
			case 2:ans += add1(array[1],array[0]); break;
			case 3:ans += add2(array[2])+10;//3Œ…–Ú + hundred and
				if(array[1]==0){
					if(array[0]==0){
						ans-=3; //and‚¢‚ç‚È‚©‚Á‚½
					}else{
						ans+=add2(array[0]);
					}
				}else{
					ans+=add1(array[1],array[0]);
				}
				break;
			case 4:ans += 11; break;//one thousand
			}
			
		}
		
		System.out.print(ans);
		
	}
	
	static int add1(int i,int j){//2Œ…‚Ì•¶Žš”
		int add = 0;
		if(i==1){
			switch(j){
			case 0: add=3; break;//ten
			case 1: add=6; break;//eleven
			case 2: add=6; break;//twelve
			case 3: add=8; break;//thirteen
			case 4: add=8; break;//fourteen
			case 5: add=7; break;//fifteen
			case 6: add=7; break;//sixteen
			case 7: add=9; break;//seventeen
			case 8: add=8; break;//eighteen
			case 9: add=8; break;//nineteen
			}
			return add;
		}
		
		switch(i){
		case 0:
		case 2: add=6; break;//twenty
		case 3: add=6; break;//thirty
		case 4: add=5; break;//forty
		case 5: add=5; break;//fifty
		case 6: add=5; break;//sixty
		case 7: add=7; break;//seventy
		case 8: add=6; break;//eighty
		case 9: add=6; break;//ninety
		}
		
		add += add2(j);
		return add;
	}
	
	static int add2(int i){//1Œ…‚Ì•¶Žš”
		int add = 0;
		switch(i){
		case 0: break;
		case 1: add=3; break;//one
		case 2: add=3; break;//two
		case 3: add=5; break;//three
		case 4: add=4; break;//four
		case 5: add=4; break;//five
		case 6: add=3; break;//six
		case 7: add=5; break;//seven
		case 8: add=5; break;//eight
		case 9: add=4; break;//nine
		}
		return add;
	}

}
