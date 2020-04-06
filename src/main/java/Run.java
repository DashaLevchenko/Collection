import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Run {
    public static Logger logger = LogManager.getLogger(Run.class.getName());

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(4, "Three");
        logger.info("First task: " + CollectionOperations.countWordCoincidence(hashMap, "Three") + "\n");

        List<String> arrays = Arrays.asList("One", "Two", "Three", "Four", "Five");
        logger.info("Second task: " + CollectionOperations.getStringOfAllElements(new HashSet<Object>(arrays)) + "\n");

        logger.info("Third task: " + CollectionOperations.getValuesOfHashMap(hashMap) + "\n");

        ArrayList<String> arrayList = new ArrayList<>(arrays);
        logger.info("Forth task: " + CollectionOperations.getElementsByPosition(arrayList, 2) + "\n");

        logger.info("Fifth task: " + CollectionOperations.reverseArrayList(arrayList) + "\n");

    }
}
