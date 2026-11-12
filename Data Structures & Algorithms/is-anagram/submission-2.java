class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            int freq = 0;
            if (sMap.get(c) != null) freq = sMap.get(c);
            sMap.put(c, ++freq);
        }

        for (char c : t.toCharArray()) {
            int freq = 0;
            if (tMap.get(c) != null) freq = tMap.get(c);
            tMap.put(c, ++freq);
        }

        return sMap.equals(tMap);
    }
}
