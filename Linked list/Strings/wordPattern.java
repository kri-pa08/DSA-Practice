public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;
        
        java.util.Map<Character, String> p2w = new java.util.HashMap<>();
        java.util.Map<String, Character> w2p = new java.util.HashMap<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            
            if (p2w.containsKey(c) && !p2w.get(c).equals(w)) return false;
            if (w2p.containsKey(w) && !w2p.get(w).equals(c)) return false;
            
            p2w.put(c, w);
            w2p.put(w, c);
        }
        return true;
    }
    
    public static void main(String[] args) {
        WordPattern sol = new WordPattern();
        System.out.println(sol.wordPattern("abba", "dog cat cat dog")); 
        System.out.println(sol.wordPattern("abba", "dog cat cat fish")); 
        System.out.println(sol.wordPattern("aaaa", "dog cat cat dog")); 
        System.out.println(sol.wordPattern("abc", "dog cat cat")); 
    }
}
