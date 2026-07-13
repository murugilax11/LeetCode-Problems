class Solution {
    public boolean isValid(String word) {
        String vowelCheck = "aeiouAEIOU";
        boolean vowel = false;
        boolean conso = false;
        if(word.length() < 3){
            return false;
        }
        for(char ch : word.toCharArray()){
            if(!Character.isLetterOrDigit(ch)) return false;
            if(Character.isLetter(ch)){
                char lower = Character.toLowerCase(ch);
                if(vowelCheck.indexOf(lower) != -1)
                vowel = true;
                else
                conso = true;
            }
        }
        return vowel && conso;
    }
}