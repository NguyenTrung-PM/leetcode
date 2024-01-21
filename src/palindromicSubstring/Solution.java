package palindromicSubstring;

class Solution {
	public static String longestPalindrome(String s) {
		for (int length = s.length(); length > 0; length--) {
			for (int start = 0; start <= s.length() - length; start++) {
				if (check(start, start + length, s)) {
					return s.substring(start, start + length);
				}
			}
		}

		return "";
	}

	public static boolean check(int i, int j, String s) {
		int left = i;
		int right = j - 1;

		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

//	faster solition 13ms runtime
//	static int start = 0;
//	static int end = 0;
//
//	private static void palindrome(char[] ch, int i) {
//		int a = i;
//		int b = i;
//		int n = ch.length;
//		if (i >= n - 1)
//			return;
//		while (b < n - 1 && ch[b] == ch[b + 1]) {
//			b++;
//		}
//		i = b;
//		while (a > 0 && b < n - 1 && ch[a - 1] == ch[b + 1]) {
//			a--;
//			b++;
//		}
//		if ((end - start) < (b - a)) {
//			end = b;
//			start = a;
//		}
//		palindrome(ch, i + 1);
//	}
//
//	public static String longestPalindrome(String s) {
//		char[] ch = s.toCharArray();
//		palindrome(ch, 0);
//		return s.substring(start, end + 1);
//
//	}

	public static void main(String[] args) {
		System.out.println(longestPalindrome("cbbd"));
	}
}