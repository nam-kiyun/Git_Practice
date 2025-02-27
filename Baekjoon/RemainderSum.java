package Baekjoon;
import java.io.*;
import java.util.*;

public class RemainderSum {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] S = new int[N];
        //나머지 값의 중복값을 알기 위해 크기는 M만큼
        int[] B = new int[M];

        st = new StringTokenizer(br.readLine());
        S[0]=Integer.parseInt(st.nextToken());

        for(int i=1;i<N;i++){
            S[i]=S[i-1]+Integer.parseInt(st.nextToken());
        }
        int count = 0;
        for(int i=0;i<N;i++){
            int remainder = S[i]%M;
            if(remainder==0) count++;
            //나머지 배열의 크기를 M으로 했기 때문에 index값이 remainder 변수의 경우의 수가 된다.
            B[remainder]++;
        }
        for(int i=0;i<M;i++){
            if(B[i]>1){
                count = count + (B[i]*(B[i]-1)/2);
            }
        }
        sb.append(count);
        System.out.println(count);
    }
}
