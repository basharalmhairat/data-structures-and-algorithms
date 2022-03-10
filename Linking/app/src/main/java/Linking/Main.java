
package Linking;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> newlist = new LinkedList();
        newlist.insert(3);
        newlist.insert(2);
        newlist.insert(1);

        newlist.includes(4);
        newlist.append(5);
        newlist.insertBefore(1,0);
        newlist.insertAfter(3,4);
        newlist.toString();
    }
}
