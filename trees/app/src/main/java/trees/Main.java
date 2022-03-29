package trees;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       BinarySearchTree<Integer>  binarySearchTree = new BinarySearchTree<> ();
       binarySearchTree.add(2);
       binarySearchTree.add(3);
       binarySearchTree.add(4);
       binarySearchTree.add(5);
       binarySearchTree.add(1);

        System.out.println(binarySearchTree.contains(6));
        System.out.println(binarySearchTree.isEmpty());
        System.out.println(Arrays.toString(binarySearchTree.postOrder()));
        System.out.println(Arrays.toString(binarySearchTree.inOrder()));
        System.out.println(Arrays.toString(binarySearchTree.preOrder()));


    }




}
