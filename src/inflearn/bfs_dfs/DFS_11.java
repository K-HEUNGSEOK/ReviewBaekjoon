package inflearn.bfs_dfs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class DFS_11 {
    static int cns;
    static int[][] board;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        board = new int[7][7];
        for(int i = 0 ; i < 7 ; i ++){
            for(int j = 0 ; j < 7; j ++){
                board[i][j] = sc.nextInt();
            }
        }
        cns = 0;
        DFS(0,0);
        System.out.println(cns);
    }
    static void DFS(int x, int y){
        if(x == 6 && y == 6) cns ++;
        else{

            for(int i = 0 ; i < 4; i ++){
                int nx = dx[i] + x;
                int ny = dy[i] + y;
                if (isRange(nx,ny) && board[nx][ny] == 0){
                    board[x][y] = 1;
                    DFS(nx,ny);
                    board[x][y] = 0;
                }
            }
        }
    }
    static boolean isRange(int x, int y){
        return 0 <=x && x < 7 && 0 <= y && y < 7;
    }
}