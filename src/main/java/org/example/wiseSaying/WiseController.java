package org.example.wiseSaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WiseController {
    public Scanner sc;
    List<Wise> wiseList = new ArrayList<>();
    int count = 1;
    public WiseController(Scanner sc) {
        this.sc = sc;
    }
    public void write () {
        System.out.print("명언 : ");
        String content = sc.nextLine().trim();
        System.out.print("작가 : ");
        String author = sc.nextLine().trim();
        Wise wl = new Wise(count, content, author);
        wiseList.add(wl);
        System.out.println(count + "번 명언이 등록되었습니다.");
        count++;
    }
    public void list () {
        System.out.println("번호 / 작가 / 명언\n------------------");
        for (Wise ws : wiseList) {
            System.out.println(ws.getCount() + " / " + ws.getAuthor() + " / " + ws.getContent());
        }
    }
}
