class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();

        for (String str : strs) {
            int length = str.length();
            builder.append(length + "#" + str);
        }

        return builder.toString();
    }

    public List<String> decode(String str) {
        char[] arr = str.toCharArray();
        List<String> list = new ArrayList<>();

        StringBuilder numberBuilder = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '#') {
                numberBuilder.append(arr[i]);
            } else {
                int length = Integer.parseInt(numberBuilder.toString());
                numberBuilder = new StringBuilder();
                StringBuilder strBuilder = new StringBuilder();

                for (int j = i + 1; j <= length + i; j++) {
                    strBuilder.append(arr[j]);
                }
                list.add(strBuilder.toString());

                i += length;
            }
        }

        return list;
    }
}
