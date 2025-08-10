package inflearn.problems_to_retry._14day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Stack_1 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][n+1];
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1; j <= n ; j ++){
                arr[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] command = new int[m];
        for(int i = 0 ; i < m ; i ++) command[i] = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        //인형뽑기 시작
        for(int i = 0; i < m ; i ++){
            int doll = command[i]; // 인형
            for(int j = 1 ; j <= n; j ++){
                if (arr[j][doll] != 0){
                    if (!stack.isEmpty()){
                        if (arr[j][doll] == stack.peek()){
                            stack.pop();
                            ans +=2;
                        }else{
                            stack.push(arr[j][doll]);
                        }
                    }else{
                        stack.push(arr[j][doll]);
                    }
                    arr[j][doll] = 0;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
    static void print(int[][] arr){
        for(int i = 1 ; i < arr.length; i ++){
            for(int j = 1; j < arr.length; j ++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}