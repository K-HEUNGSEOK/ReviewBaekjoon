package inflearn.problems_to_retry._3day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

    public class Queue_1 {
        static int n;
        static boolean[] arr;
        public static void main(String[] args) throws FileNotFoundException {
            System.setIn(new FileInputStream("src/input.txt"));
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            Queue<Integer> queue = new ArrayDeque<>();
            for(int i = 1; i <= n ; i ++){
                queue.offer(i);
            }
            int cnt = 0;
            while (queue.size() > 1){
                Integer poll = queue.poll();
                cnt ++;

                if (cnt == m){
                    cnt = 0;
                }else{
                    queue.offer(poll);
                }
            }

            System.out.println(queue.poll());
        }
    }