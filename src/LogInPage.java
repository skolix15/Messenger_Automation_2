import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

    private WebElement logInLink;
    private WebElement passwordLink;
    private WebElement logInButton;

    private LogInPageConstraint logInPageConstraint;

    private WebDriver driver;

    public LogInPage(WebDriver driver){

        this.driver = driver;
        logInPageConstraint = new LogInPageConstraint();
    }

    private void findLogInElements(){
        logInLink = driver.findElement(By.id(logInPageConstraint.getEmailId()));
        passwordLink = driver.findElement(By.id(logInPageConstraint.getPasswordId()));
        logInButton = driver.findElement(By.id(logInPageConstraint.getLoginButtonId()));
    }



    public void logIn(String username, String password){

        findLogInElements();

        logInLink.sendKeys(username);
        passwordLink.sendKeys(password);
        logInButton.click();

    }

}
