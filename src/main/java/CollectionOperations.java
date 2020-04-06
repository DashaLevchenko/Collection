import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionOperations {
    private static Logger logger = LogManager.getLogger(CollectionOperations.class.getName());

    //First task
    public static <K> int countWordCoincidence(HashMap<K, String> hashMap, String concreteWord) {
        logger.info("Method for count amount of concrete word in String using HashMap was called");
        ArrayList<String> allValues = new ArrayList<>(hashMap.values());
        int count = 0;
        for (String allValue : allValues) {
            if (allValue.equals(concreteWord)) {
                count++;
            }
        }
        return count;
    }


    //Second task
    public static <V> String getStringOfAllElements(HashSet<V> hashSet) {
        logger.info("Method for gets String all elements from HashSet was called");
        StringBuilder allElements = new StringBuilder();
        for (V element : hashSet) {
            allElements.append(element.toString()).append(", ");
        }
        return allElements.toString();
    }


    //Third task
    public static <K, V> HashSet<V> getValuesOfHashMap(HashMap<K, V> hashMap) {
        logger.info("Method for gets values of HashMap and input to HashSet");
        return new HashSet<>(hashMap.values());
    }

    //Forth task
    public static <T> String getElementsByPosition(ArrayList<T> arrayList, int index) {
        logger.info("Method for gets string element of ArrayList was called");
        logger.warn("Can be throw " + IndexOutOfBoundsException.class.getSimpleName());

        return arrayList.get(index).toString();
    }

    //Fifth task
    public static <E> ArrayList<E> reverseArrayList(ArrayList<E> arrayList) {
        logger.info("Start to reverse ArrayList " + arrayList.toString());
        Collections.reverse(arrayList);
        return arrayList;
    }
}
