package main;

public class ErrorAlertHandler extends AlertHandler {

    public ErrorAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo info) {
        if (info.getErrorCount() > rule.getMatchedRule(info.getApi()).getMaxErrorCount()) {
            notification.notify(Notification.ERROR);
        }
    }
}
