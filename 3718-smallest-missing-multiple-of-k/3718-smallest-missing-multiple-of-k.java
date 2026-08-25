class Solution {
    public int missingMultiple(int[] nums, int k) {

        HashSet <Integer> set = new HashSet <>();
        for(int x : nums)
            set.add(x);

        int multiple = k;

        while(multiple <= 100){
            
            if(set.contains(multiple))
                multiple += k;
            else
                break;
      
        }
        return multiple;        
    }
}