package com.experiment.view;

import com.experiment.model.News;

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
            System.out.println("|Title|" + news.getTitle());
            System.out.println("|Content|" + news.getContent());
            Iterator entries = news.getRelated().entrySet().iterator();
            System.out.println("----------------------------------------");

            while (entries.hasNext()) {
                Map.Entry entry = (Map.Entry) entries.next();
                String key = (String) entry.getKey();
                String value = (String) entry.getValue();

                System.out.println("|Related Date|" + key);
                System.out.println("|Related Title|" + value);
            }
            System.out.println("----------------------------------------");
        }
    }
}
