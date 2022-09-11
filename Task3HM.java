import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Logger;

/*
 * Задан целочисленный список ArrayList. 
 * Найти минимальное, максимальное и среднее из этого списка
 */

public class Task3HM {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter random array length: ");
        int arrayLength = iScanner.nextInt();

        ArrayList<Integer> workArrayList = filledArrayList(arrayLength);
        logger.info(String.format("Random array: %s", Arrays.toString(workArrayList.toArray())));

        Iterator iterator = workArrayList.iterator();
        int maxItem = workArrayList.get(0);
        int minItem = workArrayList.get(0);
        int sumOfItems = 0;
        while (iterator.hasNext()) {
            int temp = (int) iterator.next();
            if (maxItem < temp) {
                maxItem = temp;
            } else if (minItem > temp) {
                minItem = temp;
            }
            sumOfItems += temp;
        }
        float averageOfItems = 0;
        averageOfItems = (float) sumOfItems / (float) workArrayList.size();
        logger.info(String.format("Array: max item %d, min item %d, average %.2f", minItem, maxItem, averageOfItems));

    }
    public static ArrayList<Integer> filledArrayList(int arrayLength) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arrayLength; i++) {
            result.add((int) ((Math.random() * 199) - 100));
        }
        return result;
    }
}
