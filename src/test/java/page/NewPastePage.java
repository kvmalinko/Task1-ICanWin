package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewPastePage extends GeneralPage {
    public NewPastePage(WebDriver driver) {
        super(driver);
    }

    private final By newPasteField = By.xpath("//*[@id='postform-text']");
    private final By pasteExpirationList = By.id("select2-postform-expiration-container");
    private final By pasteExpirationSelection = By.xpath("//*[contains(@id, '10M')]");
    private final By pasteNameField = By.id("postform-name");
    private final By createNewPasteButton = By.xpath("//button[contains(text(), 'Create New Paste')]");
    private final By expectedNewPasteCondition = By.xpath("//div[@class='notice -success -post-view']");

    public void openPage(){
        driver.get("https://pastebin.com");
    }

    public void pasteTextIntoNewPasteField(String termNewPaste){
        driver.findElement(newPasteField)
                .sendKeys(termNewPaste);
    }

    public void selectPasteExpiration(){
        driver.findElement(pasteExpirationList)
                .click();
        new WebDriverWait(driver , 10)
                .until(ExpectedConditions
                        .presenceOfAllElementsLocatedBy(pasteExpirationSelection));
        driver.findElement(pasteExpirationSelection)
                .click();
    }

    public void pasteTextIntoPasteNameField(String termPasteName){
        driver.findElement(pasteNameField)
                .sendKeys(termPasteName);
    }

    public void clickCreateNewPasteButton(){
        driver.findElement(createNewPasteButton)
                .click();
        new WebDriverWait(driver , 10)
                .until(ExpectedConditions
                        .presenceOfAllElementsLocatedBy(expectedNewPasteCondition));
    }

    public void expectedNewPasteCreated() {
        driver.findElement(expectedNewPasteCondition);
    }
}