class InsertHeap{
    int[] arr;
    int size;

    InsertHeap(int capacity){
        arr = new int[capacity];
        size = 0;
    }
void insert(int value){
    arr[size] = value;
    size++;
}
public static void main(String[] args){

    InsertHeap heap = new InsertHeap(10);
    

    heap.insert(40);
    heap.insert(30);
    heap.insert(20);
    heap.insert(10);

    System.out.println("Size: " + heap.size );

    for(int i = 0; i<heap.size; i++){
        System.out.println(heap.arr[i] + " ");
    }


}

}