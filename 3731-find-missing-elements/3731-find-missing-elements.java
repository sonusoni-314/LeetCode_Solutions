class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        ArrayList <Integer> list = new ArrayList<>();
        HashSet <Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int x : nums){
            set.add(x);
            min = Math.min(min, x);
            max = Math.max(max, x);
        }

        for(int i=min; i<max; i++){
            if(!set.contains(i+1)){
                list.add(i+1);
            }
        }
        
        return list;        
    }
}