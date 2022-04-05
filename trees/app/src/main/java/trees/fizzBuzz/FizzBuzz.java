package trees.fizzBuzz;

import trees.BinarySearchTree;
import trees.Node;

public class FizzBuzz extends BinarySearchTree<Object> {

    public BinarySearchTree<Integer> fizzBuzzTree(BinarySearchTree<Integer> inputTree)
    {
        Node<Integer> currentNode = inputTree.root;

        fizzBuzzTreeRecursive(currentNode);

        return inputTree;
    }

    private Node<Integer> fizzBuzzTreeRecursive(Node<Integer> currentNode)
    {
        if (currentNode != null)
        {
            valueCheck(currentNode);
            fizzBuzzTreeRecursive(currentNode.getLeftChild());
            fizzBuzzTreeRecursive(currentNode.getRightChild());
        }
        return currentNode;
    }

    public void valueCheck(Node currentNode)
    {
        if (( (int) currentNode.dataValue % 3 == 0) && ( (int) currentNode.dataValue % 5 == 0))
        {
            currentNode.dataValue = "FizzBuzz";
        }
        else if ((int) currentNode.dataValue % 3 == 0)
        {
            currentNode.dataValue = "Fizz";
        }
        else if ( (int) currentNode.dataValue % 5 == 0)
        {
            currentNode.dataValue = "Buzz";
        }
    }

}
