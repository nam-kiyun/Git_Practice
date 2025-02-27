package Baekjoon;
import java.io.*;
import java.util.*;

public class SumOfTwoNumber {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        int x = Integer.parseInt(br.readLine());
        int count = 0;
        Arrays.sort(a);
        int i=0;
        int j=n-1;
        int sum=0;
        while(i<j){
            sum = a[i]+a[j];
            if(sum==x){
                count++;
            }
            if(sum>x) {
                j--;
            } else {
                i++;
            }
        }
//        for(int i =0;i<a.length;i++){
//            for(int j=0;j<a.length;j++){
//                if(i<j){
//                    if(x==a[i]+a[j]) {
//                        count++;
//                    }
//                }
//            }
//        }
        sb.append(count);
        System.out.println(sb);
        }
}
