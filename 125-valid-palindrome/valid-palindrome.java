class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase();
        str=str.replaceAll("[^a-z0-9]", "");

        // for (int i =0;i<str.length()/2;i++){
        //     char start =str.charAt(i);
        //     char end=str.charAt(str.length()-1-i);
        //     if ( start != end){
        //         return false;

        //     }
        // }
        // return true;

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

