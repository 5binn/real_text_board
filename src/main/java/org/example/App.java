package org.example;

import org.example.system.SystemController;
import org.example.wiseSaying.Wise;
import org.example.wiseSaying.WiseController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private final Scanner sc;

    SystemController systemController;
    WiseController wiseController;

    App(Scanner sc) {
        this.sc = sc;
        systemController = new SystemController();
        wiseController = new WiseController(sc);
    }

    void run() {

        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령) ");
            String command = sc.nextLine();

            if (command.equals("종료")) {
                systemController.exit();
                break;
            } else if (command.equals("등록")) {
                wiseController.write();
            } else if (command.equals("목록")) {
                wiseController.list();
            }
        }

    }
}
