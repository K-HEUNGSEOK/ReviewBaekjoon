package inflearn.problems_to_retry;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

    public class Stack_retry_Day3 {
        static int n;
        static boolean[] arr;
        public static void main(String[] args) throws FileNotFoundException {
            System.setIn(new FileInputStream("src/input.txt"));
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            Stack<Integer> stack = new Stack<>();
            int ans = 0;
            for(int i = 0; i < str.length(); i ++){
                if (Character.isDigit(str.charAt(i))){
                    stack.push(Integer.parseInt(str.charAt(i) +""));
                }else{
                    int rt = stack.pop();
                    int lt = stack.pop();
                    stack.push(isCheck(str.charAt(i), lt , rt));
                }
            }
            System.out.println(stack.pop());

        }
        static int isCheck(char c, int lt, int rt){
            switch (c){
                case'+':
                    return lt + rt;
                case'-':
                    return lt - rt;
                case '*':
                    return lt * rt;
                case '/':
                    return lt/rt;
            }
            return -1;
        }
    }