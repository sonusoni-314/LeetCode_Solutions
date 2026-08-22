class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        HashSet <Character> set = new HashSet <>();

        for(char ch : allowed.toCharArray()){
            set.add(ch);
        }
        boolean found = true;
        int count = 0;

        for(int i=0; i<words.length; i++){
            found = true;
            for(char ch : words[i].toCharArray()){
                if(!set.contains(ch)){
                    found = false;
                    break;
                }
            }
            if(found == true)   count++;
        }
        return count;
    }
}