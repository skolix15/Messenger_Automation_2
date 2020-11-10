import org.openqa.selenium.WebElement;

public class ChatPageConstraint {

    private String searchBoxXpath;
    private String contactsBoxXpath;
    private String writeMessageBoxXpath;
    private String contactNameXpath;

    public ChatPageConstraint(){

        searchBoxXpath= "//input[contains(@aria-label, 'Αναζήτηση στο Messenger')]";

        contactsBoxXpath= "//*[@id=\"js_u\"]/div/div/div[1]/span[1]/div/div/div[2]";

        writeMessageBoxXpath= "//div[contains(@aria-label, 'Γράψτε ένα μήνυμα...')]";

    }

    public String getContactNameXpath(String contactName) {
        contactNameXpath= "//div[text()='" + contactName + "']";
        return contactNameXpath;
    }

    public String getContactsBoxXpath() {

        return contactsBoxXpath;
    }

    public String getSearchBoxXpath() {
        return searchBoxXpath;
    }

    public String getWriteMessageBoxXpath() {
        return writeMessageBoxXpath;
    }


}

