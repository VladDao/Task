package com.plietnov;

public class Task {

    public static void main(String[] args) {
        TestList<Integer> testList = new TestList<>();

        System.out.println("\nisEmpty");
        System.out.println(testList.isEmpty());

        testList.add(7);
        testList.add(11);
        testList.add(13);
        System.out.println("\nAdd [7, 11, 13]");
        testList.printList();

        System.out.println("\ncontains 7");
        System.out.println(testList.contains(7));

        System.out.println("\ncontains 8");
        System.out.println(testList.contains(8));

        System.out.println("\nreverse list");
        testList.reverseList();
        testList.printList();

        System.out.println("\nreverse list with recursive");
        testList.reverseListRecursive();
        testList.printList();

        System.out.println("\nremove");
        testList.remove(11);
        testList.printList();

        System.out.println("\nsize");
        System.out.println(testList.size());

    }
}
