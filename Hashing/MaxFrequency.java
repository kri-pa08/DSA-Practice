import java.util.*;

public class MaxFrequency {
    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        HashMap<Integer, Integer> frequency = new HashMap<>();

        // Step 1: Count frequency
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find maximum frequency
        int maxFreq = 0;
        int answer = arr[0];

        for (int num : frequency.keySet()) {

            if (frequency.get(num) > maxFreq) {
                maxFreq = frequency.get(num);
                answer = num;
            }
        }

        System.out.println(answer);
    }
}