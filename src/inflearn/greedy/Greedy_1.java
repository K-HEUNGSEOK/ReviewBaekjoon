package inflearn.greedy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Greedy_1 {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        //키와 몸무가 모두 다 작으면 이제 뽑히는거임
        //키를 내림차 순으로 정렬했으니까 몸무게만 보면됨
        int n = sc.nextInt();
        Player[] arr = new Player[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = new Player(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(arr);
        int ans = 1;
        int max = arr[0].weight;
        for(int i = 1 ; i < n ; i ++){
            if (max < arr[i].weight){
                max = arr[i].weight;
                ans ++;
            }
        }
        System.out.println(ans);


    }

    static class Player implements Comparable<Player>{
        int height, weight;

        public Player(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }
        @Override
        public int compareTo(Player o){
            return o.height - this.height;
        }

        @Override
        public String toString() {
            return "Player{" +
                    "height=" + height +
                    ", weight=" + weight +
                    '}';
        }
    }
}