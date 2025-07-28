package inflearn.problems_to_retry._14day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Sort_1 {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++)arr[i] = sc.nextInt();

        //선택 정렬이 제일 낮은애를 맨 앞에 갖다놓는것
        for(int i = 0; i < n-1 ; i ++){
            int index = i;
            for(int j = i  + 1 ; j < n ; j ++){
                if (arr[index] > arr[j]){
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}