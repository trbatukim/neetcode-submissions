class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1;
            int r = nums.length - 1;
            int goal = -nums[i];
            List<Integer> list = new ArrayList<>();

            while (l < r) {
                int current = nums[l] + nums[r];

                if (r == i || current > goal) {
                    r--;
                } else if (l == i || current < goal) {
                    l++;
                } else {
                    list = List.of(nums[i], nums[l], nums[r]);
                    result.add(list);
                    l++;
                    r--;
                    while(l < r && nums[l] == nums[l - 1]) l++;
                    while(l < r && nums[r] == nums[r + 1]) r--;
                }
            }
        }

        return result;
    }
}
