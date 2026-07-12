class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int[] rank = arr.clone();
        Arrays.sort(rank);
        HashMap <Integer, Integer> map = new HashMap<>();

        int count = 1;

        for(int i=0; i<rank.length; i++){
            if(!map.containsKey( rank[i] )){
                map.put(rank[i], count++);
            }
            
        }

        int[] ans = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            ans[i] = map.get(arr[i]);
        }

        return ans;
    }
}