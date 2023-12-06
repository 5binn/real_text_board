package org.example.wiseSaying;

import java.util.ArrayList;
import java.util.List;

public class WiseService {
    private List<Wise> wiseList = new ArrayList<>();
    private int count = 1;
    public int write(String content,String author) {
        Wise wl = new Wise(count, content, author);
        this.wiseList.add(wl);
        count++;
        return wl.getCount();
    }


}
