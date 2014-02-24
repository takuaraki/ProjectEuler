import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// Problem67を動的計画で解く
// Problem18にも適用可能

public class Problem67 {
    private static ArrayList<int[]> data;
    private static BufferedReader br;
    /**
     * @param args
     */
    public static void main(String[] args) {
        String line = null;
        String inputFilePath = "triangle.txt";
        
        data = new ArrayList<int[]>();
        try{
            br = new BufferedReader(new FileReader(inputFilePath));
            while((line = br.readLine()) != null){
                String[] stmp = line.split(" ");
                int[] itmp = new int[stmp.length];
                for(int i=0; i<stmp.length; i++){
                    itmp[i] = Integer.parseInt(stmp[i]);
                }
                data.add(itmp);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        
        for(int i=1; i<data.size(); i++){
           int target[] = data.get(i); // 注目している行
           int prev[] = data.get(i-1); // 1つ上の行
           
           target[0] += prev[0];
           target[target.length-1] += prev[prev.length-1];
           
           for(int j=1; j<target.length-1; j++){
               target[j] += Math.max(prev[j-1], prev[j]);
           }
           
           data.set(i, target);
        }
        
        int last_row[] = data.get(data.size()-1);
        int ans = 0;
        for(int i=0; i<last_row.length; i++){
            if(last_row[i] > ans){
                ans = last_row[i];
            }
        }
        
        System.out.println(ans);
    }

}
