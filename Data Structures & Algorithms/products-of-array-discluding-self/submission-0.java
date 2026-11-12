class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mult = 1;
        int numOfZeros = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) numOfZeros++;
            else mult *= nums[i];
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (numOfZeros == 0) result[i] = mult / nums[i];
            else if (numOfZeros == 1 && nums[i] == 0) result[i] = mult;
            else result[i] = 0;
        }

        return result;
    }
}  
