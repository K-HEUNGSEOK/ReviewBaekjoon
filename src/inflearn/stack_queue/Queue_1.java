package inflearn.stack_queue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Queue_1 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i = 1; i <=n ; i++){
            queue.offer(i);
        }
        System.out.println(queue);
        int cnt = 0;
        while (queue.size() > 1){
            cnt ++;
            int pos = queue.poll();
            if (cnt == k){
                cnt = 0;
            }else{
                queue.offer(pos);
            }
        }
        System.out.println(queue);
    }
}