import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ChatPage {

    private WebElement searchBox;
    private WebElement contactsBox;
    private WebElement writeMessageBox;

    private ChatPageConstraint chatPageConstraint;

    private WebDriver driver;

    public ChatPage(WebDriver driver){

        this.driver = driver;
        chatPageConstraint = new ChatPageConstraint();
    }

    public void searchContact(String contactName){

        searchBox = driver.findElement((By.xpath(chatPageConstraint.getSearchBoxXpath())));
        searchBox.sendKeys(contactName);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void chooseContactFromTheResults(String contactName){

        contactsBox = driver.findElement(By.xpath(chatPageConstraint.getContactsBoxXpath()));
        contactsBox.findElement(By.xpath(chatPageConstraint.getContactNameXpath(contactName))).click();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void writeMessage(String message){

        WebElement writeMessageBox = driver.findElement((By.xpath(chatPageConstraint.getWriteMessageBoxXpath())));
        writeMessageBox.click();

        writeMessageBox.sendKeys(message);
        writeMessageBox.sendKeys(Keys.ENTER);

    }


}