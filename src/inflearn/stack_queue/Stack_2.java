package inflearn.stack_queue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Stack_2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        //스택이 비어있을때만 그 문자열을 출력하자
        char[] arr = sc.next().toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char c : arr){
            if(c == '('){
                stack.push(c);
            }else{
                if(c == ')'){
                    stack.pop();
                }else if(stack.isEmpty()){
                    System.out.print(c);

                }
            }
        }
    }
}