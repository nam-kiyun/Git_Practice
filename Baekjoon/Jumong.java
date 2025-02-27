package Baekjoon;
import java.io.*;
import java.util.*;

public class Jumong {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] A=new int[N];

        StringTokenizer st = new StringTokenizer((br.readLine()));
        for(int i = 0; i<A.length; i++){
            A[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int start = 0;
        int end = A.length-1;
        int count=0;
        while (start<end){
            if(A[start]+A[end]==M){
                count++;
                start++;
            } else if (A[start]+A[end]>M) {
                end--;
            } else if (A[start]+A[end]<M) {
                start++;
            }
        }
        sb.append(count);
        System.out.println(sb);
    }
}
