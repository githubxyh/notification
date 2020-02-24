package main;

public class Notification {
    public static final String TPS = "TPS";
    public static final String ERROR = "ERROR";

    public void notify(String type) {
        System.out.println("通知类型为：" + type);
    }
}
