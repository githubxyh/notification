import main.ApiStatInfo;
import main.ApplicationContext;

public class Demo {

    public static void main(String[] args) {
        ApiStatInfo apiStatInfo = new ApiStatInfo();
        apiStatInfo.setDurationOfSeconds(100);
        apiStatInfo.setErrorCount(100);
        apiStatInfo.setRequestCount(100);

        ApplicationContext context = new ApplicationContext();
        context.initializeBeans();
        context.getAlert().check(apiStatInfo);
    }
}
