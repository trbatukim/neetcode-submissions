class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public int binarySearch(int[] nums, int start, int end, int target) {
        int current = start + (end - start) / 2;
        
        if (start > end) return -1;
        if (nums[current] == target) return current;
        else if (nums[current] > target) 
            return binarySearch(nums, start, current - 1, target);
        else
            return binarySearch(nums, current + 1, end, target);
    }
}
