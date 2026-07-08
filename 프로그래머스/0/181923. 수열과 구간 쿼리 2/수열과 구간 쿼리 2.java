class Solution {
    public int[] solution(int[] arr, int[][] queries) {
    
        //정답 배열
        int[] result = new int[queries.length];
        
        for(int i =0; i<queries.length;i++)
        {
            int s=queries[i][0];
            int e=queries[i][1];
            int k=queries[i][2];
            
            int minVal=Integer.MAX_VALUE;
            
            for(int q=s;q<=e;q++)
            {
                if(arr[q]>k&&arr[q]<minVal)
                {
                    minVal=arr[q];
                }
            }
            
            if(minVal==Integer.MAX_VALUE)
            {
                result[i]=-1;
            }
            else{
                result[i]=minVal;
            }
        }
        
        return result;
    }
}