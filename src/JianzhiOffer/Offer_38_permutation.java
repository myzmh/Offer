package JianzhiOffer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Offer_38_permutation {

    char[] c;
    List<String> res = new ArrayList<>();

    public String[] permutation(String s) {
        if (s.equals("")) return new String[0];
        c = s.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);
    }

    public void dfs(int x) {
        if (x == c.length-1) {
            res.add(String.valueOf(c)); //不可以直接使用toString
            return;
        }
        Set<Character> set = new HashSet<Character>();
        for (int i = x; i < c.length; i++) {
            if (set.contains(c[i])) continue;
            set.add(c[i]);
            swap(i,x);
            dfs(x+1);
            swap(i,x);
        }
    }

    public void swap(int x, int y) {
        char tmp = c[x];
        c[x] = c[y];
        c[y] = tmp;
    }
}
