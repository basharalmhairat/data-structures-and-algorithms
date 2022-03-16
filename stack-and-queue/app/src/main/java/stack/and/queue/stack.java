package stack.and.queue;

public class stack<T> {

    Node<T> top;

    public void push( T value){
        Node<T> new_node = new Node<>();
        new_node.value = value;
        new_node.next = this.top;
        this.top = new_node;
    }

    public T pop(){

      if(this.top == null) {
       throw new NullPointerException("it,s empty stack.");
       }
        Node<T> temp = this.top;
        this.top = temp.next;
        temp.next = null;

        return temp.value;
    }

    public T peek(){
        return this.top.value;
    }

    public boolean isEmpty(){
        return this.top == null;
    }

    public String toString(){
        return setToString(this.top);
    }

    private String setToString(Node<T> node){
        if (node == null){
            return "null";
        }

        return node.value + "-->" + setToString(node.next);
    }
}
