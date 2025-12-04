import java.util.ArrayList;
import java.util.List;

public class MinimumOperationsToMakeArrayNonDecreasing {

    public int minimumPairRemoval(int[] nums) {
        List<Integer> a = new ArrayList<>();
        for (int n : nums) a.add(n);

        int ops = 0;
        while (hasInversion(a)) {
            int minSum = Integer.MAX_VALUE;
            int idx = -1;

            // Find adjacent pair with minimum sum
            for (int i = 0; i < a.size() - 1; i++) {
                int s = a.get(i) + a.get(i + 1);
                if (s < minSum) {
                    minSum = s;
                    idx = i;
                }
            }

            // Merge the pair
            a.set(idx, minSum);
            a.remove(idx + 1);
            ops++;
        }
        return ops;
    }

    private boolean hasInversion(List<Integer> a) {
        for (int i = 0; i < a.size() - 1; i++)
            if (a.get(i) > a.get(i + 1))
                return true;
        return false;
    }

    // For testing on VS Code
    public static void main(String[] args) {
        MinimumOperationsToMakeArrayNonDecreasing obj = new MinimumOperationsToMakeArrayNonDecreasing();

        int[] nums = {3, 2, 4, 1};
        int result = obj.minimumPairRemoval(nums);

        System.out.println("Minimum operations: " + result);
    }
}
