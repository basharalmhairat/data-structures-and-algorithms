package Linking;

import java.util.ArrayList;
import java.util.List;

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
        ArrayList<T> savedValues = new ArrayList<T>();
        Node<T> pionter = head;

        while (pionter != null) {
            savedValues.add(pionter.value);
            pionter = pionter.next;
        }

        if (k > savedValues.size()) {
            return "Your interred length bigger than the list size.";
        } else if (k < 0) {
            return "Your interred length less than zero.";
        } else if (k == savedValues.size()) {
            return savedValues.get(savedValues.size() - 1).toString();
        }
        int index = (savedValues.size() - 1) - k;
        return savedValues.get(index).toString();

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
    

