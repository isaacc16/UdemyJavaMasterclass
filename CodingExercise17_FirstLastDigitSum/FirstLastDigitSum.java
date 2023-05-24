public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit (int number) {
        
        int lastDigit = number % 10;
        int firstDigit = 0; 
        
        if (number < 0) {
            return -1;
        }
        
        else if (number >= 0 && number <10) {
            return number * 2;
        }
        
        else {
        while (number > 0) {
            number /= 10;
			if (number == 0) {
                break;
            }
            firstDigit = number;
        }
		}
		return (lastDigit + firstDigit);
    }
}