import java.util.Scanner;
 
public class InputCalculator {
    
    public static void inputThenPrintSumAndAverage() {
        
        Scanner scanner = new Scanner(System.in); 
        int sum = 0;
        long avg = 0;
        int count = 0;
    
        while (true) {
            String userInput = scanner.nextLine();
            try {
                int i  = Integer.parseInt(userInput);
                sum += i;
                count++;
        }   catch (NumberFormatException nfe) {
                break;
            }
        }
        
        avg = (int) Math.round((double) sum / count);
        System.out.print("SUM = " + sum + " AVG = " + avg);
    }
}