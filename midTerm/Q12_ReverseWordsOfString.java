package midTerm;
/*
Q:-12 EASSY Reverse Words in a String.
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
Example 1:
Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:
Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:
Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
Constraints:
1 <= s.length <= 104
s contains English letters (upper-case and lower-case), digits, and spaces ' '.
There is at least one word in s.

 */
public class Q12_ReverseWordsOfString {
    public static String reverseWords(String str){
        String arr[]=str.trim().split("\\s+");
        int st=0,end=arr.length-1;
        while(st<=end){
            String temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
        return String.join(" ",arr);

    }
    public static void main(String[] args) {
        String str1="  hello world  ";
        System.out.println(reverseWords(str1));
    }
}
