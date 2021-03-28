package JianzhiOffer;

public class Offer_58_reverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        String s1 = s.substring(0,n);
        String s2 = s.substring(n, s.length());
        System.out.println(s1);
        System.out.println(s2);
        return s1.concat(s2);
    }
}
