class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] freq = new int[26];
        int[] runningFreq = new int[26];
        char[] arr = s2.toCharArray();
        int l = 0, r = s1.length() - 1;

        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = l; i < r; i++) {
            runningFreq[arr[i] - 'a']++;
        }

        while (r < arr.length) {
            runningFreq[arr[r] - 'a']++;
            
            if (Arrays.equals(runningFreq, freq)) return true;
            else {
                runningFreq[arr[l] - 'a']--;
                l++;
                r++;
            }
        }

        return false;
    }
}
