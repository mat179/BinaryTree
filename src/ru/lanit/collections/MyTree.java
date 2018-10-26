package ru.lanit.collections;

import java.util.Arrays;

public class MyTree<T extends Number & Comparable> {
    private MyTreeNode root;

    public MyTree(T[] arr) {
        Arrays.sort(arr);
        root = getNode(arr, 0,arr.length-1);
    }

    private MyTreeNode getNode(T[] arr, int min, int max){
        if (min > max)
            return null;
        //Находим средний индекс
        int index = min + (max - min)/2;
        //если в середине массива есть повторяющиеся элементы, находим индекс самого правого из них
        for(int i = index+1; i<=max; i++){
            if ((arr[i].compareTo(arr[index]) == 0))
                index = i;
            else
                break;
        }

        MyTreeNode<T> node = new MyTreeNode<>(arr[index]);
        node.setLeft(getNode(arr, min, index-1));
        node.setRight(getNode(arr, index+1, max));
        return node;
    }

    public MyTreeNode getRoot() {
        return root;
    }

    @Override
    public String toString() {
        if (root == null){
            return "";
        }
        return root.toString() +" "+ printTree(root.getLeft())+printTree(root.getRight()) ;
    }

    private String printTree(MyTreeNode node){
        if (node == null){
            return "";
        }
        return node.toString()+" "+printTree(node.getLeft())+printTree(node.getRight());
    }

    public void add(T key){
        if (key == null){
            return;
        }
        if (root == null){
            root = new MyTreeNode(key);
            return;
        } else {
            root.add(key);
        }

    }

    public boolean contain(T key){
        return checkNode(key,root);
    }

    private boolean checkNode(T key, MyTreeNode node){
        if ((node == null)||(key == null)){
            return false;
        }
        if (key.compareTo(node.getKey()) == 0){
            return true;
        } else if (key.compareTo(node.getKey()) > 0) {
            return checkNode(key, node.getRight());
        } else {
            return checkNode(key, node.getLeft());
        }

    }

    public int count(T key){
        return count(key,root);
    }

    private int count(T key, MyTreeNode node){
        if ((node == null)||(key == null)){
            return 0;
        }
        int tmp = key.compareTo(node.getKey()) == 0 ? 1:0;

        if (key.compareTo(node.getKey()) > 0) {
            return tmp+count(key,node.getRight());
        } else {
            return tmp+count(key, node.getLeft());
        }
    }
}
