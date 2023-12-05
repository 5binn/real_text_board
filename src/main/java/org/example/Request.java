package org.example;

import java.util.HashMap;
import java.util.Map;

public class Request {
    private String actionCode;
    private Map<String ,String> params = new HashMap<>();
    public Request(String command) {
        String[] commandList = command.split("\\?",2);
        this.actionCode = commandList[0];
        if (commandList.length == 1) return;
        String[] paramsList = commandList[1].split("&");
        for (String param : paramsList) {
            String[] paramStr = param.split("=",2);
            params.put(paramStr[0],paramStr[1]);
        }
    }
    public String getActioncode() {
        return actionCode;
    }
    public String getParams(String key) {
        return params.get(key);
    }
}
