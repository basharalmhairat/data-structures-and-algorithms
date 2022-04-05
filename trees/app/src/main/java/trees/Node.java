package trees;

public class Node <T> {
    public T dataValue;
    Node <T> leftChild;
    Node <T> rightChild;

    Node() {
        this.dataValue = null;
        this.leftChild = null;
        this.rightChild = null;
    }

    Node(T dataValue) {
        this.dataValue = dataValue;
        this.leftChild = null;
        this.rightChild = null;
    }

    Node(T dataValue, Node<T> leftChild, Node<T> rightChild) {
        this.dataValue = dataValue;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public void setLeftChild(Node<T> value) {
        this.leftChild = value;
    }

    public void setRightChild(Node<T> value) {
        this.rightChild = value;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setData(T dataValue) {
        this.dataValue = dataValue;
    }

    public T getData() {
        return this.dataValue;
    }
}