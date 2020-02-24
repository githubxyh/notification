package main;

import java.util.ArrayList;
import java.util.List;

public class Alert {

    private List<AlertHandler> alertHandlers = new ArrayList<>();

    public void addAlertHandler(AlertHandler handler){
        alertHandlers.add(handler);
    }

    public void check(ApiStatInfo info){
        for (AlertHandler h : alertHandlers) {
            h.check(info);
        }
    }
}
