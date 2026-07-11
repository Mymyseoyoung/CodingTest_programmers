import java.util.*;
class Solution {
    public int[] solution(int n) {
        
        List<Integer> list = new ArrayList<>();
        
        
            list.add(n);
        
        // 크기 알 수 없을 때는 while 사용하기 ! 
          while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }

            list.add(n);
        }

        int[] answer = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
    answer[k] = list.get(k);
}
        return answer;
    }
}