
public class Problem14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int array[] = new int[500000];
		for(int i=0; i<500000; i++){
			array[i] = 500001 + i;
		}
		
		int count;
		int ans_count = 0;
		int ans_num = 0;
		
		for(int i=0; i<500000; i+=3){
			count = 1;
			while(array[i]!=1){
				if(array[i]%2==0){
					array[i]=array[i]/2;
				}else{
					array[i]=array[i]*3+1;
				}
				
				if(array[i]<=1000000 && array[i]>500000) {
					array[array[i]-500001]=1;
				}
				
				count++;
			}
					
			if(count>ans_count){
				ans_num = i;
				ans_count = count;
			}	
		}
		
		for(int i=1; i<500000; i+=3){
			count = 1;
			while(array[i]!=1){
				if(array[i]%2==0){
					array[i]=array[i]/2;
				}else{
					array[i]=array[i]*3+1;
				}
				
				if(array[i]<=1000000 && array[i]>500000) {
					array[array[i]-500001]=1;
				}
				
				count++;
			}
					
			if(count>ans_count){
				ans_num = i;
				ans_count = count;
			}	
		}
		
		System.out.print(ans_num);

	}

}
