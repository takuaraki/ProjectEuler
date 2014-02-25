import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Problem42 {

    public static void main(String[] args) {
        String line = null;
        ArrayList<String> data = new ArrayList<String>();
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("words.txt"));
            while((line = br.readLine()) != null){
                String[] stmp = line.split("\",\"");
                stmp[0] = "A";
                stmp[stmp.length-1] = "YOUTH";
                for(int i=0; i<stmp.length; i++){
                    data.add(stmp[i]);
                }
            }
            br.close();
        } catch(IOException e){
            e.printStackTrace();
        }
        
        int count = 0;
        for(int i=0; i<data.size(); i++){
            if(isTriWord(data.get(i).toCharArray())){
                System.out.println(data.get(i));
                count++;
            }
        }
        
        System.out.println(count);
    }

    public static boolean isTriWord(char word[]){
        int sum = 0;
        for(int i=0; i<word.length; i++){
            sum += word[i] - 'A' + 1;
        }
        if(isTriNum(sum)){
            System.out.print(sum+" ");
            return true;
        }else {
            return false;
        }
    }
    
    public static boolean isTriNum(int num){
        int i = 1;
        while(num >= i*(i+1)/2){
            if(num == i*(i+1)/2){
                return true;
            }
            i++;
        }
        return false;
    }
}
