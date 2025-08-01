package inflearn.bfs_dfs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS_12 {
    static boolean flag = false;
    static int cnt, n;
    static int[][] graph;
    static boolean[][] ch;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        n = 7;
        cnt = Integer.MAX_VALUE;
        graph = new int[n][n];
        ch = new boolean[n][n];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                graph[i][j] = sc.nextInt();
            }
        }
        DFS(0,0);
        if (flag){
        System.out.println(cnt);
        }else{
            System.out.println(-1);
        }
    }
    static void DFS(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        ch[x][y] = true;
        queue.offer(new int[]{x,y});
        int l =  0;
        while (!queue.isEmpty()){
            int len = queue.size();
            for(int i = 0 ; i < len; i ++){
                int[] poll = queue.poll();

                for(int move = 0 ; move < 4 ; move ++){
                    int nx = poll[0] + dx[move];
                    int ny = poll[1] + dy[move];
                    if (nx == 6 && ny ==6){
                        flag = true;
                        cnt = l+1;
                        return;
                    }
                    if (isRange(nx,ny) && !ch[nx][ny] && graph[nx][ny] == 0){
                        ch[nx][ny] = true;
                        queue.offer(new int[]{nx,ny});
                    }
                }
            }
            l ++;
        }
    }
    static boolean isRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}