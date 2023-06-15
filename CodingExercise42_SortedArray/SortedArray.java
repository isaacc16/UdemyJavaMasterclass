import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int size) {
        
        Scanner scanner = new Scanner(System.in);
        int[] newArray = new int[size];
        
        for(int i = 0; i < size; i++){
            int x = scanner.nextInt();
            newArray[i] = x;
        }
        return newArray;
    }
    
    public static void printArray(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
        System.out.println("Element " + i + " contents " + array[i] + '\n');
        }
    }
    
    public static int[] sortIntegers(int[] array) {
        
        boolean flag = true;
        int temp;
            while (flag) {
                flag = false;
                for (int i = 0; i < array.length -1 ; i++) {
                    if (array[i] < array[i + 1]) {
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        flag = true;
                    }
                }
            }
        return array;
    }
}