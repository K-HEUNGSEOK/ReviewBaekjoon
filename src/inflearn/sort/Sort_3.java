package inflearn.sort;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Sort_3 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++)arr[i] = sc.nextInt();
        //1. i는 1부터 돈다, j는 i-1 부터 0까지
        //2. if arr[j] 가 temp 보다 크면 arr[j]를 뒤로 밀어줘야함
        //3. 그 뒤에 j가 멈춘 지점에 temp 를 넣으면 됨
        for(int i = 1; i < n ; i ++){
            int temp = arr[i], j;
            for(j = i -1; j >= 0 ; j --){
                if (arr[j] > temp){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j +1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}