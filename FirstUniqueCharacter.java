class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacter sol = new FirstUniqueCharacter();
        System.out.println(sol.firstUniqChar("leetcode")); // Output: 0
        System.out.println(sol.firstUniqChar("loveleetcode")); // Output: 2
        System.out.println(sol.firstUniqChar("aabb")); // Output: -1
    }
}
