package inflearn.stack_queue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Stack_4 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        Stack<Integer> stack = new Stack<>();
        int lt = 0 , rt = 0, sum = 0;
        for (char c : arr) {
            if (Character.isDigit(c)){
                stack.push(Integer.parseInt(c+""));
            }else{
                 rt = stack.pop();
                 lt = stack.pop();
                 sum = getNumber(c,lt,rt);
                stack.push(sum);
            }
        }
        System.out.println(stack.pop());
    }

    private static int getNumber(char c ,int lt, int rt) {
        switch (c){
            case '-':
                return lt - rt;
            case '+':
                return lt + rt;
            case '*':
                return lt * rt;
            case '/':
                return lt/rt;
        }
        return -1;
    }
}