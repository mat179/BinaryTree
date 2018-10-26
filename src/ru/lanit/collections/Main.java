package ru.lanit.collections;

public class Main {
    public static void main(String[] args) {
        //
        Integer[] arr = {1,67, 23,23, 23, 80,80};
        MyTree<Integer> tree = new MyTree<>(arr);
        tree.add(55);
        tree.add(55);
        System.out.println(tree);
        System.out.println(tree.contain(25));
        System.out.println(tree.contain(23));
        System.out.println(tree.count(23));
        System.out.println(tree.count(55));
        System.out.println(tree.count(-10));
        System.out.println(tree.count(1));
}
}
