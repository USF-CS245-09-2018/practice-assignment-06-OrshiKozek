import java.lang.Exception;
import java.util.ArrayList;

public class ArrayStack implements Stack {
    //LIFO

    public static int top;
    public static Object[] arr;

    public ArrayStack(){
        arr = new Object[10];
        top = -1;
    }


    @Override
    public void push(Object item) {
        if (top == arr.length-1) {//if top is the last index
            growArray();
        }
        arr[top+1] = item;
        top++;
    }

    @Override
    public Object pop() {
        if(empty())
            return null;
        else
            return arr[top--];
    }

    @Override
    public Object peek() {
        if(empty()) //if there is nothing in the list, return null
            return null;
        return arr[top]; //returns the top element of the list
    }

    @Override
    public boolean empty() {
        if(top < 0) //if there is noting in the array, top is -1, ie less than 0
            return true;
        return false;
    }

    public void growArray(){
        Object[] newArray = new Object[arr.length*2];
        int index = 0;
        for (Object item : arr){
            newArray[index++] = item; //copy each element of arr into newArr
        }
        arr = newArray;
    }

}
