public class ArrayQueue implements Queue{
//FIFO
    public static Object[] arr;
    public static int head;
    public static int tail;

    public ArrayQueue(){
        arr = new Object[10];
        head = 0;
        tail = -1;
    }


    @Override
    public Object dequeue() {
        //idk if this one is done
        if (empty()) {
            return null;
        } else {

            Object item = arr[head];

            head = head % arr.length + 1;

            return item;
        }
    }

    @Override
    public void enqueue(Object item) {
        if (tail == arr.length-1) //if the tail is the last index, grow the array
            grow_array();

        tail++;

        arr[tail] = item;

    }

    @Override
    public boolean empty() {
        if(head > tail)
            return true;

        return false;
    }


    public void grow_array(){

        Object[] newArray = new Object[arr.length*2];

        int index = head; // index is the index of the objects in arr
        int i = 0; //i is the index of newArray

        //copy data from arr to newArray
        while(index <= tail){ //keeps going until the tail is reached
            arr[index] = newArray[i]; //sets the given element of arr to the next empty space in newArray
            index++;
            i++;
        }
        //set old array reference to the new array
        arr = newArray;


//        //with while loops
//        Object[] newArray = new Object[arr.length*2];
//        int index = head;
//        int i = 0;
//        while(index < arr.length){
//            newArray[i++] = arr[index++];
//        }
//        index = 0;
//        while(index < head){
//            newArray[i++] = arr[index++];
//        }
//        arr = newArray;

    }

}
