package org.example;

import java.util.LinkedList;
import java.util.List;

public class Main {
    static void toStringList(List<? extends Root> list) {
        for (Root item : list) {
            item.func();
        }
    }

    public static void main(String[] args) {
        List<Root> mixedList = new LinkedList<>();
        mixedList.add(new ClassOfFirstBranch1());
        mixedList.add(new ClassOfFirstBranch2());
        mixedList.add(new ClassOfSecondBranch1());
        mixedList.add(new ClassOfSecondBranch2());

        toStringList(mixedList);
        System.out.println();

        List<FirstBranch> branchFirstList = new LinkedList<>();
        branchFirstList.add(new ClassOfFirstBranch1());
        branchFirstList.add(new ClassOfFirstBranch2());

        toStringList(branchFirstList);
        System.out.println();

        List<SecondBranch> branchSecondList = new LinkedList<>();
        branchSecondList.add(new ClassOfSecondBranch1());
        branchSecondList.add(new ClassOfSecondBranch2());

        toStringList(branchSecondList);
    }
}