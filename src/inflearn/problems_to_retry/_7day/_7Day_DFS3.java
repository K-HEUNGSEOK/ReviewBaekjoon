package inflearn.problems_to_retry._7day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _7Day_DFS3 {
    static int[][] arr;
    static int cnt, n;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        cnt = 0;
        n = 7;
        arr = new int[n][n];
        for(int i = 0 ; i < n; i ++){
            for(int j = 0 ; j < n ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
        DFS(0,0);
        System.out.println(cnt);
    }
    static void DFS(int x, int y){
        if (x == 6 && y == 6){
            cnt ++;
        }else{
            arr[x][y] = 1;
            for(int i = 0 ; i < 4; i ++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (isRange(nx,ny) && arr[nx][ny] == 0){
                    arr[nx][ny]= 1;
                    DFS(nx,ny);
                    arr[nx][ny]= 0;
                }
            }
        }
    }
    static boolean isRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}