class Solution {
    public int[] solution(int start_num, int end_num) {
        
        int s=end_num-start_num+1;
        int sum=start_num-1;
        
        //크기 지정하는 것을 하지 않음 
        //int[] answer={} -> 이거는 크기가 0인 배열일세 !! 
        int[] answer = new int[s];
        
        for(int i=0;i<s;i++)
        {
            sum+=1;
            answer[i]=sum;
        }
        return answer;
    }
}