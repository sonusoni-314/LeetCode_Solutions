class Solution {
    public int maxProduct(int n) {

        ArrayList <Integer> list = new ArrayList <>();
        int lastDigit = 0;

        while(n != 0){
            lastDigit = n%10;
            list.add(lastDigit);
            n = n/10;
        }

        Collections.sort(list);
        Collections.reverse(list);
        
        return list.get(0)*list.get(1);
    }
}