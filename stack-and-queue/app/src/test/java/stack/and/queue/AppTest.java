/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void testStackPush() {
        stack<Integer> stack = new stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals("3-->2-->1-->null", stack.toString());
    }

    @Test
    public void testStackPop() {
        stack<Integer> stack = new stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        assertEquals("2-->1-->null", stack.toString());
    }

    @Test
    public void testMultipleStackPop() {
        stack<Integer> stack = new stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pop();
        stack.pop();
        assertEquals("null", stack.toString());
    }

    @Test
    public void testStackPeek() {
        stack<Integer> stack = new stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        assertEquals(2, stack.peek());
    }

    @Test
    public void emptyStack() {
        stack<Integer> stack = new stack<>();
        assertEquals("null", stack.toString());
    }

    @Test
    public void emptyStackPop() {
        stack<Integer> stack = new stack<>();
        stack.pop();
        System.out.println(stack);
        Exception exception=  new NullPointerException("it,s empty stack.");{}
        String expectedMessage = "it,s empty stack.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));


    }

    @Test
    public void testQueueEnqueue() {
        queue<Integer> queue = new queue<>();
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        assertEquals("3-->2-->1-->null", queue.toString());
    }

    @Test
    public void testQueueDequeue() {
        queue<Integer> queue = new queue<>();
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        queue.dequeue();
        assertEquals("2-->1-->null", queue.toString());
    }

    @Test
    public void testQueuePeek() {
        queue<Integer> queue = new queue<>();
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        queue.peek();
        assertEquals("3", queue.peek().toString());
    }

    @Test
    public void testQueueDequeueEmpty() {
        queue<Integer> queue = new queue<>();
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertEquals("null", queue.toString());
    }

    @Test
    public void testQueueEmpty() {
        queue<Integer> queue = new queue<>();
        assertEquals("null", queue.toString());
    }

    @Test
    public void testQueuePeekEmpty() {
        queue<Integer> queue = new queue<>();
        queue.peek();
     Exception exception=  new NullPointerException("it,s empty stack.");{}
        String expectedMessage = "it,s empty stack.";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));


        }
    }


