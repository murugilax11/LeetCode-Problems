class Solution {
    static boolean isVowel(char ch){
     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
        return true;
     }
     return false;
    }
    public String reverseVowels(String s) {
        int left =0;
        int right = s.length()-1;
        char[] ch = s.toCharArray();
        while(left < right){
            if(isVowel(ch[left]) && isVowel(ch[right]))
            {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }else if(!isVowel(ch[left]) && isVowel(ch[right])){
                left++;
            }else if(isVowel(ch[left]) && !isVowel(ch[right])){
                right--;
            }else{
                left++;
                right--;
            }
        }
        return new String(ch);
    }
}