import java.util.*;

public class RestoreIpAddresses {

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

    public static void main(String[] args) {
        RestoreIpAddresses obj = new RestoreIpAddresses();

        System.out.println(obj.restoreIpAddresses("25525511135")); // ["255.255.11.135", "255.255.111.35"]
        System.out.println(obj.restoreIpAddresses("0000"));        // ["0.0.0.0"]
        System.out.println(obj.restoreIpAddresses("101023"));      // ["1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3"]
    }
}
