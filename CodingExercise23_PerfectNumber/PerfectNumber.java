public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        
        int sum = 0 ;
        if(number < 1) {
            return false; 
        }
        
        for(int i = 0; i < number; i++) {
            if(number % i == 0) {
                sum += i;
            }
        }
    return (sum == number) ? true : false;
    }
}