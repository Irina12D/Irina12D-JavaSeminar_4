import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyQueue {

    private LinkedList<Integer> queue;
    private int error = Integer.MIN_VALUE; // ошибка обращения к элементам пустой очереди
   
    MyQueue(){
        queue = new LinkedList<Integer>();
    }

    boolean empty(){
        return queue.size() == 0;
    }

    void enqueue(int value){
        queue.add(value);
    }

    int dequeue(){
        if (!empty()){
            int firstElement = queue.getFirst();
            queue.remove(0); 
            return firstElement;
        }
        //throw new NoSuchElementException("The queue is empty!");
        return error;   
    }

    int first(){
        if (!empty()){
            return queue.getFirst();
        }
        //throw new NoSuchElementException("The queue is empty!");
        return error;
    }

    @Override
    public String toString(){
        if (!empty())
            return queue.toString();
        else return "The queue is empty!";        
    }

    int geterror(){
        return error;
    }

    String errorOperation(){
        return "The queue is empty!";
    }
}


