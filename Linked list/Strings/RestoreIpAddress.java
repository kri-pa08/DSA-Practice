class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int start, List<String> path, List<String> result) {
        if (path.size() == 4) {
            if (start == s.length()) result.add(String.join(".", path));
            return;
        }

        for (int i = start; i < s.length() && i < start + 3; i++) {
            String part = s.substring(start, i + 1);
            if (part.startsWith("0") && part.length() > 1) continue;
            if (Integer.parseInt(part) <= 255) {
                path.add(part);
                backtrack(s, i + 1, path, result);
                path.remove(path.size() - 1);
            }
        }
    }
}
