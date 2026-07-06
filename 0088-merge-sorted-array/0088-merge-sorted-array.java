class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] ans = new int[m+n];
        int k = 0;
        int i = 0;
        int j = 0;

        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                ans[k] = nums1[i];
                k++;
                i++;
            }
            else if(nums1[i] > nums2[j]){
                ans[k] = nums2[j];
                k++;
                j++;
            }
            else{
                ans[k++] = nums1[i++];
            }
        }

        while(i<m){
            ans[k++] = nums1[i++];
        }
        while(j<n){
            ans[k++] = nums2[j++];
        }
        for(int x=0; x<ans.length; x++){
            nums1[x] = ans[x];
        }
    }
}