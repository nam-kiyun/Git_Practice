package Baekjoon;
import java.io.*;
import java.util.*;

public class RoomNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[9];

        String N = br.readLine();
        String[] str = N.split("");
        for(int i =0;i<str.length;i++){
            int n=Integer.parseInt(str[i]);
//            arr[n]++;
            if(n==9) {
                n=6;
                arr[n]++;
            } else {
                arr[n]++;
            }
        }
        if(arr[6]%2==0) {
            arr[6]=arr[6]/2;
        } else {
            arr[6]=arr[6]/2+1;
        }
        int count=0;
        for(int i=0;i<arr.length;i++) {
            if(count<arr[i]) {
                count = arr[i];
            }
        }
        sb.append(count);
        System.out.println(sb);
    }
}
