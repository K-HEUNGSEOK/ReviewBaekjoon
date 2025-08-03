package inflearn.greedy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Greedy_3 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> list = new ArrayList<>();
        int ans = Integer.MIN_VALUE;
        int cnt = 0;
        for(int i = 0; i < n ; i ++){
            int st = sc.nextInt();
            int et = sc.nextInt();
            list.add(new Time(st,'s'));
            list.add(new Time(et,'e'));
        }
        Collections.sort(list);

        for (Time time : list) {
            if (time.state == 's') {
                cnt ++;
                ans = Math.max(ans,cnt);
            }else{
                cnt --;
            }
        }
        System.out.println(ans);
    }
    static class Time implements Comparable<Time>{
        int time;
        char state;

        public Time(int time, char state) {
            this.time = time;
            this.state = state;
        }
        @Override
        public int compareTo(Time o){
            if (this.time == o.time){
                return this.state - o.state;
            }
            return this.time - o.time;
        }

        @Override
        public String toString() {
            return "Time{" +
                    "time=" + time +
                    ", state=" + state +
                    '}';
        }
    }
}