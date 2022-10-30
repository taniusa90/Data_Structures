import java.util.Stack;

public class ReverseFirstKElementsQueueProblem {
    public static void main(String[] args) {

        MyQueue<Integer>queue=new MyQueue<>();
        for (int i = 0; i < 6; i++) {
            queue.enqueue(i);

        }
        System.out.println("Initial queue: ");
        queue.printQueue();
        System.out.println();
        reverseFirstK(queue,3).printQueue();

    }
    static MyQueue<Integer> reverseFirstK(MyQueue<Integer> queue, int k){

        //create a stack
        Stack<Integer>stack=new Stack<>();
        //push first k elements into stack
        for (int i = 0; i < k; i++) {
            stack.push((queue.dequeue()));

        }
        //enqueue elemenets back into queue
        while (!stack.isEmpty()){
            queue.enqueue(stack.pop());
        }
         //dequeue
        for (int i = 0; i < queue.size-k; i++) {
            queue.enqueue(queue.dequeue());

        }
     return queue;
    }
}