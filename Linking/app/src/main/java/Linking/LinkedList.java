package Linking;


    public class LinkedList<T> {
        Node<T> head;

        public LinkedList() {
            this.head = null;
        }

        public void insert(T v) {
            Node<T> new_node = new Node<T>(v);

            new_node.next = head;

            head = new_node;

        }

        public Boolean includes(T x) {
            Node pointer = this.head;
            while (pointer != null) {
                if (pointer.value == x) {
                    System.out.println("true");
                    return true;
                }
                pointer = pointer.next;
            }
            System.out.println("false");
            return false;
        }

        public String toString() {
            Node<T> pointer = this.head;
            StringBuilder out = new StringBuilder();
            while (pointer != null) {
                if (pointer.next != null) {
                    out.append("{").append(pointer.value).append("}").append("->");
                } else {
                    out.append(pointer.value);
                }
                pointer = pointer.next;
            }
            System.out.println(out);
            return out.toString();
        }

        public void append(T v) {
            Node<T> pointer = this.head;

            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = new Node<T>(v);
        }

        public void insertBefore(T v, T nV) {
            Node<T> pointer =head;
            while (pointer.next != null) {
                if (pointer.next.value == v) {
                    Node<T> newNode = new Node<T>(nV);

                    newNode.next = pointer.next;
                    pointer.next = newNode;
                    return;
                }
                pointer = pointer.next;
            }
        }

        public void insertAfter(T v, T nV) {

            Node<T> pointer = head;

            while (pointer.next != null) {
                pointer = pointer.next;
                if (pointer.value == v) {
                    break;
                }
            }
            T temp = (T) pointer.next;
            Node<T> newNext = new Node<T>(nV);
            newNext.next = (Node<T>) temp;
            pointer.next = newNext;
    }

    }
    

