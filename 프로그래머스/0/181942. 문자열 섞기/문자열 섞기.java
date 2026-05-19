class Solution {
    public String solution(String str1, String str2) {
        
        StringBuilder sb = new StringBuilder();
        
        // 두 문자열의 길이가 같으므로 .. str1 길이만큼 반복 
        for(int i =0;i<str1.length();i++)
        {
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));
            
        }
        
        return sb.toString();
        
    }
}