package main;

public class AlertRule {

    private int maxTps = 10;
    private int maxErrorCount = 10;
    private int maxTimeoutTps = 10;

    public AlertRule getMatchedRule(String apiName){
        return this;
    }

    public int getMaxTps() {
        return maxTps;
    }

    public void setMaxTps(int maxTps) {
        this.maxTps = maxTps;
    }

    public int getMaxErrorCount() {
        return maxErrorCount;
    }

    public void setMaxErrorCount(int maxErrorCount) {
        this.maxErrorCount = maxErrorCount;
    }

    public int getMaxTimeoutTps() {
        return maxTimeoutTps;
    }

    public void setMaxTimeoutTps(int maxTimeoutTps) {
        this.maxTimeoutTps = maxTimeoutTps;
    }
}
