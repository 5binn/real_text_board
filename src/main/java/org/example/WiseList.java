package org.example;

public class WiseList {
    private int count;
    private String content;
    private String author;

    WiseList (int count, String content, String author) {
        this.count = count;
        this.content = content;
        this.author = author;
    }
    public int getCount() {
        return this.count;
    }
    public String getContent() {
        return this.content;
    }
    public String getAuthor() {
        return this.author;
    }

}
