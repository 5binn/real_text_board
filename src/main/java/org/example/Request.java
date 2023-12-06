package org.example;

import java.util.HashMap;
import java.util.Map;

public class Request {
    private final String actionCode;
    private final Map<String, String> params = new HashMap<>();

    public Request(String command) {
        String[] commandList = command.split("\\?", 2);

        this.actionCode = commandList[0];

        if (commandList.length == 1) return;

        String[] paramsList = commandList[1].split("&");

        for (String param : paramsList) {
            String[] paramStr = param.split("=", 2);
            if (paramStr.length <= 1) return;
            this.params.put(paramStr[0], paramStr[1]);
        }
    }

    public String getActionCode() {
        return this.actionCode;
    }

    public String getParams(String key) {
        return this.params.get(key);
    }
}
