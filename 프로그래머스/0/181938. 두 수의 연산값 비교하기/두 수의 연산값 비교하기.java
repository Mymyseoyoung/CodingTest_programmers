class Solution {
    public int solution(int a, int b) {
        
        int result1=Integer.parseInt(""+a+b);
        int result2=Integer.parseInt(""+2*a*b);
        
        return Math.max(result1,result2);
        
        
    }
}