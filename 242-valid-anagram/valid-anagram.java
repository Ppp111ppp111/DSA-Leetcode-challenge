import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {

        // Remove all whitespaces and convert to lowercase
        String str1 = s.replaceAll("\\s", "").toLowerCase();
        String str2 = t.replaceAll("\\s", "").toLowerCase();

        // If lengths differ, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        // Sort both arrays
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        // Compare sorted arrays
        return Arrays.equals(charArr1, charArr2);
    }
}
