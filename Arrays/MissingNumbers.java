class MissingNumbers{

    public static int missingNumbers(int[] arr){
    int n = arr.length;
    int expectedsum = n*(n+1)/2;
    int actualsum = 0;

    for(int i = 0; i<arr.length; i++){
        actualsum += arr[i];
    }
        int missing = int expectedsum - int actualsum;
        return missing;
    
}
}