package org.example.wiseSaying;

import org.example.Container;
import org.example.Request;

import java.util.ArrayList;
import java.util.List;

public class WiseController {
    private List<Wise> wiseList = new ArrayList<>();
    private int count = 1;

    public void write() {
        System.out.print("명언 : ");
        String content = Container.getSc().nextLine().trim();
        System.out.print("작가 : ");
        String author = Container.getSc().nextLine().trim();
        Wise wl = new Wise(count, content, author);
        this.wiseList.add(wl);
        System.out.println(this.count + "번 명언이 등록되었습니다.");
        this.count++;
    }

    public void list() {
        System.out.println("번호 / 작가 / 명언\n------------------");
        for (Wise ws : wiseList) {
            System.out.println(ws.getCount() + " / " + ws.getAuthor() + " / " + ws.getContent());
        }
    }

    public void delete(Request request) {
        int id = _getIntParam(request.getParams("id"));
        Wise ws = _getFindById(id);
        if (ws == null) {
            System.out.println(id + "번 명언은 존재하지 않습니다.");
            return;
        }
        wiseList.remove(ws);
        System.out.println(id + "번 명언이 삭제되었습니다.");
    }

    private int _getIntParam(String id) {
        int defaultValue = -1;
        try {
            return Integer.parseInt(id);
        } catch (NumberFormatException e) {
            System.out.println("id는 정수만 입력이 가능합니다.");
            return defaultValue;
        }
    }

    private Wise _getFindById(int id) {
        for (int i = 0; i < wiseList.size(); i++) {
            if (wiseList.get(i).getCount() == id) {
                return wiseList.get(i);
            }
        }
        return null;
    }

    public void modify(Request request) {
        int id = _getIntParam(request.getParams("id"));
        Wise ws = _getFindById(id);
        if (ws == null) {
            System.out.println(id + "번 명언은 존재하지 않습니다.");
            return;
        }
        System.out.println("명언(기존) : " + ws.getContent());
        System.out.print("명언 : ");
        String content = Container.getSc().nextLine().trim();
        ws.setContent(content);

        System.out.println("작가(기존) : " + ws.getAuthor());
        System.out.print("작가 : ");
        String author = Container.getSc().nextLine().trim();
        ws.setAuthor(author);

    }

}
