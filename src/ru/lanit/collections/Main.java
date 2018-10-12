package ru.lanit.collections;

public class Main {

    public static void main(String[] args) {
       /* Integer[] arr = {1,10, 25,40, 23, 80,23};
        MyTree<Integer> tree = new MyTree<>(arr);
        tree.add(55);
        tree.add(55);
        System.out.println(tree);
        System.out.println(tree.contain(25));
        System.out.println(tree.contain(55));
        System.out.println(tree.contain(11));
        System.out.println(tree.contain(10));
        System.out.println(tree.contain(-10));
        System.out.println(tree.contain(null));

        System.out.println(tree.count(23));
        System.out.println(tree.count(55));
        System.out.println(tree.count(-10));
        System.out.println(tree.count(1));*/

        Float[] arrFl = {1.5f,10.7f,10.7f, 25f ,40.34f, 40.34f, 23.12f, 80f, 23.12f};
        MyTree<Float> treeFl = new MyTree<>(arrFl);
        treeFl.add(55.24f);
        treeFl.add(55.12f);
        System.out.println(treeFl);
        System.out.println(treeFl.contain(55.13f));
        System.out.println(treeFl.count(23.12f));
        System.out.println(treeFl.count(10.7f));
        System.out.println(treeFl.count(40.34f));
        System.out.println(treeFl.count(25f));
        System.out.println(treeFl.getRoot().getLeft().getRight()+" - "+ treeFl.getRoot().getLeft().getLeft());

    }
}
