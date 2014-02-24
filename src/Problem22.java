import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Problem22 {
    public static void main(String[] args) {
        String line = null;
        ArrayList<String> data = new ArrayList<String>();
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("names.txt"));
            while((line = br.readLine()) != null){
                String[] stmp = line.split("\",\"");
                stmp[0] = "MARY";
                stmp[stmp.length-1] = "ALONSO";
                for(int i=0; i<stmp.length; i++){
                    data.add(stmp[i]);
                }
            }
            br.close();
        } catch(IOException e){
            e.printStackTrace();
        }

        Collections.sort(data);
        
        int total = 0;
        for(int i=0; i<data.size(); i++){
            char name[] = data.get(i).toCharArray();
            int score = 0;
            for(int j=0; j<name.length; j++){
                score += (int)name[j] - (int)'A' + 1;
            }
            total += score*(i+1);
        }
        
        System.out.println(total);
    }
}
