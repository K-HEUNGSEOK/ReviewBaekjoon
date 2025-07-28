package inflearn.problems_to_retry._14day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Sort_3 {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i ++) arr[i] = sc.nextInt();

        //삽입정렬 1부터 시작해서 그 밑에있는것들을 조회해서 큰게 있으면 앞으로 미뤄버리고 마지막에 그걸넣는거임
        //근데 만약 조회하는 i 보다 작은게 있다면 break 로 멈춰주어야함
        for(int i = 1; i < n ; i ++){
            int temp =arr[i], j;
            for(j = i -1; j >= 0 ; j --){
                if (temp < arr[j]){
                    //한칸씩 뒤로 민다
                    arr[j + 1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j + 1] = temp;
        }
        for (int i : arr) {
            System.out.print(i +" ");
        }
    }
}