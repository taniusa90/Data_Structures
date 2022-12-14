import java.util.NoSuchElementException;

public class MyStack <T>{

    public SNode<T> bottom;
    public SNode<T> top;
    int size;
    public boolean isEmpty(){
        return bottom==null;
    }
    public void push(T item){
        SNode<T> node=new SNode<T>(item);
        if (isEmpty()){
            bottom=top=node;
        }
        else {
            top.next=node;
            top=node;
        }
        size++;
    }
    public T peek(){
        return (T) top.value;
    }
    public T pop(){
        SNode <T> peekNode;
        if (isEmpty()) throw new NoSuchElementException();

        if (top==bottom) { // stack has one element
            peekNode=top;
            top=bottom=null;
        } else{// more than one element
            peekNode=top;
            SNode<T> prev=bottom;
            while(prev.next!=top){
                prev=prev.next;
            }
            prev.next=null;
            top=prev;
        }
        size--;
        return (T) peekNode.value;
    }
}
