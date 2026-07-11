class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int length=queries.length;
// 반환을 arr을 전체를 해줘야 함 !! 
        
for(int q=0;q<length;q++)
{
    int s =queries[q][0];
    int e=queries[q][1];
    int k=queries[q][2];
    
    for(int i=s;i<=e;i++)
    {
        if(i%k==0)
        {
            arr[i]+=1;
        }
        
    }
}
        return arr;
    }
}