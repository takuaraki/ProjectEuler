public class Problem19 {

    public static void main(String[] args) {
        int dayPerMonth[] = {31,31,28,31,30,31,30,31,31,30,31,30}; // 12,1,2,...,11
        int dayOfTheWeek = 6; // 0:Sunday, 6:Friday 1900/12/01 Friday=6
        int ans = 0; // the number of day which is Monday and beginning of month
        
        for(int year=0; year<100; year++){
            dayPerMonth[2] = ((year+1901)%4==0) ? 29 : 28;
            
            for(int month=0; month<12; month++){
                if((dayOfTheWeek = (dayOfTheWeek+dayPerMonth[month])%7)==0){
                    ans++;
                }
            }
        }
        
        System.out.println(ans);
    }

}
