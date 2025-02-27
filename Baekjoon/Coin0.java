package Baekjoon;
import java.io.*;
import java.util.*;

public class Coin0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =  new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        int count =0;
        for(int i = 0; i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }

        for(int i=N-1;i>=0;i--){
            if(K>=arr[i]){
                K=K-arr[i];
                count++;
                i=N;
            } else if(K==0) break;
        }

        sb.append(count);
        System.out.println(sb);
    }
}
