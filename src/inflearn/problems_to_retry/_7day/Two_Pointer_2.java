package inflearn.problems_to_retry._7day;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Two_Pointer_2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int cnt = 0;
        int lt = 1;
        for(int i = 1; i <= n / 2 + 1; i ++){
            sum += i;
            while (sum >= n){
                if (sum == n){
                    cnt ++;
                }
                sum -= lt++;
            }
        }
        System.out.println(cnt);
    }
}