class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        
        int sum = 0;
        int max = 0;
        for(int i=0; i<customers.length; i++){
            if(grumpy[i] == 0){
                sum += customers[i];
                customers[i] = 0;
            }
        }

        for(int i=0; i<minutes; i++){
            sum+= customers[i];
        }
        max = sum;

        int left = 0;
        int right = minutes-1;
        while(right < customers.length-1){
            sum-=customers[left];

            left++; right++;

            sum+=customers[right];
            max = Math.max(max, sum);
        }
        return max;
    }
}