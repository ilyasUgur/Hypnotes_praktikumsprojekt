package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DocumentPage extends BasePage {
    @FindBy(linkText = "Documents")
    public WebElement documentsLink;
    @FindBy(xpath = "//span[.='Add Document']")
    public WebElement addDocumentButton;
    @FindBy(xpath = "//*[contains(@accept,'.pdf')]")
    public WebElement selectFileButton;
    @FindBy(xpath = "//span[.='Cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//span[.='Next']")
    public WebElement next1Button;

    @FindBy(xpath = "(//*[contains(@class,'ant-btn-default')])[last()]/following::button")
    public WebElement next2Button;

    @FindBy(xpath = "//div[contains(text(),'Upload')]")
    public WebElement uploadText;

    @FindBy(xpath = "//div[contains(text(),'Add Annotations')]")
    public WebElement addAnnotationsText;

    @FindBy(xpath = " //div[contains(text(),'Self Annotations')]")
    public WebElement selfAnnotationsText;
    @FindBy(xpath = " //div[contains(text(),'Preview')]")
    public WebElement previewText;

    @FindBy(xpath = "//span[@class='ant-upload-list-item-name']")
    public WebElement pdfDocument;

    @FindBy(xpath = "//input[@class='ant-input']")
    public WebElement fileNameInput;
    @FindBy(xpath = "//*[text()='How to add annotation']")
    public WebElement howToAddAnnotationText;
    @FindBy(xpath = "//*[text()='Signature']")
    public WebElement signatureDropdown;

    @FindBy(xpath = "//*[@class='ant-select-selection-search-input']")
    public WebElement signatureDropdownForClick;

    @FindBy(xpath = "//*[contains(@class,'ant-select-item-option-content')]")
    public List<WebElement> signatureDropdownElements;

    @FindBy(xpath = "//span[.='Add Annotation']")
    public WebElement addAnnotationButton;

    @FindBy(xpath = "//*[text()='How to add signature']")
    public WebElement howToAddSignatureText;

    @FindBy(xpath = "//span[.='Optional Field']")
    public WebElement optionalFieldCheckBox;

    @FindBy(xpath = "//span[.='View Guide']")
    public WebElement viewGuideButton;

    @FindBy(xpath = "//button[@data-element='toolbarGroup-Annotate']")
    public WebElement annotateButton;

   // @FindBy(xpath = "//button[@data-element='toolbarGroup-Insert']")
    @FindBy(xpath = "(//button[contains(text(),'Insert')])[2]")
    public WebElement insertButton;

    @FindBy(xpath = "//*[text()='Add New Signature']")
    public WebElement addNewSignatureButton;

    @FindBy(xpath = "//*[@data-element='inkSignaturePanelButton']")
    public WebElement drawButton;

    @FindBy(xpath = "//*[@data-element='textSignaturePanelButton']")
    public WebElement typeButton;
    @FindBy(xpath = "//*[@data-element='imageSignaturePanelButton']")
    public WebElement uploadButton;
    @FindBy(xpath = "(//*[@class='signature-create'])[2]")
    public WebElement createTypeButton;
    @FindBy(xpath = "//*[@class='text-signature-input']")
    public WebElement typeInput;
    @FindBy(xpath = "//span[.='Finish']")
    public WebElement finishButton;
    @FindBy(xpath = "//video[@src='/video/guide.mp4']")
    public WebElement videoPlay;
    @FindBy(xpath = "//span[.='Documents successfully uploaded']")
    public WebElement documentsSuccessfullyUploadedAlert;

    @FindBy(xpath = "//button[@class='Dropdown']")
    public WebElement insertAnnotateDropdown;

    @FindBy(xpath = "(//span[.='OK'])[1]")
    public WebElement videoOkButton;


}
