class Solution {
    public String solution(int[] numLog) {
        
        StringBuilder sb=new StringBuilder();
        
        //1번 인덱스부터 끝까지 쭉 순회 
        for(int i=1;i<numLog.length;i++)
        {
            int diff=numLog[i]-numLog[i-1];
            
            //차이가 몇이냐에 따라 다른 애를 sb에 append 해줌
            switch(diff)
            {
                case 1:
                    sb.append('w');
                    break;
                    
                case -1:
                    sb.append('s');
                    break;
                    
                case 10:
                    sb.append('d');
                    break;
                    
                case -10:
                    sb.append('a');
                    break;
            }
        }
        
        
        return sb.toString();
    }
    
}
