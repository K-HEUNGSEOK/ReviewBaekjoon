package inflearn.problems_to_retry._7day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Stack_1 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // ) 이게 왔을때 바로 전께 ( 이거면 레이저고
        // ) 이게 왔는데 전께 ( 이게 아니면 막대기임
        // 레이저면 pop 을 하고 size 를 더하고 레이저가 아니면 팝 하고 그냥 1만 더하면 됨

        java.util.Stack<Character> stack = new Stack<>();
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (temp == '('){
                stack.push(temp);
            }else{
                if (str.charAt(i-1) == '('){
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