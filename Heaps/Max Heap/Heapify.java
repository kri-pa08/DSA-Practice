class Heapify{
    //Root should be greater than their child
    int arr[];
    int size;

    Heapify(int capacity){
        arr = new int[capacity];
        size = 0;

    }
    void insert (int value){
        arr[size] = value;
        int index = size;

        while(index > 0){
            int parent = (index -1) /2;
        

        if (arr[index] > arr[parent]){
            int temp = arr[index];
            arr[index] = arr[parent];
            arr[parent] = temp;

            index = parent;
        }
        else {
            break;
        }
    }
    size++;
}
public static void main(String[] args){

    Heapify heap = new Heapify(10);

    heap.insert(40);
    heap.insert(30);
    heap.insert(20);
    heap.insert(10);
    heap.insert(50);

    System.out.println("Size" + heap.size);

    for(int i = 0; i<heap.size; i++){
        System.out.println(heap.arr[i] + " ");
    }
}
}