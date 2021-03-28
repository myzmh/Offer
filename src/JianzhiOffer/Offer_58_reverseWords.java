package JianzhiOffer;

import com.sun.deploy.util.StringUtils;

public class Offer_58_reverseWords {
    public String reverseWords(String s) { // 要注意  空格是"",不是" "
//        s = s.trim();//如果有下下面那一行 这个可以不用写
        String[] strings = s.split(" ");
        if(strings.length == 0) return "";
        int i = 0;
        int j = strings.length - 1;
        while (i < j) {
            String tmp = strings[i];
            strings[i] = strings[j];
            strings[j] = tmp;
            i++;
            j--;
        }
        StringBuffer sb = new StringBuffer();
        sb.append(strings[0]);
        for (i = 1; i < strings.length-1; i++){
//            System.out.println(strings[i]);
            if (!strings[i].equals("")) sb.append(" " + strings[i]);
        }
        return sb.toString().trim();
    }
}
