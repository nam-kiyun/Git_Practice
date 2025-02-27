package Baekjoon;
import java.io.*;
import java.util.*;

public class Okunsu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i =0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int[] answer = new int[N];

        for(int i =0;i<N;i++){
            while(!stack.empty() && arr[i]>arr[stack.peek()]) {
                answer[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while (!stack.empty()) {
            answer[stack.pop()]= -1;
        }

        for(int i=0;i<answer.length;i++){
            sb.append(answer[i]).append(" ");
        }
        System.out.println(sb);
    }
}
