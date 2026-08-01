class Solution {
    public int numberOfSpecialChars(String word) {
        
        HashSet <Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for(char ch : word.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                sb.append(ch);
            }
        }


        for(char ch : sb.toString().toCharArray()){

            if(Character.isUpperCase(ch)){
                continue;
            }

            else if(set.contains(Character.toUpperCase(ch)))
                count++;
        }
        return count;
    }
}