package stack.and.queue;

public class Main {

    public static void main(String[] args) {

        stack<Integer> stack = new stack<>();
//        stack.push(3);
//        stack.push(2);
//        stack.push(1);
        stack.pop();
//        System.out.println(stack.peek());
//        System.out.println(stack);
//        System.out.println(stack.isEmpty());
        System.out.println("----------------------------------");
        queue<Integer>queue=new queue<>();
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        System.out.println(queue.peek());
        queue.dequeue();

        System.out.println(queue.isEmpty());
        System.out.println(queue);
    }
}
