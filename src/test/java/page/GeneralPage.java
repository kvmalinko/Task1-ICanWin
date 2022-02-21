package page;

import org.openqa.selenium.WebDriver;

public abstract class GeneralPage {
    WebDriver driver;
    GeneralPage(WebDriver driver) {
        this.driver=driver;
    }
}
