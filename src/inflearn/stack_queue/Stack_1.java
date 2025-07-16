package inflearn.stack_queue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Stack_1 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char c : arr){
            if(c == '('){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    System.out.print("NO");
                    return;
                }else {
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()){
            System.out.print("NO");
        }else{
            System.out.print("YES");
        }
    }
}