package inflearn.problems_to_retry._14day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Srot_4 {
    static int [] arr;
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 배열 크기
        int m = sc.nextInt(); // 숫자 들어오는 갯수
        arr = new int[n];

        for(int i = 0 ; i < m ; i ++){
            int k = sc.nextInt(); // 들어오는 숫자
            if (isCheck(k) == -1){
                //miss
                miss(k);
            }else{
                hit(k, isCheck(k));
            }
        }
        for (int i : arr) {
            System.out.print(i +" ");
        }
    }
    static void hit(int v, int index){
        for(int i = index; i >= 1; i --){
            arr[i] = arr[i-1];
        }
        arr[0] = v;
    }
    static void miss(int v){
        for(int i = arr.length-1; i >= 1; i --){
            arr[i] = arr[i-1];
        }
        arr[0] = v;
    }
    static int isCheck(int v){
        for(int i = 0 ; i < arr.length; i ++){
            if (arr[i] == v){
                return i;
            }
        }
        return -1;
    }
}