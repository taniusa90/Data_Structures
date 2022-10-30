import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    TNode root;

    public MyTree() {
    }
    void insert(int value){
        TNode newNode=new TNode(value);
        if (root==null) {
            root=newNode;
            return;
        }
        TNode current =root;
        while(true){
            if (value<= current.value){

                if (current.leftChild==null){
                    // if left is null insert there!!!
                    current.leftChild=newNode;
                    break;
                }
                //if leftChild is not null branch into left subtree!!
                current=current.leftChild;
            }
            else {
                if (current.rightChild==null){
                    // if right is null insert there!!!
                    current.rightChild=newNode;
                    break;
                }
                //if rightChild is not null branch into right subtree!!
                current=current.rightChild;
            }
        }
    }

    //PreOrder Traversal of the tree
    //Root-Left-Right
    void preOrderTraversal(TNode root){
        if (root==null){
            return;
        }
        System.out.print(root.value+", ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);




        }

    //InOrder
    //Left-Root-Right
        void inOrderTraversal(TNode root){
            if (root==null){
                return;
            }
            inOrderTraversal(root.leftChild);
            System.out.print(root.value+", ");
            inOrderTraversal(root.rightChild);
    }
    //Post-Order
    //Left-Right-Root
    void postOrder(TNode root){
        if (root==null){
            return;
        }
        postOrder(root.leftChild);
        postOrder(root.rightChild);
        System.out.print(root.value+", ");
    }

    void levelOrderTraversal(){
        if (root==null){
            return;
        }
        Queue<TNode>queue=new LinkedList<>();
        queue.add(root);//we add the root to queue
        while (!queue.isEmpty()){
            TNode toVisit=queue.poll();//front element of the queue
            System.out.print(toVisit.value+", ");
            if (toVisit.leftChild!=null){//i have a left child
                queue.add(toVisit.leftChild);

            }
            if (toVisit.rightChild!=null){
                queue.add(toVisit.rightChild);
            }
        }
    }



}