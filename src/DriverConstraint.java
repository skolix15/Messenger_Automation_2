import org.openqa.selenium.WebDriver;

public class DriverConstraint {

    private String driverPath;
    private String driverBrowser;

    public DriverConstraint(){

        driverPath = "";
        driverBrowser = "webdriver.chrome.driver";
    }

    public String getDriverPath() {
        return driverPath;
    }

    public String getDriverBrowser() {
        return driverBrowser;
    }



}
