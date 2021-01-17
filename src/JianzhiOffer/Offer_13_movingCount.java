package JianzhiOffer;

import java.util.LinkedList;
import java.util.Queue;

public class Offer_13_movingCount {
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        int num = dfs(0,0,m,n,k,visited);
        return num;
    }

    public int dfs(int i, int j, int m, int n, int k, boolean[][] visited){
        if (i < 0 || i >= m || j < 0 || j >= n || i % 10 + i / 10 + j % 10 + j / 10 > k || visited[i][j] == true)
            return 0;

        visited[i][j] = true;
        return dfs(i + 1, j, m, n, k, visited) + dfs(i - 1, j, m, n, k, visited) +
                dfs(i, j + 1, m, n, k, visited) + dfs(i, j - 1, m, n, k, visited) + 1;
    }

    public int moving(int m, int n, int k){
        if(k==0) return 1;
        boolean[][] visited = new boolean[m][n];

        Queue<int[]> queue = new LinkedList<int []>();
        queue.offer(new int[]{0,0});
        visited[0][0] = true;

        int num = 1;
        int dx[] = {0,1};
        int dy[] = {1,0};
        while (!queue.isEmpty()){
            int[] cell = queue.poll();
            for (int i = 0; i < 2; i++){
                int x = cell[0] + dx[i];
                int y = cell[1] + dy[i];
                if (x < 0 || x >= m || y < 0 || y >= n || x % 10 + x / 10 + y % 10 + y / 10 > k || visited[x][y] == true){
                    continue;
                }
                num = num + 1;
                visited[x][y] = true;
                queue.offer(new int[]{x,y});
            }

        }

        return num;
    }

    public int moving2(int m, int n, int k){
        if (k==0) return 1;
        boolean[][] can = new boolean[m][n];
        can[0][0] = true;
        int num = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i%10+i/10+j%10+j/10<=k){
                    if (i-1>=0) can[i][j] |= can[i - 1][j];
                    if (j-1>=0) can[i][j] |= can[i][j - 1];
                    if (can[i][j]) num++;
                }
            }
        }

        return num;
    }

    public static void main(String[] args) {
        Offer_13_movingCount movingCount = new Offer_13_movingCount();
        System.out.println(movingCount.movingCount(2,3,1));
        System.out.println(movingCount.moving(2,3,1));
        System.out.println(movingCount.moving2(2,3,1));
    }
}
