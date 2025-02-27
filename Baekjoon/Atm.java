package Baekjoon;
import java.io.*;
import java.util.*;

public class Atm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int result = 0;
        for(int i=0;i<arr.length;i++){
            result+=arr[i]*N--;
        }
        sb.append(result);
        System.out.println(sb);
    }
}
