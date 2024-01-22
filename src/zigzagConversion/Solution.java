package zigzagConversion;

class Solution {
	public String convert(String s, int numRows) {
		if (numRows == 1)
			return s;
		int cycle = numRows * 2 - 2;
		char[] charArray = new char[s.length()];
		int pointer = 0;
		for (int i = 0; i < s.length(); i += cycle) { // 1st row
			charArray[pointer] = s.charAt(i);
			pointer++;
		}
		for (int i = 1; i < numRows - 1; i++) {
			for (int j = i, k = cycle - j; j < s.length(); j += cycle, k += cycle) {
				charArray[pointer] = s.charAt(j);
				pointer++;
				if (k < s.length()) {
					charArray[pointer] = s.charAt(k);
					pointer++;
				}
			}
		}
		for (int i = numRows - 1; i < s.length(); i += cycle) { // last row
			charArray[pointer] = s.charAt(i);
			pointer++;
		}
		return String.valueOf(charArray);
	}

	public static void main(String[] args) {
		Solution s = new Solution();

		System.out.println(s.convert("PAYPALISHIRING", 3));
	}

}