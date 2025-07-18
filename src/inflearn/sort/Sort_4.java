package inflearn.sort;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sort_4 {
    static int[] arr;
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];

        for(int i = 0 ; i < m ; i ++){
            int temp = sc.nextInt();
            int index = isCheck(temp);

            if (index == -1){
                CacheMiss(temp);
            }else{
                CacheHit(temp,index);
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    static void CacheHit(int temp, int index){
        //1.이건 해당 temp까지 뒤로 밀고 맨 앞에 temp 넣는 것
        for(int i = index; i >= 1; i --){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
    static void CacheMiss(int temp){
        //다 뒤로 밀고 맨 앞에 temp를 넣는 것
        for(int i = arr.length-1; i >= 1; i --){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
    static int isCheck(int temp){
        for(int i = 0 ; i < arr.length; i ++){
            if (arr[i] == temp){
                return i;
            }
        }
        return -1;
    }
}