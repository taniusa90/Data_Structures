import java.util.NoSuchElementException;

public class MyQueue <T>{

    QNode<T> front;
    QNode<T> back;
    int size;
    boolean isEmpty(){
        return front==null;
    }

    T peek(){
        return (T)front.value;
    }

    void enqueue(T item){//add the item

        QNode<T> node = new QNode<T>(item);
        if (isEmpty()){
            front=back=node;
        }else {
            back.next=node;
            back=node;

        }
        size++;
    }

    T dequeue(){//remove te item
        QNode<T> frontNode;
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        //for one element in queue
        if (front==back){
            frontNode=front;
            front=back=null;
        }else {//for more than one element
            frontNode=front;
            front=front.next;
        }
        size--;
        return (T) frontNode.value;
    }
    int size(){
        return size;


    }
}
