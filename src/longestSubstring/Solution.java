package longestSubstring;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public int lengthOfLongestSubstring(String s) {
		int len = 0;
		int start = 0;
		Map<Character, Integer> mapPosition = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (mapPosition.containsKey(c)) {
				if (mapPosition.get(c) >= start) {
					start = mapPosition.get(c) + 1;
				}
			}
			len = Math.max(len, i - start + 1);
			mapPosition.put(c, i);
		}

//		mapPosition.entrySet().stream()
//				.forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));
		
		return len;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		s.lengthOfLongestSubstring("abcabcbb");
		s.lengthOfLongestSubstring("bbbbb");
		s.lengthOfLongestSubstring("pwwkew");

	}
}
