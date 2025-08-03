package inflearn.greedy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Greedy_2 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Meeting[] meetings = new Meeting[n];
        for(int i = 0 ; i < n ; i ++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            meetings[i] = new Meeting(start,end);
        }
        Arrays.sort(meetings);
        int ans = 1;
        int max = meetings[0].end;

        for(int i = 1; i < n ; i ++){
            if (max <= meetings[i].start){
                ans ++;
                max = meetings[i].end;
            }
        }
        System.out.println(ans);
    }
    static class Meeting implements Comparable<Meeting>{
        int start, end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
        @Override
        public int compareTo(Meeting o){
            if (this.end == o.end){
                return this.start - o.start;
            }
            return this.end - o.end;
        }

        @Override
        public String toString() {
            return "Meeting{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }
    }
}