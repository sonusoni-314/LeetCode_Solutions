class Solution {
    public int[] arrayRankTransform(int[] arr) {  
        int[] nums = arr.clone();
        Arrays.sort(nums);
        HashMap <Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for(int x : nums){
            if(!map.containsKey(x))
                map.put(x, rank++);
        }
        int[] ans = new int[arr.length];
        for(int i=0; i<arr.length; i++)
            ans[i] = map.get(arr[i]);
        return ans;
    }
}