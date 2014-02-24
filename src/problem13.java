import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class problem13 {
	
	public static void main(String[] args) {
		long nums[][] = new long[100][50];
		int line_num=0;
		
		try{
			String line;
			BufferedReader br = new BufferedReader(new FileReader("problem13.txt"));
			while((line = br.readLine()) != null){
				for(int i=0; i<50; i++){
					nums[line_num][i] = Long.parseLong(String.valueOf(line.charAt(i)));
				}
				line_num++;
			}
			br.close();
		}catch(IOException e){
			System.out.println(e);  //エラーが起きたらエラー内容を表示
		}finally{
		}

		/*for(int i=0; i<100; i++){
			for(int j=0; j<50; j++){
				System.out.print(nums[i][j]);
			}
			System.out.println("");
		}*/
		
		long sum=0;
		
		for(int j=49; j>=0; j--){
			for(int i=0; i<100; i++){
				sum += nums[i][j];
			}
			//System.out.println(sum);
			System.out.print(sum%10);
			sum = (sum-sum%10)/10;
		}
		while(sum!=0){
			System.out.print(sum%10);
			sum = (sum-sum%10)/10;
		}
	}

}
