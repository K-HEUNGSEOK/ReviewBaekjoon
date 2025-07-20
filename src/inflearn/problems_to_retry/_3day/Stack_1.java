package inflearn.problems_to_retry._3day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

    public class Stack_1 {
        static int n;
        static boolean[] arr;
        public static void main(String[] args) throws FileNotFoundException {
            System.setIn(new FileInputStream("src/input.txt"));
            Scanner sc = new Scanner(System.in);
            char[] arr = sc.next().toCharArray();
            int ans= 0;
            Stack<Character> stack = new Stack<>();
            for(int i = 0 ; i < arr.length; i ++){
                if (arr[i] == '('){
                    stack.push(arr[i]);
                }else{
                    if (arr[i-1] == '('){
                        stack.pop();
                        ans += stack.size();
                    }else{
                        stack.pop();
                        ans +=1;
                    }
                }
            }
            System.out.println(ans);
        }
    }