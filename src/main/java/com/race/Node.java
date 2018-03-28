package com.race;

/**
 * Created by iss on 17/9/5.
 */
public class Node {

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    Node  next;

    int data;
}
