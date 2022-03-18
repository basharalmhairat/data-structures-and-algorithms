package Linking;
public class LinkedList<T> {
        Node<T> head;

//        public LinkedList() {
//            this.head = null;
//        }

        public void insert(T v) {
            Node<T> new_node = new Node<T>(v);

            new_node.next = head;

            head = new_node;

        }

        public Boolean includes(T x) {
            Node<T> pointer = this.head;
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
//            System.out.println(out);
            return out.toString();
        }

        public void append(T v) {
            try
            {
                Node<T> pointer = head;

                while (pointer.next != null) {
                    pointer = pointer.next;
                }
                Node<T> nextNode = new Node<>(v);
                pointer.next = nextNode;

            }
            catch(NullPointerException e)
            {
                System.out.print("NullPointerException Caught");
            }
        }

        public void insertBefore(T v, T nV) {
            Node <T> newNode = new Node(nV);
            Node <T> pointer = head;
            Node <T> previous = head;

            if (includes(v))
            {
                if (head.value == v)
                {
                    newNode.next = head;
                    head = newNode;
                    return;
                }
                while (pointer != null)
                {
                    if (pointer.value == v)
                    {
                        newNode.next = pointer;
                        previous.next = newNode;
                        return;
                    }
                    previous = pointer;
                    pointer = pointer.next;
                }
            }
        }

        public void insertAfter(T v, T nV) {

            Node <T> newNode = new Node(nV);
            Node <T> pointer = head;

            if (includes(v))
            {
                if (head == v)
                {
                    head.next = newNode;
                    return;
                }
                while (pointer != null)
                {
                    if (pointer.value == v)
                    {
                        newNode.next = pointer.next;
                        pointer.next = newNode;
                        return;
                    }
                    pointer = pointer.next;
                }
            }
    }



    public String kthEnd( int k) {
        Node<T> node1 = head;
        Node<T> node2 = head;
        int count = 0;
        while (node1 != null) {
            if (count == (k + 1)) {
                break;
            }
            count += 1;
            node1 = node1.next;
        }
        if (count == (k + 1)) {
            while (node1 != null) {
                node1 = node1.next;
                node2 = node2.next;
            }
            System.out.println((int) node2.value);
            return (String) node2.value;
        }

        else if (k<count){return "you interred length less than 0";};
         if(k>count){return "you interred length bigger than the original length";}
       else  return "you interred length =  original length";

    }

    public  LinkedList zipLists(LinkedList first, LinkedList second) {
        Node pointer1 = first.head;
        Node pointer2 = second.head;

        while (pointer1.next != null && pointer2.next != null) {
            Node point1;
            Node point2;

            point1 = pointer1.next;
            point2 = pointer2.next;
            pointer2.next = point1;
            pointer1.next = pointer2;

            pointer1 = point1;
            pointer2 = point2;
        }
        if (pointer2.next == null) {pointer2.next = pointer1.next;pointer1.next = pointer2;}
        if (pointer1.next == null) {pointer1.next = pointer2;}
//        System.out.println(second);// just to see the different
        return first;

    }
    }
    

