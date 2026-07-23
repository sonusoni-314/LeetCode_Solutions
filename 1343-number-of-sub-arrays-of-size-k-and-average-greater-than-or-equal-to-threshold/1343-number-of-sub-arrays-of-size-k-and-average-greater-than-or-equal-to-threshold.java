class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int count = 0;
        int sum = 0;
        int n = arr.length;

        for(int i=0; i<k; i++){
            sum += arr[i];
        }

        if((sum/k) >= threshold)
            count++;

        int left = 0;
        int right = k-1;

        while(right < n-1){
            sum -= arr[left];

            left++;
            right++;

            sum += arr[right];
            if((sum/k) >= threshold){
                count++;
            }
        }
        return count;
    }
}