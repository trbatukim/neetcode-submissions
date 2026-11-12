class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;

        while (l < r) {
            int current = numbers[l] + numbers[r];

            if (current == target) return new int[]{++l, ++r};
            else if (current > target) r--;
            else l++;
        }

        return new int[0];
    }
}
