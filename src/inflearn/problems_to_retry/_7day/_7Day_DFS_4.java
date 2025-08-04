package inflearn.problems_to_retry._7day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _7Day_DFS_4 {
    static int[][] arr;
    static int cnt, n;
    static boolean[][] ch;
    static int[][] box;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        n = 7;
        cnt = 0;
        arr = new int[n][n];
        ch = new boolean[n+1][n+1];
        for(int i = 0 ; i < n; i ++){
            for(int j = 0 ; j < n ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
        box = new int[n+1][n+1];
        BFS(0,0);
        if (box[6][6]==0){
            System.out.println(-1);
        }else{
            System.out.println(box[6][6]);
        }
    }
    static void BFS(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        ch[x][y] = true;
        while (!queue.isEmpty()){
            int[] poll = queue.poll();
            for(int i = 0 ; i < 4; i ++){
                int nx = poll[0] + dx[i];
                int ny = poll[1] + dy[i];
                if (nx == 6 && ny ==6){
                    box[nx][ny] = box[poll[0]][poll[1]] + 1;
                    return;
                }
                if (isRange(nx,ny) && !ch[nx][ny] && arr[nx][ny] == 0){
                    ch[nx][ny] = true;
                    box[nx][ny] = box[poll[0]][poll[1]] + 1;
                    queue.offer(new int[]{nx,ny});
                }
            }
        }
    }

    static boolean isRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}