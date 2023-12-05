package org.example.wiseSaying;

import org.example.Container;
import org.example.Request;

import java.util.ArrayList;
import java.util.List;

public class WiseController {
    List<Wise> wiseList = new ArrayList<>();
    public int count = 1;
    public void write () {
        System.out.print("명언 : ");
        String content = Container.getSc().nextLine().trim();
        System.out.print("작가 : ");
        String author = Container.getSc().nextLine().trim();
        Wise wl = new Wise(count, content, author);
        this.wiseList.add(wl);
        System.out.println(this.count + "번 명언이 등록되었습니다.");
        this.count++;
    }
    public void list () {
        System.out.println("번호 / 작가 / 명언\n------------------");
        for (Wise ws : wiseList) {
            System.out.println(ws.count() + " / " + ws.author() + " / " + ws.content());
        }
    }
    public void delete(Request request) {

        int id = _getIntParam(request.getParams("id"));

        System.out.println(id + "번 명언이 삭제되었습니다.");
    }

    private int _getIntParam (String id) {
        int defaultValue = -1;
        try {
            return Integer.parseInt(id);
        } catch (NumberFormatException e) {
            System.out.println("id는 정수만 입력이 가능합니다.");
            return defaultValue;
        }
    }
}
