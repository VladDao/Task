package com.plietnov;

public class TestList<T extends Comparable<T>> {


    private Node firstElement;
    private Node lastElement;

    void add(T date) {
        if (date == null) {
            return;
        }
        Node node = new Node();
        node.data = date;
        if (firstElement == null) {
            firstElement = node;
            lastElement = node;
        } else {
            lastElement.next = node;
            lastElement = node;
        }
    }

    int size() {
        Node current = firstElement;
        int count = 0;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    boolean isEmpty() {
        if (firstElement == null) {
            return true;
        }
        return false;
    }

    boolean contains(T node) {
        Node current = firstElement;
        int count = 0;
        while (current != null) {
            if (current.data.equals(node)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    void remove(T date) {
        Node current = firstElement;
        Node tmp = null;
        while (current != null) {
            if (current.data.equals(date)) {
                if (tmp != null) {
                    tmp.next = current.next;
                } else {
                    firstElement = current.next;
                }
            }
            tmp = current;
            current = current.next;
        }
    }

    void reverseList() {
        Node previous = null;
        Node current = firstElement;
        lastElement = firstElement;
        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        firstElement = previous;
    }

    void reverseListRecursive() {
        lastElement = firstElement;
        reverseList(firstElement, null);
    }

    private void reverseList(Node current, Node previous) {
        if (current.next != null) {
            reverseList(current.next, current);
            Node next = current.next;
            next.next = current;
            current.next = previous;
        } else {
            firstElement = current;
        }
    }


    void printList() {
        Node tmp = firstElement;
        while (tmp != null) {
            System.out.print(tmp.data.toString() + " ");
            tmp = tmp.next;
        }
    }
}
