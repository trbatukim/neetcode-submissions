class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        int l = 0;
        int r = numbers.size() - 1;

        while (l < r) {
            int current = numbers[l] + numbers[r];

            if (current == target) return std::vector<int>{++l, ++r};
            else if (current > target) r--;
            else l++;
        }

        return std::vector<int>{0};
    }
};
