package inflearn.problems_to_retry;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Stack_retry_1 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][n+1];
        for(int i = 1; i <= n ; i ++){
            for(int j = 1; j <= n ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        int [] command = new int[k];
        for(int i = 0 ; i < k ; i ++)command[i] = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for(int i = 0;  i < k; i ++){
            int direction = command[i];
            int cnt = 1 ;
            while (true){
                int temp = arr[cnt][direction];
                if (cnt <= n && temp != 0){
                    if (!stack.isEmpty() && stack.peek() == temp){
                        ans +=2;
                        stack.pop();
                        arr[cnt][direction] = 0;
                        break;
                    }else{
                        stack.push(temp);
                        arr[cnt][direction] = 0;
                        break;
                    }
                }else{
                    cnt ++;
                }
                if (cnt > n){
                    break;
                }
            }
        }
        System.out.println(ans);

    }
}