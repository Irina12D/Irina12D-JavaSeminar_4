import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;


public class HomeWork_4 {
    public static void main(String[] args) {

        System.out.println("Task No 1");
        task1();

        System.out.println("Task No 2");
        task2();

        System.out.println("Task No 3");
        task3();
        
    }

    
    static LinkedList<Integer> createList(){
        Random rnd = new Random(); 
        int size = rnd.nextInt(10) + 5;
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int index = 0; index < size; index++) {
            linkedList.add(rnd.nextInt(100));
        }
        return linkedList;
    }

    // Задача 1
    /*
     Пусть дан LinkedList с несколькими элементами.
     Реализуйте метод, который вернет “перевернутый” список.
    */
    static LinkedList<Integer> reverseList(LinkedList<Integer> list){
        LinkedList<Integer> listNew = new LinkedList<Integer>();
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()){
            iterator.next();
        }
        while (iterator.hasPrevious()){
            listNew.add(iterator.previous());
        }
        return listNew;
    }

    static void task1(){
        LinkedList<Integer> sourceList = createList();
        System.out.print(" Source List:  ");
        System.out.println(sourceList);

        System.out.print(" Reverse List: ");
        System.out.println(reverseList(sourceList));
        System.out.println();
    }

    // Задача 2
    /*
     * Реализуйте очередь с помощью LinkedList со следующими методами:
     *    queue() - помещает элемент в конец очереди,
     *    dequeue() - возвращает первый элемент из очереди и удаляет его,
     *    first() - возвращает первый элемент из очереди, не удаляя.
     */
    static void task2(){
        MyQueue queue = new MyQueue();
        /*
        System.out.println(queue.toString());
        System.out.println(" Add 333");  queue.enqueue(333);
        System.out.println(" Add 111");  queue.enqueue(111);
        System.out.println(" Add 888");  queue.enqueue(888);
        System.out.println(" Queue: " + queue.toString());
        System.out.println(" First element: " + queue.first());
        System.out.println(" Queue: " + queue.toString());
        System.out.println(" Delete first element"); queue.dequeue();
        System.out.println(" Delete first element"); queue.dequeue();
        System.out.println(" Queue: " + queue.toString());
        System.out.println(" Delete first element"); queue.dequeue();
        System.out.println(" First element: " + queue.first());
        */
        System.out.println(" Queue: " + queue.toString());
        System.out.println(" Add 333");  queue.enqueue(333);
        System.out.println(" Add 111");  queue.enqueue(111);
        System.out.println(" Add 888");  queue.enqueue(888);
        System.out.println(" Queue: " + queue.toString());

        int result = queue.first();
        if (result == queue.geterror())
            System.out.println(" Can't return the first element: " + queue.errorOperation());
        else
            System.out.println(" First element is: " + result);
        System.out.println(" Queue: " + queue.toString());
        
        result = queue.dequeue();
        if (result == queue.geterror())
            System.out.println(" Can't delete element: " + queue.errorOperation());
        else
            System.out.println(" Delete first element"); 
        result = queue.dequeue();
        
        if (result == queue.geterror())
            System.out.println(" Can't delete element: " + queue.errorOperation());
        else
            System.out.println(" Delete first element"); 
        System.out.println(" Queue: " + queue.toString());
        
        result = queue.dequeue();
        if (result == queue.geterror())
            System.out.println(" Can't delete element: " + queue.errorOperation());
        else
            System.out.println(" Delete first element"); 
        
            result = queue.first();
        if (result == queue.geterror())
            System.out.println(" Can't return the first element: " + queue.errorOperation());
        else
            System.out.println(" First element: " + result);
        System.out.println(" Queue: " + queue.toString());

        System.out.println();
    }


    // Задача 3
    /*
     * Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
    */
    static int sumList(LinkedList<Integer> list){
        int sum = 0;
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()){
            sum += iterator.next();
        }
        return sum;
    }

    static void task3(){
        LinkedList<Integer> list = createList();
        System.out.print(" Source List:  ");
        System.out.println(list);
        System.out.println(" Summa is " + sumList(list));
    }
}

