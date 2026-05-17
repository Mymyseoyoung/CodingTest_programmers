class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        //앞부분 잘라내기 
        String before = my_string.substring(0, s);
        
        // 원래 문자열에서 잘라내기 
        String after = my_string.substring(s + overwrite_string.length());
        
        //합쳐서 결과 만들기
        String answer = before + overwrite_string + after;
        
        // 리턴하기 
        return answer;
    }
}