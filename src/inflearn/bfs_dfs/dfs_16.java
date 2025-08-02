package inflearn.bfs_dfs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS_16 {
    static int[] dx = {-1,-1,0,1,1,1,0,-1};
    static int[] dy = {0,1,1,1,0,-1,-1,-1};
    static int n, cnt;
    static int[][] graph;
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        graph = new int[n][n];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                graph[i][j] = sc.nextInt();
            }
        }
        cnt = 0;
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0; j < n ; j ++){
                if (graph[i][j] == 1){
                    cnt ++;
                    BFS(i,j);
                }
            }
        }
        System.out.println(cnt);
    }
    static void BFS(int x,int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        graph[x][y] = 0;
        while (!queue.isEmpty()){
            int[] poll = queue.poll();

            for(int i = 0; i < 8; i ++){
                int nx= poll[0] + dx[i];
                int ny= poll[1] + dy[i];
                if (isRange(nx,ny) && graph[nx][ny] == 1){
                    graph[nx][ny] = 0;
                    queue.offer(new int[]{nx,ny});
                }
            }
        }
    }

    static boolean isRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}