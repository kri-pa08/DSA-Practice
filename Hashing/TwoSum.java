import java.util.*;
public class TwoSum{
     public static int[] twoSum(int[] arr, int target) {

    HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length; i++){
            int current = arr[i];

            int need = target - arr[i];

            if(map.containsKey(need)){;
             return new int[]{map.get(need), i};
        }
        map.put(arr[i], i);
    }
    public static void main (String[] args){
        int[] arr = {1, 2, 3, 4};
        int target = 5;
    }
    }
}///////