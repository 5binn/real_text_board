package org.example;

import org.example.system.SystemController;
import org.example.wiseSaying.WiseController;

public class App {
    private final SystemController systemController;
    private final WiseController wiseController;
    public App() {
        this.systemController = new SystemController();
        this.wiseController = new WiseController();
    }
    public void run() {
        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령) ");
            String command = Container.getSc().nextLine();
            Request request = new Request(command);
            switch (request.getActionCode()) {
                case "종료":
                    systemController.exit();
                    return;
                case "등록":
                    wiseController.write();
                    break;
                case "목록":
                    wiseController.list();
                    break;
                case "삭제":
                    wiseController.delete(request);
                    break;
            }
        }

    }
}
