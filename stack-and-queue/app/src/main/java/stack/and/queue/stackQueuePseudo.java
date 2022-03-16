package stack.and.queue;

public class stackQueuePseudo<T> {

    stack<T> front = new stack<>();
    final stack<T> back = new stack<>();

    public void enqueue(T value) {

        if (front.top == null) {
            back.push(value);
        } else {
            while (front.top != null) {
                back.push(front.pop());
            }
            back.push(value);
        }

    }

    public T dequeue(){
        if (front.top == null && back.top == null){
            return null;
        }

        if(back.top == null){
            return front.pop();
        } else {
            while (back.top != null){
                front.push(back.pop());
            }
            return front.pop();
        }
    }
}
