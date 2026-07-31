class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        HashSet <Character> set = new HashSet <>();
        int count = 0;

        for(char ch : allowed.toCharArray())
            set.add(ch);

        for(int i=0; i<words.length; i++){
            boolean appear = true;
            for(char ch : words[i].toCharArray()){
                if(!set.contains(ch)){
                    appear = false;
                    break;                    
                }
            }
            if(appear)
                count++;
        }
        
        return count;
    }
}