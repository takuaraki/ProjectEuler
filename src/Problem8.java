import java.io.*;

public class Problem8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int nums[] = new int[1000];
		int i=0;
		int ans=0;
		
		try{
			FileReader f = new FileReader("C:/Users/araki/Documents/laboratory/Problem8.txt");
			
			char ch = (char)f.read();
			while(ch != -1){
				System.out.print(ch);
				if(ch != 10 && ch != 13){
					nums[i] = ch;
					i++;
				}
			    ch = (char)f.read();
            }
			
			System.out.println("\n");
            f.close();
			
		}catch(IOException e){
			System.out.println(e);  //エラーが起きたらエラー内容を表示
		}finally{
		}
		
		for(int j=0; j<1000; j++){ //文字コードをchar(UNICODE)にしてから数字へ
			//char c = (char) nums[j];
			nums[j] = Integer.parseInt("" + nums[j]);
		}
		
		for(int j=0; j<995; j++){
			if(nums[j]*nums[j+1]*nums[j+2]*nums[j+3]*nums[j+4]>ans){
				ans = nums[j]*nums[j+1]*nums[j+2]*nums[j+3]*nums[j+4];
			}
		}
		
		System.out.println(ans);
		
	}

}
