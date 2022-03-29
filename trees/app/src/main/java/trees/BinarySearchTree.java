package trees;

import java.util.Objects;

public class BinarySearchTree <Type> extends BinaryTree <Integer>
{

    public void add(Integer dataValue) {
        if (this.root == null)
        {
            this.root = new Node<>(dataValue);
        }
        else
        {
            this.root = insert(root, dataValue);
        }
    }

    private Node<Integer> insert(Node<Integer> node, Integer dataValue)
    {
        if (node == null)
        {
            node = new Node(dataValue);
        }
        else
        {
            if (node.dataValue > dataValue)
            {
                node.leftChild = insert(node.leftChild, dataValue);
            }
            else
            {
                node.rightChild = insert(node.rightChild, dataValue);
            }
        }
        return node;
    }

    public boolean contains(Integer dataValue) {
        return recursiveContains(this.root, dataValue);
    }

    private boolean recursiveContains(Node<Integer> currentNode, Integer dataValue)
    {
        if (currentNode == null)
        {
            return false;
        }
        if (Objects.equals(dataValue, currentNode.dataValue))
        {
            return true;
        }
        return dataValue < currentNode.dataValue
                ? recursiveContains(currentNode.leftChild, dataValue)
                : recursiveContains(currentNode.rightChild, dataValue);
    }

}