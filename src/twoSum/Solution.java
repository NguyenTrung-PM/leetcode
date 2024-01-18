package twoSum;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		int length = nums.length;
		int[] result = new int[2];

		for (int i = 0; i < length; i++) {
			for (int j = 1; j < length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}

		return result;
	}
}
