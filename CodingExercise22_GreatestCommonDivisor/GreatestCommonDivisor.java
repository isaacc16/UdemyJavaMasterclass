public class GreatestCommonDivisor {
    
    public static int getGreatestCommonDivisor (int first, int second) {
        
        int j = 0 ;
        
        if(first < 10 || second < 10) {
            return -1;
        } 
        
        for(int i = 1; i <= first; i++) {
            if (first % i == 0 && second % i == 0) {
                j = i;
            }
        }
            return j;
    }
}