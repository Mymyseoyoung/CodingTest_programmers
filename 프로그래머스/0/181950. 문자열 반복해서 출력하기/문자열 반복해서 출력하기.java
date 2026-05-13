import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 공백을 기준으로 문자열을 분리
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String str = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        
        System.out.print(sb.toString());
    }
}