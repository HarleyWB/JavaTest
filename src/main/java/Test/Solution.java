package Test;

import java.util.HashMap;
import java.util.Map;

class ThreadTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("2", "3");
        System.out.println(map.get("1"));

    }

}
