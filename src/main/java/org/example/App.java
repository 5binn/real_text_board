package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private Scanner sc;

    App(Scanner sc) {
        this.sc = sc;
    }

    void run() {
        System.out.println("== 명언 앱 ==");
        int count = 1;
        List<WiseList> wiseListList = new ArrayList<>();
        while (true) {
            System.out.print("명령) ");
            String command = sc.nextLine();
            if (command.equals("종료")) {
                break;
            } else if (command.equals("등록")) {
                System.out.print("명언 : ");
                String content = sc.nextLine().trim();
                System.out.print("작가 : ");
                String author = sc.nextLine().trim();
                WiseList wl = new WiseList(count, content, author);
                wiseListList.add(wl);
                System.out.println(count + "번 명언이 등록되었습니다.");
                count++;
            } else if (command.equals("목록")) {
                System.out.println("번호 / 작가 / 명언\n------------------");
                for (WiseList ws : wiseListList) {
                    System.out.println(ws.getCount() + " / " + ws.getAuthor() + " / " + ws.getContent());
                }
            }
        }

    }
}
