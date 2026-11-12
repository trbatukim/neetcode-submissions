class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> strsCopy = new ArrayList<>(Arrays.asList(strs));
        
        for (int i = 0; i < strsCopy.size(); i++) {
            char[] arr = strsCopy.get(i).toCharArray();
            Arrays.sort(arr);
            strsCopy.set(i, String.valueOf(arr));
        }

        for (int i = 0; i < strsCopy.size(); i++) {
            List<String> list = map.get(strsCopy.get(i));
            if (list == null) list = new ArrayList<>();
            list.add(strs[i]);
            map.put(strsCopy.get(i), list);
        }

        return new ArrayList<>(map.values());
    }
}