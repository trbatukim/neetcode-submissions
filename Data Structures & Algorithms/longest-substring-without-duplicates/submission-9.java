class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.equals("")) return 0;

        int l = 0, r = 0;
        int max = 1;
        Set<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();

        while (r < arr.length) {
            if (set.contains(arr[r])) {
                max = Math.max(max, r - l);
                l++;
                r = l;
                set = new HashSet<>();
            } else {
                set.add(arr[r]);
                r++;
            }
        }

        max = Math.max(max, r - l);

        return max;
    }
}
