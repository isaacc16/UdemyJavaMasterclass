public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        
        double intA = a * 1000;
        double intB = b * 1000;
        int newA = (int)intA;
        int newB = (int)intB;
        
        if (newA == newB) {
            return true;
        } else {
            return false;
        }
    }
}