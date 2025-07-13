package inflearn.twopointer_window;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sliding_Window_1 {

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        //1. k -1 만큼 먼저 구해놓는다.
        for (int i = 0; i < k - 1; i++) {
            sum += arr[i];
        }
        //k가 3이라면 0 1 까지 구해두고 여기서부터 2 를 추가한다.
        //그럼 k만큼 구해짐
        int ans = 0;
        for(int i = k-1; i < n; i ++){
            sum+=arr[i]; // 여기가 이제 k 만큼의 매출합
            ans = Math.max(ans,sum);
            //원래 i - k 하면 되는데 우린 -1만큼 처음 구했기때문에
            //i - k 하면 예외가 발생함, +1 을해주자
            sum-=arr[i-k+1];
        }
        System.out.println(ans);
    }
}