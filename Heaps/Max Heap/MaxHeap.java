class MaxHeap {

    int[] arr;
    int size;

    MaxHeap(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public static void main(String[] args) {

        MaxHeap heap = new MaxHeap(10);

        System.out.println("Heap created");
        System.out.println("Size: " + heap.size);
    }
}