package com.experiment.view;

import com.experiment.model.News;
import com.experiment.model.NewsWithRelated;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class NewsListViewer {
    private ArrayList<News> newsList;

    public NewsListViewer(ArrayList<News> newsList) {
        this.newsList = newsList;
    }

    public void display() {
        for (News news : newsList) {
            System.out.println("----------------------------------------");
            // 最理解news展示的，是开发news的人
            news.display();
        }
    }
}
