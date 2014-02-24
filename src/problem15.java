
public class problem15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long a = 1;
		int[] stair20 = new int[20];
		for(int i=0; i<20; i++){
			stair20[i] = 20-i;
		}
		
		for(int i=40; i>20; i--){
			a*=i;
			for(int j=0; j<20; j++){
				if(stair20[j]!=1 && a%stair20[j]==0){ //Š„‚ê‚é‚È‚çŠ„‚é
					a /= stair20[j];
					stair20[j] = 1;
				}
			}
		}
		
		System.out.println(a);
	}

}
