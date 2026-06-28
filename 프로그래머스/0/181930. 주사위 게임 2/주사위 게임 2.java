import java.util.*;
class Solution {
    public int solution(int a, int b, int c) {
        
        Set<Integer> set =new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        
        int size = set.size();
        
        int answer = 0;
        
        if(size==3)
        {
            answer=a+b+c;
        }
        else if(size==2)
        {
            answer=(a+b+c)*(a*a+b*b+c*c);
        }
        else
        {
            answer=(a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        }
        return answer;
    }
}