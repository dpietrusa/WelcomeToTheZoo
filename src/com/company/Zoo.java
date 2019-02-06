package com.company;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    List<Pen> pensArray = new ArrayList();


    public void addPenToArray(Pen pen) {
        pensArray.add(pen);
    }






    public String printPenName(int penNumber) {
        return (pensArray.get(penNumber).penName);
    }


    public void printPenNamesInArray() {
        for (int i = 0; i < pensArray.size(); i++) {
            System.out.println(i+1 + " - " + pensArray.get(i).penName);
        }

    }

}
