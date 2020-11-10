import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

public class Main {

    public static void main(String[] args) {

        Driver driver = new Driver();
        LogInPage logInPage = new LogInPage(driver.getDriver());
        ChatPage chatPage = new ChatPage(driver.getDriver());

        String username= "";
        String password= "";
        String contactName = "";
        // or ArrayList<String> contactNames = new ArrayList<>();
        // contactNames.add("By this way you can add more names");
        String message= "";


        logInPage.logIn(username,password);
        chatPage.searchContact(contactName);
        chatPage.chooseContactFromTheResults(contactName);
        chatPage.writeMessage(message);
            
        /* If you want to send a message to many contacts:
         * 
         * for(int i=0;i<contactNames.length();i++){
         * 
         * chatPage.searchContact(contactNames.get(i));
         * chatPage.chooseContactFromTheResults(contactNames.get(i));
         * chatPage.writeMessage(message);
         * 
         * }
         * */
          


    }

}
