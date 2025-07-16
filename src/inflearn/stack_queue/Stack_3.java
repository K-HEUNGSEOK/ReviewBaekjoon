package inflearn.stack_queue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Stack_3 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][n+1];
        for(int i = 1; i <= n ; i ++){
            for(int j = 1 ; j <= n ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] move = new int[m];
        for(int i = 0 ; i < m ; i ++) move[i] = sc.nextInt();

        int ans = 0; //정답
        Stack<Integer> stack = new Stack<>();

        //0이면 쭉 밑으로 들어가는거고
        //n을 넘어가면 종료
        for(int mv : move){
            if(arr[1][mv] != 0){
                if(!stack.isEmpty() && stack.peek() == arr[1][mv]){
                    ans += 2;
                    stack.pop();
                }else{
                    stack.push(arr[1][mv]);
                }
                arr[1][mv] = 0;
            }else{
                int cnt = 2;
                while(true){
                    if(cnt > n){
                        break;
                    }
                    if (arr[cnt][mv] != 0){
                        if(!stack.isEmpty() && stack.peek() == arr[cnt][mv]){
                            ans += 2;
                            stack.pop();
                        }else{
                            stack.push(arr[cnt][mv]);
                        }

                        arr[cnt][mv] = 0;
                        break;
                    }
                    cnt ++;
                }
            }
        }
        System.out.print(ans);
    }
}