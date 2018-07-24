package com.experiment;

import com.experiment.model.News;
import com.experiment.model.NewsFactory;
import com.experiment.model.Viewable;
import com.experiment.view.NewsListViewer;

import javax.swing.text.View;
import java.util.ArrayList;

public class Main {

    // 本地存储新闻内容，如何在终端显示

    // 1.抽象出 对象
    // 2.设计好 对象应该具有的属性，状态和行为
    // 3. 思考 对象之间的交互
    // 4. 开始写代码

    public static void main(String[] args) {
        String resource_path = Main.class.getClassLoader().getResource("news").getPath();

        NewsFactory newReader = null;
        try {
            newReader = new NewsFactory(resource_path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList<News> newsList = newReader.fetch();


        ArrayList<Viewable> viewableList = new ArrayList<Viewable>();
        viewableList.addAll(newsList);
        NewsListViewer viewer = new NewsListViewer(newsList);
        viewer.display();
    }
}
