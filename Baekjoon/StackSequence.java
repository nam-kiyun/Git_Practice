package Baekjoon;
import java.io.*;
import java.util.*;

public class StackSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int num = 1;

        for (int i = 0; i<N; i++) {
            int k = Integer.parseInt(br.readLine());
            for(; num<=k; num++) {
                stack.push(num);
                sb.append("+").append("\n");
            }
            if(stack.peek()==k) {
                stack.pop();
                sb.append("-").append("\n");
            }
        }
        if(!stack.empty()) {
            sb.delete(0,sb.length());
            sb.append("NO");
            System.out.println(sb);

        } else {
            System.out.println(sb);
        }
    }
}
