package Linking;


    public class LinkedList<T> {
        Node head;

        public LinkedList(){
            this.head = null;
        }

        public void insert(T v){
            Node<T> new_node = new Node<T>(v);
            new_node.next = null;
            if (this.head == null) {
                this.head = new_node;}
            else {Node last = this.head;
                while (last.next != null) {
                    last = last.next;}
                last.next = new_node;
            }
        }
        public Boolean includes(T x){
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
        public String toString(){
            Node pointer = this.head;
            StringBuilder out = new StringBuilder();
            while (pointer != null) {
                if (pointer.next != null) {
                    out.append("{"+pointer.value+"}").append("->");
                } else {
                    out.append(pointer.value);
                }
                pointer = pointer.next;
            }
            System.out.println(out);
            return out.toString();
        }
    }

