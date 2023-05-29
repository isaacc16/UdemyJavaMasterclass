public class NumberToWords {

    public static void numberToWords(int number) {

        if(number < 0) {
            System.out.println("Invalid Value");
        }
        
        else if(number == 0) {
            System.out.println("Zero");
        }

        int reverseNumber = reverse(number);
        int count = getDigitCount(number);
        int countReverse = getDigitCount(reverseNumber);

        while(reverseNumber > 0) {

            switch(reverseNumber % 10) {
                case 0:
                    System.out.println("Zero");
                    break;

                case 1:
                    System.out.println("One");
                    break;

                case 2:
                    System.out.println("Two");
                    break;

                case 3:
                    System.out.println("Three");
                    break;

                case 4:
                    System.out.println("Four");
                    break;

                case 5:
                    System.out.println("Five");
                    break;

                case 6:
                    System.out.println("Six");
                    break;

                case 7:
                    System.out.println("Seven");
                    break;

                case 8:
                    System.out.println("Eight");
                    break;

                default:
                    System.out.println("Nine");
                    break;
            }
            
            reverseNumber /= 10;
            }
                for(int i = countReverse; i < count; i++) {
            System.out.println("Zero");
        }
    }


    public static int reverse(int number) {

        int reverse = 0;
        int lastDigit = 0;
        boolean bool = true; 
        if (number < 0) {
            number *= -1;
            bool = false;
        }

            while (number > 0) {
             lastDigit = number % 10;
             reverse *= 10;
              reverse += lastDigit;
              number /= 10;
            }
            if (bool) {
                return reverse;
            }
            else {
                return reverse * -1;
            }
        }


    public static int getDigitCount(int number) {

        int count = 0;
        if(number < 0) {
            return -1;
        }
        
        while(number > 0) {
            number /= 10;
            count++;
        }
        if(count == 0){
            return 1;
        }
        else {
            return count;
        }
    }
}