package ru.lanit.collections;

public class MyTreeNode<T extends  Number & Comparable> {
    private T key;
    private MyTreeNode parent;
    private MyTreeNode left;
    private MyTreeNode right;


    public MyTreeNode(T key) {
        this.key = key;
        this.parent = null;
    }

    public MyTreeNode(T key, MyTreeNode parent) {
        this.key = key;
        this.parent = parent;
    }

    public MyTreeNode(T key, MyTreeNode parent, MyTreeNode left, MyTreeNode right) {
        this.key = key;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }


    public void add(T key){
        if (key.compareTo(this.key)>=0){
            if (this.right == null) {
                this.right = new MyTreeNode(key, this);
                return;
            } else{
                right.add(key);
            }

        } else {
            if (this.left == null) {
                this.left = new MyTreeNode(key, this);
                return;
            } else{
                left.add(key);
            }
        }

    }

    @Override
    public String toString() {
        return key.toString();
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public MyTreeNode getParent() {
        return parent;
    }

    public void setParent(MyTreeNode parent) {
        this.parent = parent;
    }

    public MyTreeNode getLeft() {
        return left;
    }

    public void setLeft(MyTreeNode left) {
        this.left = left;
        if (left != null)
            left.setParent(this);
    }


    public MyTreeNode getRight() {
        return right;
    }

    public void setRight(MyTreeNode right) {
        this.right = right;
        if (right != null)
            right.setParent(this);
    }
}
