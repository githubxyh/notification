package main;

public class ApplicationContext {
    private AlertRule alertRule;
    private Notification notification;
    private Alert alert;

    public void initializeBeans() {
        alertRule = new AlertRule();
        notification = new Notification();
        alert = new Alert();
        alert.addAlertHandler(new TpsAlertHandler(alertRule,notification));
        alert.addAlertHandler(new ErrorAlertHandler(alertRule,notification));
    }
    public Alert getAlert() { return alert; }  // 饿汉式单例
}
