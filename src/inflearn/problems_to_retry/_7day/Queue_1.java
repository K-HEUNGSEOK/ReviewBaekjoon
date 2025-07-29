package inflearn.problems_to_retry._7day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Queue_1 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Queue<Integer> queue = new ArrayDeque<>();
        //m 마다 큐를 꺼내서 버리자
        for(int i = 1; i <= n ; i++) queue.offer(i);
        int cnt = 0;
        while (queue.size() > 1){
            Integer poll = queue.poll();
            cnt ++;
            if(cnt != m){
                queue.offer(poll);
            }else{
                cnt = 0;
            }
        }
        System.out.println(queue.poll());
    }
}