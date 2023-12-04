package org.example;

import org.example.system.SystemController;
import org.example.wiseSaying.WiseController;

import java.util.HashMap;
import java.util.Map;

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

            if (command.equals("종료")) {
                systemController.exit();
            } else if (command.equals("등록")) {
                wiseController.write();
            } else if (command.equals("목록")) {
                wiseController.list();
            } else if (command.startsWith("삭제")) {
                String[] commandList = command.split("\\?",2);
                Map<String ,String> params = new HashMap<>();

                String actionCode = commandList[0]; //삭제
                String[] paramsList = commandList[1].split("&"); // id=1 & +a

                for (String param : paramsList) {
                    String[] paramStr = param.split("=",2);
                    params.put(paramStr[0],paramStr[1]);


                }
                wiseController.delete();
            }


        }
    }
}
