package com.yrd980.collections_;

import java.util.*;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework01 {
    public static void main(String[] args) {
        News covid = new News("covid");
        News fish = new News("fish");
        ArrayList arr = new ArrayList();
        arr.add(covid);
        arr.add(fish);
        Collections.reverse(arr);
        for (int i = 0; i < arr.size(); i++) {
            News news = (News) arr.get(i);
            System.out.println (processNews(news.getTitle()));
        }

        Iterator it = arr.iterator();
        while (it.hasNext()) {
            //Object next =  it.next();
            News news1 = (News) it.next();
            System.out.println (processNews(news1.getTitle()));
        }
    }

    public static String processNews(String title){
        if(title == null){
            return " ";
        }else if(title.length()>=4){
            return  title.substring(0,4)+"...";
        }else{
            return title;
        }
    }
};

class News{
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}