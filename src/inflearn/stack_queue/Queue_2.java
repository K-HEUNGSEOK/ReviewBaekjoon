package inflearn.stack_queue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Queue_2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        String target = sc.next();
        Queue<Character> queue = new ArrayDeque<>();
        for (char c : arr) {
            queue.offer(c);
        }

        boolean check = true;

        for(int i = 0 ; i < target.length(); i ++){
            if (queue.contains(target.charAt(i))){
                if (target.charAt(i)== queue.peek()){
                    queue.poll();
                }else{
                    check = false;
                    break;
                }
            }
        }
        if (!queue.isEmpty()){
            check = false;
        }
        if (check){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}