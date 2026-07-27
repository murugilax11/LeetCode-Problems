class Solution {
    public int lengthOfLastWord(String s) {
       String str = s.trim();
       int i = str.length()-1;
       int count = 0;
        while(i >=0 && str.charAt(i) != ' ')
        {
            count++;
            i--;
        }
       return count;
    }
}