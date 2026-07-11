import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        
        //리스트는 크기 지정 x 
        List<Integer> list = new ArrayList<>();
        
        for(int i=l;i<=r;i++)
        {
            // 문자열을 저장할 애를 선정 
        
            String str = String.valueOf(i) ;
            boolean isValid=true;
                
            for(int j=0;j<str.length();j++)
            {
                char ch=str.charAt(j);
                if(ch !='0'&&ch!='5')
            {
                isValid=false;
                break;
                
            }
                
                
                
            }
            
            //모든 자리가 0또는 5로 설정되어있으면 .. 
            
                if(isValid)
                {
                   list.add(i);
                }
        }
            
            if(list.isEmpty())
            {
                return new int[]{-1};
            }
            
            //List 를 int[]로 변환 
            int[] answer= new int[list.size()];
            
            for(int k=0;k<list.size();k++)
            {
                answer[k]=list.get(k);
            }
        
        return answer;
    }
}