class Solution {
    public int solution(int[] num_list) {
        
        int sum1=0;
        int sum2=1;
        
        for(int i=0;i<num_list.length;i++)
        {
            sum1+=num_list[i];
            sum2*=num_list[i];
            
        }
        int sum3=(sum1)*(sum1);
        if(sum3>sum2)
        {
            return 1;
        }
        else 
        {
            return 0;
        }
    }
}