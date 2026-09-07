import java.util.*;

class ElementFrequency {
    public static void main(String[] args) {

        int[] arr = {4, 1, 4, 2, 1, 4, 3};

        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num : arr){
            if(freq.containsKey(num)){
                freq.put(num, freq.get(num)+1);
            } else {
                freq.put(num, 1);
            }
        }
        System.out.println(freq);

    }
}