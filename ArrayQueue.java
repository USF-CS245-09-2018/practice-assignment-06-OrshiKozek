public class ArrayQueue implements Queue{

    public static Object[] arr;
    public static int head;
    public static int tail;

    public ArrayQueue(){
        arr = new Object[10];
        head = 0;
        tail = 0;
    }


    @Override
    public Object dequeue() throws Exception {
        //idk if this one is done
        if (empty()) {
            throw new Exception("Empty");
        } else {

            Object item = arr[head];

            head = head % arr.length;

            return item;
        }
    }

    @Override
    public void enqueue(Object item) {
        if(tail+1 % arr.length == head)
            grow_array();
        arr[tail++] = item;
        if (tail >= arr.length)
            tail = 0;
    }

    @Override
    public boolean empty() {
        if(head == tail)
            return true;

        return false;
    }


    public void grow_array(){
        //with while loops
        Object[] newArray = new Object[arr.length*2];
        int index = head;
        int i = 0;
        while(index < arr.length){
            newArray[i++] = arr[index++];
        }
        index = 0;
        while(index < head){
            newArray[i++] = arr[index++];
        }
        arr = newArray;

        //alternately, with for loop

//        Object[] newArray = new Object[arr.length*2];
//        tail = 0;
//        for(int i = head; i < arr.length; i++){
//            newArray[tail++] = arr[i%arr.length];
//        }
//        head = 0;
//        arr = newArray;
//
    }

}
