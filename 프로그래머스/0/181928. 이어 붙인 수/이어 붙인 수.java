class Solution {
    public int solution(int[] num_list) {
        String oddStr = "";
        String evenStr ="";
        
        for(int i=0;i<num_list.length;i++)
        {
            if(num_list[i]%2==0)
            {
                evenStr+=num_list[i];
            }
            else
            {
                oddStr+=num_list[i];
            }
        }
        int answer = Integer.parseInt(oddStr)+Integer.parseInt(evenStr);
        return answer;
    }
}