package homework16;

import java.util.HashMap;
import java.util.Map;

public class StringRepeat {
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> frequency = new HashMap<>();
        for (String s : strings) {
            frequency.put(s, frequency.getOrDefault(s, 0) + 1);
        }
        Map<String, Boolean> result = new HashMap<>();
        for (String key : frequency.keySet()) {
            int count = frequency.get(key);
            result.put(key, count >= 2);
        }
        return result;
    }

        public static Map<String, String> pairs(String[] strings) {
            Map<String, String> result = new HashMap<>();
            for (String s : strings) {
                String first = String.valueOf(s.charAt(0));
                String last = String.valueOf(s.charAt(s.length() - 1));
                result.put(first, last);
            }
            return result;
        }

}
