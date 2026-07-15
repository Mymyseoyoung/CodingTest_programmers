import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        
        int [] nums ={a,b,c,d};
        
        Map<Integer,Integer> counter = new HashMap<>();
        //빈도 세기 
for(int n : nums)
{
    counter.put(n,counter.getOrDefault(n,0)+1);
}
        
        //빈도값만 뽑아내기 
    List<Integer> counts = new ArrayList<>(counter.values());
        
        Collections.sort(counts,Collections.reverseOrder());
        
        int answer = 0;
        
        if(counts.equals(Arrays.asList(4))
        )
        {
            //key 집합에서 첫번째 원소 가지고오기
            int p = counter.keySet().iterator().next();
            answer =1111*p;
        }
        
        else if(counts.equals(Arrays.asList(3,1)))
        {
            int p=0,q=0;
            //key값만 저장한 애
            for(int key : counter.keySet())
            {
                if(counter.get(key)==3) p=key;
                else q=key;
            }
            answer = (10 * p + q) * (10 * p + q);
            
        }
        else if (counts.equals(Arrays.asList(2, 2))) {
    List<Integer> keys = new ArrayList<>(counter.keySet());
    int p = keys.get(0), q = keys.get(1);
    answer = (p + q) * Math.abs(p - q);
        }  
        else if (counts.equals(Arrays.asList(2,1,1)))
            
        {
            int p=0;
            
            List<Integer> rest=new ArrayList<>();
            for(int key:counter.keySet())
            {
                if(counter.get(key)==2)
                    p=key;
                else rest.add(key);
                
            }
            answer=rest.get(0)*rest.get(1);
        }
        
        else{
            answer=Collections.min(counter.keySet());
        }
        return answer;
    }
}