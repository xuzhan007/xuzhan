package com.race;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        CircularLinkedList clList = new CircularLinkedList();
        clList.initList();
        clList.insertList(1);
        clList.insertList(2);
        clList.insertList(3);
        clList.insertList(4);
        clList.insertList(5);
        clList.deletelist(1);
        clList.print();

        //new Main().kill(10, 2);
    }

    private void kill(int total, int n) {
        List list = new ArrayList();
        list.remove("");
        LinkedList<Integer> all = new LinkedList<Integer>();
        for (int k = 0; k < total; k++) {
            all.add(k+1);
        }
        int cur = 0;
        int count = 1;
        while (all.size() > 1) {
            if (cur == all.size()) {
                cur = 0;
            }
            if (count == n) {
                all.remove(cur);
                count = 1;
                continue;
            }
            cur++;
            count++;
        }
        System.out.println(all.get(0));
        return;
    }
}