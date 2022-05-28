package utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hewei
 * @date 2022/2/26
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>(4);
        map.put(null, null);
        map.put(null, 1);
        System.out.println(map);
    }
}
