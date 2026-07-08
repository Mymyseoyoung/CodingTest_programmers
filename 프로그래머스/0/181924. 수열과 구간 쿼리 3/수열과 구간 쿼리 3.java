class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        //queries 배열을 순회하면서 하나씩 !! 
        for(int[] query : queries)
        {
            int i = query[0];
            int j= query[1];
             int temp = arr[i];
               arr[i]=arr[j];
                arr[j]=temp;
                
        }
        return arr;
    }
}