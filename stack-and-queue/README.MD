
## Challenge
Using a Linked List as the underlying data storage mechanism, implement both a Stack and a Queue
Node
Create a Node class that has properties for the value stored in the Node, and a pointer to the next node.
- Stack
Create a Stack class that has a top property. It creates an empty Stack when instantiated.
This object should be aware of a default empty value assigned to top when the stack is created.
The class should contain the following methods:
- Queue
Create a Queue class that has a front property. It creates an empty Queue when instantiated.
This object should be aware of a default empty value assigned to front when the queue is created.
The class should contain the following methods:
## Approach & Efficiency
T:O(1)
S:O(N)
## API
### Stack:
#### push: adds a new node with that value to the top of the stack with an O(1) Time performance.
#### pop: Returns: the value from node from the top of the stack.Removes the node from the top of the stack.Should raise exception when called on empty stack.
#### peek: Returns: Value of the node located at the top of the stack.Should raise exception when called on empty stack.
#### is empty: Returns: Boolean indicating whether or not the stack is empty.

### Queue
#### enqueue: adds a new node with that value to the back of the queue with an O(1) Time performance.
#### dequeue: Returns: the value from node from the front of the queue.Removes the node from the front of the queue.Should raise exception when called on empty queue.
#### peekReturns: Value of the node located at the front of the queue,Should raise exception when called on empty stack.
#### is empty: Returns: Boolean indicating whether or not the queue is empty.

---

# Challenge Summary
Create a new class called pseudo queue.
Do not use an existing Queue.
Instead, this PseudoQueue class will implement our standard queue interface (the two methods listed below),
Internally, utilize 2 Stack instances to create and manage the queue


## Whiteboard Process
![enqueueanddequeuepesedo](https://user-images.githubusercontent.com/97823170/158697373-18da44dc-4d9a-40b2-9182-927d6de0f272.png)


## Approach & Efficiency
Big O

S: O(N)
T: O(N)
## Solution
[linke to my solved code](https://github.com/basharalmhairat/data-structures-and-algorithms/blob/main/stack-and-queue/app/src/main/java/stack/and/queue/stackQueuePseudo.java)
