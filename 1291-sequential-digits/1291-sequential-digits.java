class Solution {
    public List<Integer> sequentialDigits(int low, int high) {

        ArrayList <Integer> list = new ArrayList<>();
        int num = 0;
        String digits = "123456789";

        int minLen = Integer.toString(low).length();
        int maxLen = Integer.toString(high).length();

        for(int len=minLen; len<=maxLen; len++){
            for(int i=0; i+len<=9; i++){

                num = Integer.parseInt(digits.substring(i, i+len));

                if(num>=low && num<=high){
                    list.add(num);
                }
            }
        }
        return list;
    }
}