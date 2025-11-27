 import java.util.HashSet;

class JewelStone {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();

        for (char j : jewels.toCharArray()) {
            set.add(j);
        }

        int count = 0;
        for (char s : stones.toCharArray()) {
            if (set.contains(s)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
            JewelStone sol = new JewelStone();
        System.out.println(sol.numJewelsInStones("aA", "aAAbbbb")); // Output: 3
    }
}
