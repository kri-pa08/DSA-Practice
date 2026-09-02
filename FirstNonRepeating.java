import java.util.HashMap;

public class FirstNonRepeating {

    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 5, 7, 2, 9};

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Step 1: Frequency count
        for (int num : arr) {

            if (freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
            }
        }

        // Step 2: Find first element with frequency 1
        for (int num : arr) {

            if (freq.get(num) == 1) {
                System.out.println(num);
                break;
            }
        }
    }
}