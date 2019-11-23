import java.util.Arrays;

public class StringProblemSolving {
  //  Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
    public boolean isUnique(String text) {
        for (int i = 0; i < text.length(); i++)
            for (int j = i + 1; j < text.length(); j++)
                if (text.charAt(i) == text.charAt(j))
                    return false;


        return true;
    }
    
    //Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
    public boolean arePermutation(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();

        if (n1 != n2)
            return false;

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < n1; i++)
            if (ch1[i] != ch2[i])
                return false;

        return true;
    }

    // URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the "true" length of the string. (Note: If implementing in Java, please use a character array so that you can perform this operation in place.)
    public String urlify(String text, int length) {

        text = text.trim();

        text = text.replaceAll("\\s", "%20");

        return text;
    }

    // One Away: There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a character. Given two strings, write a function to check if they are one edit (or zero edits) away.
    public boolean isEditDistanceOne(String s1,
                                     String s2) {

        int m = s1.length(), n = s2.length();

        if (m - n > 1)
            return false;

        int count = 0;

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (s1.charAt(i) != s2.charAt(j)) {
                if (count == 1)
                    return false;

                // If length of one string is more, then only possible edit is to remove a character
                if (m > n)
                    i++;
                else if (m < n)
                    j++;
                else // Iflengths of both strings
                // is same
                {
                    i++;
                    j++;
                }

                // Increment count of edits
                count++;
            } else // If current characters match
            {
                i++;
                j++;
            }
        }

        // If last character is extra
        // in any string
        if (i < m || j < n)
            count++;

        return count == 1;
    }
    // String Compression: Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabcccccaaa would become a2blc5a3, If the "compressed" string would not become smaller than the original string, your method should return the original string. You can assume the string has only uppercase and lowercase letters (a - z).
    public String compresString(String text) {
        int length = text.length();

        if (length > 2) {
            String compressedText = "";
            char lastChar = text.charAt(0);
            int charCount = 1;
            for (int i = 1; i < length; i++) {
                if (text.charAt(i) == lastChar) charCount++;
                else {
                    compressedText += Character.toString(lastChar) + Integer.toString(charCount);
                    lastChar = text.charAt(i);
                    charCount = 1;
                }
            }
            compressedText += Character.toString(lastChar) + Integer.toString(charCount);
            if (compressedText.length() < length)
                return compressedText;
        }
        return text;
    }

    //  String Rotation; Assume you have a method i s S u b s t r i n g which checks if one word is a substring of another. Given two strings, si and s2, write code to check if s2 is a rotation of si using only one call to isSubst ring [e.g., "waterbottle" is a rotation oP'erbottlewat"),
    public boolean areRotations(String str1, String str2)
    {
        // There lengths must be same and str2 must be
        // a substring of str1 concatenated with str1.
        return (str1.length() == str2.length()) &&
                ((str1 + str1).indexOf(str2) != -1);
    }
}
