package JianzhiOffer;

public class Offer_29_spiralOrder {
    public int[] spiralOrder(int[][] matrix) {
        int[] ret = new int[10001];

        int t = 0, b = matrix.length, l = 0, r = matrix[0].length;

        int n = 0;
        while (n < matrix.length * matrix[0].length){
            int c = l;
            while (c<=r){
                ret[n] = matrix[t][c];
                c++;
                n++;
            }
            t++;

            c = t;
            while (c<=b){
                ret[n] = matrix[c][r];
                n++;
                c++;
            }
            r--;

            c = r;
            while (c>=l){
                ret[n] = matrix[b][c];
                c--;
                n++;
            }
            b--;

            c = b;
            while (c>=t){
                ret[n] = matrix[c][l];
                n++;
                c--;
            }
            l++;
        }

        return ret;
    }
}
