package JianzhiOffer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Offer_50_firstUniqChar {
    public char firstUniqChar(String s) {
        Map<Character, Boolean> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for (char c: ch) {
            map.put(c, !map.containsKey(c));
//            if (map.get(c) != null) map.put(c,1);
//            else map.
        }
        for (char c: ch) {
            if (map.get(c)) return c;
        }

        return ' ';
    }
}
