package midTerm;
/*
Q:-13 MEDIUM Count the Number of Vowel Strings in Range.
You are given a 0-indexed array of string words and two integers left and right.
A string is called a vowel string if it starts with a vowel character and ends with a vowel character where vowel characters are 'a', 'e', 'i', 'o', and 'u'.

Return the number of vowel strings words[i] where i belongs to the inclusive range [left, right].
Example 1:
Input: words = ["are","amy","u"], left = 0, right = 2
Output: 2
Explanation:
- "are" is a vowel string because it starts with 'a' and ends with 'e'.
- "amy" is not a vowel string because it does not end with a vowel.
- "u" is a vowel string because it starts with 'u' and ends with 'u'.
The number of vowel strings in the mentioned range is 2.
Example 2:
Input: words = ["hey","aeo","mu","ooo","artro"], left = 1, right = 4
Output: 3
Explanation:
- "aeo" is a vowel string because it starts with 'a' and ends with 'o'.
- "mu" is not a vowel string because it does not start with a vowel.
- "ooo" is a vowel string because it starts with 'o' and ends with 'o'.
- "artro" is a vowel string because it starts with 'a' and ends with 'o'.
The number of vowel strings in the mentioned range is 3.
Constraints:
1 <= words.length <= 1000
1 <= words[i].length <= 10
words[i] consists of only lowercase English letters.
0 <= left <= right < words.length.

 */
public class Q13_CountVowelStringInRange {
    public static int countVowel(String str[],int left,int right){
        int count=0;
        String vowel="aeiouAEIOU";
        for(int i=left;i<=right;i++){
            String word=str[i];
            char first=word.charAt(0);
            char last=word.charAt(word.length()-1);
            if(vowel.indexOf(first)!=-1 && vowel.indexOf(last)!=-1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str[]={"hey","aeo","mu","ooo","artro"};
        System.out.println(countVowel(str,1,4));
    }
}
