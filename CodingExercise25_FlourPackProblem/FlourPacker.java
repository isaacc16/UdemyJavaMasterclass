public class FlourPacker {
    
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        
        if(bigCount < 0 || smallCount < 0 || goal < 0 || (bigCount * 5 + smallCount * 1) < goal) {
            return false; 
        }
        return ((goal % 5) <= smallCount) ? true : false;
    }
}