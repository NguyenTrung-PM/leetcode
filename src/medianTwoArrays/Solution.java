package medianTwoArrays;

import java.util.Arrays;

class Solution {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int len1 = nums1.length;
		int len2 = nums2.length;
		int[] sortedArr = new int[len1 + len2];
		int k = 0;

		for (int i = 0; i < len1; i++) {
			sortedArr[k++] = nums1[i];
		}

		for (int i = 0; i < len2; i++) {
			sortedArr[k++] = nums2[i];
		}

		Arrays.sort(sortedArr);

		int total = sortedArr.length;

		if (total % 2 == 1) {
			return (double) sortedArr[total / 2];
		} else {
			int middle1 = sortedArr[total / 2 - 1];
			int middle2 = sortedArr[total / 2];
			return ((double) middle1 + (double) middle2) / 2.0;
		}
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 }));
		System.out.println(s.findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 8, 7, 6, 5, 4, 3 }));
	}
}