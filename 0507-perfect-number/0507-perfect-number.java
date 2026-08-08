class Solution {
    public boolean checkPerfectNumber(int num) {

        if(num <= 1){
            return false;
        }

        int numb = num;
        int sum = 0;

        for(int i=1; i*i<=num; i++){
            if(num%i == 0){
                sum = sum + i;
                if(i != num/i && num/i != num){
                    sum = sum + (num/i);
                }
            }
        }

        if(sum == numb){
            return true;
        }
        return false;        
    }
}