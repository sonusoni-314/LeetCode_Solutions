class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        ArrayList <Integer> less = new ArrayList<>();
        for(int x:nums){
            if(x<pivot){
                less.add(x);
            }
        }

        ArrayList <Integer> greater = new ArrayList<>();
        for(int x:nums){
            if(x>pivot){
                greater.add(x);
            }
        }

        ArrayList <Integer> equal = new ArrayList <>();
        for(int x:nums){
            if(x==pivot){
                equal.add(x);
            }
        }

        int[] ans = new int[nums.length];
        int i = 0;
        for(int x:less){
            ans[i] = x;
            i++;
        }

        for(int x:equal){
            ans[i] = x;
            i++;   
        }

        for(int x:greater){
            ans[i] = x;
            i++;
        }

        return ans;
    }
}