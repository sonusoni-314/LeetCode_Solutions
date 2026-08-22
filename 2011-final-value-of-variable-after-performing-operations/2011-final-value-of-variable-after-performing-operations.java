class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int i=0;
        int val = 0;
        while(i<operations.length){
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                val++;
                i++;
            }
            else{
                val--;
                i++;
            }
        }
        return val;
    }
}