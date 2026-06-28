class Solution {
    public int solution(int[] num_list) {
   StringBuilder oddStr = new StringBuilder();
StringBuilder evenStr = new StringBuilder();

for(int i=0; i<num_list.length; i++)
{
    if(num_list[i]%2==0)
    {
        evenStr.append(num_list[i]);
    }
    else
    {
        oddStr.append(num_list[i]);
    }
}
        int oddNum = Integer.parseInt(oddStr.toString());
int evenNum = Integer.parseInt(evenStr.toString());

int answer = oddNum + evenNum;

return answer;
        
    }
}