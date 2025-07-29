package inflearn.problems_to_retry._7day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Stack_3 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        //숫자면 다 스택에 넣고 연산자를 만나면 계산하자
        char[] arr = sc.next().toCharArray();
        java.util.Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < arr.length; i ++){
            if (Character.isDigit(arr[i])){
                stack.push(arr[i] - '0');
            }else{
                int lt = stack.pop();
                int rt = stack.pop();
                int num = getNumber(rt,lt,arr[i]);
                stack.push(num);
            }
        }
        System.out.println(stack.pop());

    }
    static int getNumber(int a, int b, char c){
        switch (c){
            case '+':
                return a + b;
            case'-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
        }
        return -1;
    }
}