package inflearn.bfs_dfs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n+1][n+1];

        for(int i = 1; i <= n ; i ++){
            for(int j = 1; j <=n ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] command = new int[m];
        for(int i = 0 ; i < m ; i ++) command[i] = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for(int i = 0 ; i < m ; i ++){
            int c = command[i];
            int cnt = 1;

            while (cnt < n && arr[cnt][c] == 0){
                cnt ++;
            }

            //나온 인형
            int doll = arr[cnt][c];

            if (!stack.isEmpty()&& stack.peek() == doll){
                ans +=2;
                stack.pop();
            }else{
                stack.push(doll);
            }

            arr[cnt][c] = 0;

        }
        System.out.println(ans);
    }
}