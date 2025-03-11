package edu.okbu.cs1;

public class Palindrome {
    String theString;

    public Palindrome(String string) {
        theString = string;
    }

    public boolean isPalindrome() {
        int length = theString.length();
        boolean palindrome = true;
        for (int i = 0; i < (length / 2); ++i) {
            if (theString.charAt(i) != theString.charAt(length - i - 1)) {
                palindrome = false;
                break;
            }
        }
        System.out.println(palindrome);
        return palindrome;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome("racecar");
        p.isPalindrome();
    }
}
