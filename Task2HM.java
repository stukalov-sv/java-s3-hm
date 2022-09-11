import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.List;

/*
 * Пусть дан произвольный список(ArrayList) целых чисел, 
 * удалить из него четные числа
 */

public class Task2HM {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter random array length: ");
        int arrayLength = iScanner.nextInt();

        ArrayList<Integer> workArrayList = filledArrayList(arrayLength);
        logger.info(String.format("Random array: %s", Arrays.toString(workArrayList.toArray())));

        Iterator iterator = workArrayList.iterator();
        List<Integer> removeList = new ArrayList<>();
        while (iterator.hasNext()) {
            int temp = (int) iterator.next();
            if (temp % 2 == 0) {
                removeList.add(temp);
            }
        }

        for (Integer item : removeList) {
            workArrayList.remove(Integer.valueOf(item));
        }
        logger.info(String.format("Result array: %s", Arrays.toString(workArrayList.toArray())));
        iScanner.close();
    }

    public static ArrayList<Integer> filledArrayList(int arrayLength) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arrayLength; i++) {
            result.add((int) ((Math.random() * 199) - 100));
        }
        return result;
    }
}
