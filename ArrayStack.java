import java.lang.Exception;
import java.util.ArrayList;

public class ArrayStack implements Stack {

    public static int top;
    public static Object[] arr;

    public ArrayStack(){
        arr = new Object[10];
        top = -1;
    }


    @Override
    public void push(Object item) {

    }

    @Override
    public Object pop() throws Exception {
        if(empty())
            throw new Exception("Empty");
        else
            return arr[top--];
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public boolean empty() {
        return false;
    }
}
