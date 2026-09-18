class DeleteMax{

    int arr[];
    int size;

    // Constructor
    DeleteMax(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    // INSERT
    void insert(int value) {

        // Step 1: New element ko last position par rakho
        arr[size] = value;

        // New element ka index
        int index = size;

        // Step 2: Heapify Up
        while (index > 0) {

            // Parent ka index
            int parent = (index - 1) / 2;

            // Agar child parent se bada hai
            if (arr[index] > arr[parent]) {

                // Swap
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;

                // Ab index parent ban gaya
                index = parent;

            } else {
                break;
            }
        }

        // Size increase
        size++;
    }


    // DELETE MAX
    int deleteMax() {

        // Agar heap empty hai
        if (size == 0) {
            System.out.println("Heap is empty");
            return -1;
        }

        // Root hi maximum hota hai
        int max = arr[0];

        // Last element ko root par lao
        arr[0] = arr[size - 1];

        // Heap ka size decrease
        size--;

        // Ab root se Heapify Down
        int index = 0;

        while (index < size) {

            // Left child
            int left = 2 * index + 1;

            // Right child
            int right = 2 * index + 2;

            // Initially maan lo current hi largest hai
            int largest = index;

            // Left child bada hai?
            if (left < size && arr[left] > arr[largest]) {
                largest = left;
            }

            // Right child bada hai?
            if (right < size && arr[right] > arr[largest]) {
                largest = right;
            }

            // Agar current already largest hai
            if (largest == index) {
                break;
            }

            // Swap
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;

            // Neeche move karo
            index = largest;
        }

        return max;
    }


    // PRINT HEAP
    void printHeap() {

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }


    // MAIN
    public static void main(String[] args) {

        Heapify heap = new Heapify(10);

        // Insert
        heap.insert(40);
        heap.insert(30);
        heap.insert(20);
        heap.insert(10);
        heap.insert(50);

        System.out.println("Heap after insertion:");
        heap.printHeap();

        // Delete maximum
        int deleted = heap.deleteMax();

        System.out.println("Deleted: " + deleted);

        System.out.println("Heap after deletion:");
        heap.printHeap();
    }
}