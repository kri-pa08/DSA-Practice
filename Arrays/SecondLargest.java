import java.util.Scanner;

public class SecondLargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

    int largest = arr[0];
    for(int i = 0; i<arr.length; i++){
        if(arr[i]>largest){
            largest = arr[i];
        }
    }
    int second = Integer.MIN_VALUE;
    for(int i = 0; i<arr.length; i++){
        if(arr[i] == largest){
            continue;
        } if(arr[i]>second){
            second = arr[i];

        }
    }
    System.out.println("Second Largest = " + second);
}
}