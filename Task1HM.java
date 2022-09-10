import java.util.Arrays;
import java.util.logging.Logger;

/*
 * Реализовать алгоритм сортировки слиянием. 
 * Для Integer 
 */

public class Task1HM {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
        int[] data = new int[] {5, 6, 7, 8, 1, 2, 4, 6};
        logger.info(Arrays.toString(data));
        mergeSort(data, data.length);
        logger.info(Arrays.toString(data));
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int middleOfArray = n / 2;
        int[] leftArray = new int[middleOfArray];
        int[] rightArray = new int[n - middleOfArray];
    
        for (int i = 0; i < middleOfArray; i++) {
            leftArray[i] = a[i];
        }
        for (int i = middleOfArray; i < n; i++) {
            rightArray[i - middleOfArray] = a[i];
        }
        mergeSort(leftArray, middleOfArray);
        mergeSort(rightArray, n - middleOfArray);
    
        int i = 0, j = 0, k = 0;
        while (i < middleOfArray & j < n - middleOfArray) {
            if (leftArray[i] <= rightArray[j]) {
                a[k++] = leftArray[i++];
            } else {
                a[k++] = rightArray[j++];
            }
        }
        while (i < middleOfArray) {
            a[k++] = leftArray[i++];
        }
        while (j < n - middleOfArray) {
            a[k++] = rightArray[j++];
        }
    }    
}
