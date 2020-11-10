import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private WebDriver driver;
    private DriverConstraint driverConstraint;

    public Driver(){

        driverConstraint = new DriverConstraint();
        System.setProperty(driverConstraint.getDriverBrowser(), driverConstraint.getDriverPath());

        driver = new ChromeDriver();
        driver.get("https://www.messenger.com/");
    }

    public WebDriver getDriver()
    {
        return driver;
    }
}
