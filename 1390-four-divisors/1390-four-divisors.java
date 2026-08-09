class Solution {
    public int sumFourDivisors(int[] nums) {

        ArrayList <Integer> list = new ArrayList <>();

        int x = 0, count = 0, n = 0;
        while(x < nums.length){
            n = nums[x];
            count = 0;

            for(int i=1; i*i<=n; i++){
                if(n%i == 0){
                    count++;
                    if(i != n/i)
                        count++;
                }
            }
            if(count == 4)
                list.add(n);
            x++;
        }
        int sum = 0;
        int k = 0;
        while(k < list.size()){
            int y = list.get(k);
            for(int i=1; i*i<=y; i++){
                if(y%i == 0){
                    sum += i;
                    if(i != y/i)
                        sum += y/i;
                }
            }
            k++;
        }
        return sum;
    }
}