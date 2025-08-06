package inflearn.problems_to_retry._14day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Two_Pointer_2 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int total = 0;
        int cnt = 0;
        int lt= 1;
        for(int i = 1; i <= target / 2 + 1; i ++){
            total += i;
            while (total >= target){
                if (total == target){
                    cnt ++;
                }
                total -= lt;
                lt ++;
            }
        }
        System.out.println(cnt);
    }
}