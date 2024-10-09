class Solution {
    public boolean isPalindrome(int x) {
    
     if (x < 0) {
            return false;
        }

        String str  = Integer.toString(x);
        char[] charArr = str.toCharArray();

        int left = 0;
        int right = charArr.length - 1;

        
        while (left < right) {
            if (charArr[left] != charArr[right]) {
                return false;
            }
            left++;
            right--;
        }

        
        return true;

    }
}