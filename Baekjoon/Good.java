package Baekjoon;
import java.io.*;
import java.util.*;

public class Good {
    public static void main (String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] A=new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            A[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int count=0;

        for(int k=0;k<N;k++){
            int goodNum = A[k];
            int start=0;
            int end=N-1;

            while (start<end) {
                if(A[start]+A[end]==goodNum){
                    if(start != k && end != k) {
                        count++;
                        break;
                    } else if (start==k) {
                        start++;
                    } else if (end==k); {
                        end--;
                    }
                } else if (A[start]+A[end]>goodNum) {
                    end--;
                } else if (A[start]+A[end]<goodNum) {
                    start++;
                }
            }
        }
        sb.append(count);
        System.out.println(count);
    }
}
