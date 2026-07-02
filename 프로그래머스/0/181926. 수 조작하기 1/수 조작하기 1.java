class Solution {
    public int solution(int n, String control) {
        // control 문자열을 한 글자씩 잘라서 char 배열로 변환! 
        
        for(char c :control.toCharArray())
        {
            switch(c)
            {
                case 'w':
                    n=n+1;
                    break;
                case 's':
                    n=n-1;
                    break;
                case 'd':
                    n=n+10;
                    break;
                case 'a':
                    n=n-10;
                    break;
                
            }
    }
        
        return n;
}
}