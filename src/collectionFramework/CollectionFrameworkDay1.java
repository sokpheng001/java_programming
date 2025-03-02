package collectionFramework;

import java.util.*;

/**
 * @author Kim Chansokpheng
 * @version 1.0
 * <p>This class is used for learning collection framework</p>
 */
public class CollectionFrameworkDay1 {
    public static void main(String[] args) {
        Set<Integer>  numbers = new TreeSet<>();
        numbers.add(-200);
        numbers.add(-2);
        numbers.add(100);
        numbers.add(1);
        // remove
        numbers.remove(-200);
        // remove if
        numbers.removeIf(sokpheng->sokpheng.equals(100));
        System.out.println(numbers);
    }
}
