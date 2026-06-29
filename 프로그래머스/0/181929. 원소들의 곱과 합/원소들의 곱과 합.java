class Solution {
    public int solution(int[] num_list) {
        
        int sum=0;
        int product =1;
        for(int i=0;i<num_list.length;i++)
        {
            sum+=num_list[i];
        }
         for(int i=0;i<num_list.length;i++)
        {
            product*=num_list[i];
        }
        int sum2=sum*sum;
        
        if(product<sum2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
        
    }
}