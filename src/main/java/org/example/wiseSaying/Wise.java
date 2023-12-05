package org.example.wiseSaying;

public class Wise {
    private int count;
    private String content;
    private String author;

    public Wise(int count, String content, String author) {
        this.count = count;
        this.content = content;
        this.author = author;
    }

    public int getCount() {
        return count;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }
}
