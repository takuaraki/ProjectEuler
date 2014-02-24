import java.io.*;
import java.util.StringTokenizer;

public class Probrem11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int nums[][] = new int[20][20];
		int line_num = 0;

		//カレントディレクトリの取得
		//String c = new File(".").getAbsoluteFile().getParent();
		//System.out.println(c);
		
		try{
			String line;
			BufferedReader br = new BufferedReader(new FileReader("problem11.txt"));
			while((line = br.readLine()) != null){
				String[] stmp = line.split(" ");
				
				for(int j=0; j<stmp.length; j++){
					nums[line_num][j] = Integer.parseInt(stmp[j]);
				}
				line_num++;
			}
			br.close();
		}catch(IOException e){
			System.out.println(e);  //エラーが起きたらエラー内容を表示
		}finally{
		}
		
		int max_num = 0;
		int tmp = 1;
		
		//横に4つ
		for(int i=0; i<20; i++){
			for(int j=0; j<=16; j++){
				for(int k=0; k<4; k++){
					tmp *= nums[i][j+k];
					//System.out.print(nums[i][j+k]+" ");
				}
				//System.out.print(tmp);
				//System.out.println("");
				if(tmp>max_num) max_num=tmp;
				tmp = 1;
			}
		}
		
		//縦に4つ
		for(int i=0; i<20; i++){
			for(int j=0; j<=16; j++){
				for(int k=0; k<4; k++){
					tmp *= nums[j+k][i];
					//System.out.print(nums[j+k][i]+" ");
				}
				//System.out.print(tmp);
				//System.out.println("");
				if(tmp>max_num) max_num=tmp;
				tmp = 1;
			}
		}
		
		//左上から右下に4つ
		for(int i=0; i<=16; i++){
			for(int j=0; j<=16; j++){
				for(int k=0; k<4; k++){
					tmp *= nums[i+k][j+k];
					//System.out.print(nums[i+k][j+k]+" ");
				}
				//System.out.print(tmp);
				//System.out.println("");
				if(tmp>max_num) max_num=tmp;
				tmp = 1;
			}
		}
		
		//左下から右上に4つ
		for(int i=3; i<20; i++){
			for(int j=0; j<=16; j++){
				for(int k=0; k<4; k++){
					tmp *= nums[i-k][j+k];
					System.out.print(nums[i-k][j+k]+" ");
				}
				System.out.print(tmp);
				System.out.println("");
				if(tmp>max_num) max_num=tmp;
				tmp = 1;
			}
		}
		
		System.out.println(max_num);
		
		/*for(int k=0; k<nums.length; k++){
			for(int l=0; l<nums[0].length; l++){
				System.out.print(nums[k][l]+" ");
			}
			System.out.print("\n");
		}*/

	}

}
