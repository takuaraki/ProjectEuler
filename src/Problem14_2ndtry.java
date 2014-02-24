
public class Problem14_2ndtry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int ans_num=0;
		int ans_length=0;
		long matrix[][] = new long[1000000][2]; //matrix[n][length]
		for(int i=0; i<1000000; i++){
			matrix[i][0] = 1+i;
			matrix[i][1] = 1;
		}
		
		for(int i=0; i<1000000; i++){
			if(matrix[i][1]==1 && matrix[i][0]!=1){	//’·‚³•s–¾‚Ì‚à‚Ì‚É‚Â‚¢‚Ä
				while(matrix[i][0] != 1){
					if(matrix[i][0]%2 == 0){
						matrix[i][0] = matrix[i][0]/2;
					}else{
						matrix[i][0] = matrix[i][0]*3+1;
					}
					
					if(matrix[i][0]<=1000000){
/*’·‚³Šù’m‚Ì”‚É‚È‚Á‚½‚ç*/		if(matrix[(int)matrix[i][0]-1][1] != 1){
/*‚»‚Ì’·‚³‚ð‘«‚·*/				matrix[i][1]+=matrix[(int)matrix[i][0]-1][1];
							break;
						}
					}
					
					matrix[i][1]++;
				}
			}
			
			if(matrix[i][1]>ans_length){
				ans_num = i+1;
				ans_length = (int)matrix[i][1];
			}
		}
		
		System.out.println(ans_num);
		System.out.print(ans_length);

	}

}
