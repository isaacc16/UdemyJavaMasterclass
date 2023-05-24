public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {
        
        boolean bool = false;
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }
        else {
            if ((num1 % 10 == num2 % 10) || (num1 % 10 == num2 / 10) || (num1 / 10 == num2 % 10) || (num1 / 10 == num2 / 10)) {
                bool =  true;
            }
            else {
                bool =  false;
            }
        }
        return bool;
    }
}