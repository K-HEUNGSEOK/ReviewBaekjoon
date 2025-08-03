package inflearn.greedy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Greedy_4 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        List<Company> list = new ArrayList<>();
        int n = sc.nextInt();
        int max = 0; //날짜 저장하는 것
        for(int i = 0 ; i < n ; i ++){
            int m = sc.nextInt();
            int d = sc.nextInt();
            max = Math.max(max,d);
            list.add(new Company(m,d));
        }
        Collections.sort(list);
        //날짜는 큰거부터 처리한다.\
        int j = 0;
        int total = 0;
        for(int i = max; i >= 1; i --){
            for(; j < n ; j ++){
                if (list.get(j).day < i){
                    break;
                }else{
                    queue.offer(list.get(j).money);
                }
            }
            if (!queue.isEmpty()){
            total += queue.poll();
            }
        }
        System.out.println(total);
    }
    static class Company implements Comparable<Company>{
        int money, day;

        public Company(int money, int day) {
            this.money = money;
            this.day = day;
        }
        @Override
        public int compareTo(Company o){
            return o.day - this.day;
        }
    }
}