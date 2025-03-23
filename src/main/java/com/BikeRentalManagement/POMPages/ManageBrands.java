package com.BikeRentalManagement.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageBrands {
    private WebDriver driver;

    // Element locators using @FindAll for auto-healing
    @FindAll({
        @FindBy(id = "brand"),
        @FindBy(name = "brand"),
        @FindBy(className = "form-control"),
        @FindBy(tagName = "INPUT"),
        @FindBy(xpath = "//FORM[@method='post']/DIV/DIV/INPUT")
    })
    private WebElement brandTextField;

    @FindAll({
        @FindBy(name = "submit"),
        @FindBy(className = "btn btn-primary"),
        @FindBy(tagName = "BUTTON"),
        @FindBy(xpath = "//BUTTON[normalize-space(.)='Submit']")
    })
    private WebElement submitButton;

    @FindAll({
        @FindBy(name = "zctb_length"),
        @FindBy(tagName = "SELECT"),
        @FindBy(xpath = "//SELECT[@class='form-control input-sm']")
    })
    private WebElement entriesDropdown;

    @FindAll({
        @FindBy(tagName = "INPUT"),
        @FindBy(xpath = "//INPUT[normalize-space(@class)='form-control input-sm']")
    })
    private WebElement manageBrandsSearchTextField;

    @FindAll({
        @FindBy(xpath = "//DIV[@class='dataTables_info']/following::A[normalize-space(.)='Previous']")
    })
    private WebElement previousLink;

    @FindAll({
        @FindBy(xpath = "//A[.='Next']/descendant-or-self::A")
    })
    private WebElement nextLink;

    public ManageBrands(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with the page
    public void enterBrandName(String brandName) {
        brandTextField.sendKeys(brandName);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void selectEntriesDropdown(String value) {
        // Implement dropdown selection logic here
    }

    public void enterSearchText(String searchText) {
        manageBrandsSearchTextField.sendKeys(searchText);
    }

    public void clickPreviousLink() {
        previousLink.click();
    }

    public void clickNextLink() {
        nextLink.click();
    }

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getBrandTextField() {
		return brandTextField;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getEntriesDropdown() {
		return entriesDropdown;
	}

	public WebElement getManageBrandsSearchTextField() {
		return manageBrandsSearchTextField;
	}

	public WebElement getPreviousLink() {
		return previousLink;
	}

	public WebElement getNextLink() {
		return nextLink;
	}
    
    
}