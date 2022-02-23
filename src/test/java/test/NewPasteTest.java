package test;

import org.testng.Assert;
import org.testng.annotations.Test;



public class NewPasteTest extends PreconditionTest {

    @Test
        public void createNewPaste() {

        newPastePage.openPage();
        newPastePage.pasteTextIntoNewPasteField("Hello from WebDriver");
        newPastePage.selectPasteExpiration();
        newPastePage.pasteTextIntoPasteNameField("helloweb");
        newPastePage.clickCreateNewPasteButton();
        newPastePage.expectedNewPasteCreated();

        }

}
