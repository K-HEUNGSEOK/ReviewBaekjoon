package inflearn.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array_10 {
    static int [] dx = {-1,0,1,0};
    static int [] dy = {0,1,0,-1};
    static int[][] arr;
    static int n ;
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
       arr = new int[n][n];
        for(int i =0 ;i < n ; i++){
            for(int j = 0; j < n ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
        int ans = 0;
        for(int i = 0; i < n ; i ++){
            for(int j = 0; j < n ; j ++){
                if (isCheck(i,j)){
                    ans ++;
                }
            }
        }
        System.out.println(ans);

    }
    static boolean isCheck(int x , int y){
        for(int i = 0 ; i < 4; i ++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (!isRange(nx,ny)) continue;
            if (arr[x][y] <= arr[nx][ny]){
                return false;
            }
        }
        return true;
    }
    static boolean isRange(int x, int y){
        return  0 <= x && x < n && 0 <= y && y < n;
    }
}