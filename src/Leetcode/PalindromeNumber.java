package Leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 10;
        System.out.println( isPalindrome(x));
    }
    static boolean isPalindrome(int x) {
        boolean Palindrome=false;
        int temp = x;
        int rem = 0;
        int ans =0;
        while (x>0){
            rem = x%10;
            ans =ans*10+rem;
            x = x/10;
        }
        if (ans==temp){
            return true;
        }return Palindrome;
    }
}
