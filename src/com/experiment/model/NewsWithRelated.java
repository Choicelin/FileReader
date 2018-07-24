package com.experiment.model;

import java.util.HashMap;
import java.util.Map;

public class NewsWithRelated extends News {
    private HashMap<String, String> relateds;

    public NewsWithRelated(String title, String content) {
        super(title, content);
        relateds = new HashMap<String, String>();
    }

    public void addRelated(String date, String title) {
        this.relateds.put(date, title);
    }

    public HashMap<String, String> getRelateds() {
        return relateds;
    }

    // 对不同的viewer有不同的展示，从而体现多态, 重写
    public void display() {
        super.display();
        System.out.println("|Related|");
        for (Map.Entry<String, String> entry : this.relateds.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
