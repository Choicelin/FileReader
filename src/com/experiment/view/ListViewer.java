package com.experiment.view;

import com.experiment.model.Viewable;

import java.util.ArrayList;

public class ListViewer {
    private ArrayList<Viewable> viewableList;

    public ListViewer(ArrayList<Viewable> viewableList) {
        this.viewableList = viewableList;
    }

    public void display() {
        for (Viewable viewableItem : viewableList) {
            System.out.println("----------------------------------------");
            viewableItem.display();
        }
    }
}
