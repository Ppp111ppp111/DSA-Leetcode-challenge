class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        

        List<Integer> result = new ArrayList<>();
        
        int sLen = s.length(), pLen = p.length();
        
        if (sLen < pLen) return result;
        
        // Frequency arrays to count characters
        int[] pCount = new int[26]; // For string p
        int[] sCount = new int[26]; // For the sliding window in string s
        
        // Count the frequency of characters in string p
        for (int i = 0; i < pLen; i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }
        
        // Check if the first window is a valid anagram
        if (matches(pCount, sCount)) {
            result.add(0);
        }
        
        // Slide the window over the string s
        for (int i = pLen; i < sLen; i++) {
            // Include new character (right side of the window)
            sCount[s.charAt(i) - 'a']++;
            // Exclude old character (left side of the window)
            sCount[s.charAt(i - pLen) - 'a']--;
            
            // Check if current window is a valid anagram
            if (matches(pCount, sCount)) {
                result.add(i - pLen + 1);
            }
        }
        
        return result;
    }
    
    // Helper function to compare if two frequency arrays are the same
    private boolean matches(int[] pCount, int[] sCount) {
        for (int i = 0; i < 26; i++) {
            if (pCount[i] != sCount[i]) {
                return false;
            }
        }
        return true;
        
    }
}