package inflearn.stack_queue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Stack_5 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        char[] arr = sc.next().toCharArray();

        //1. ( 을 만나면 넣는다
        //2. ) 를 만나면 바로 앞에께 ( 이거면 레이저임 peek으로 확인
        //3. ans 는 자르는거니까 (의 개수를 세면되나?
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < arr.length; i ++){
            if (arr[i] == '('){
                stack.push(arr[i]);
            }else{
                //이럼 레이저임
                if (arr[i-1] == '('){
                    stack.pop();
                    ans += stack.size();
                }else{
                    //막대기의 끝임
                    stack.pop();
                    ans += 1;
                }
            }
        }
        System.out.println(ans);
    }
}