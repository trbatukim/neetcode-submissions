class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int l = 0;
        int r = s.length() - 1;
        char[] arr = s.toCharArray();

        while (l < r) {
            if (!Character.isLetterOrDigit(arr[l])) {
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(arr[r])) {
                r--;
                continue;
            }

            if (arr[l] != arr[r]) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}
