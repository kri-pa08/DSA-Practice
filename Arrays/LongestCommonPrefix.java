public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    
    public static void main(String[] args) {
        LongestCommonPrefix sol = new LongestCommonPrefix();

        String[] arr1 = {"flower", "flow", "flight"};
        System.out.println(sol.longestCommonPrefix(arr1)); // fl

        String[] arr2 = {"dog","racecar","car"};
        System.out.println(sol.longestCommonPrefix(arr2)); // ""
    }
}
