package com.BikeRentalManagement.POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
    private WebDriver driver;

    // Element locators using @FindAll for auto-healing
    @FindAll({
        @FindBy(id = "password"),
        @FindBy(name = "password"),
        @FindBy(xpath = "//INPUT[normalize-space(@class)='form-control' and @name='password']"),
        @FindBy(xpath = "//*[normalize-space(@class)='form-control' and @name='password']")
    })
    private WebElement passwordField;

    @FindAll({
        @FindBy(id = "newpassword"),
        @FindBy(name = "newpassword"),
        @FindBy(xpath = "//INPUT[contains(@class,'form-control') and normalize-space(@name)='newpassword']"),
        @FindBy(xpath = "//*[contains(@class,'form-control') and normalize-space(@name)='newpassword']")
    })
    private WebElement newPasswordField;

    @FindAll({
        @FindBy(id = "confirmpassword"),
        @FindBy(name = "confirmpassword"),
        @FindBy(xpath = "//INPUT[normalize-space(@class)='form-control' and @name='confirmpassword']"),
        @FindBy(xpath = "//*[normalize-space(@class)='form-control' and @name='confirmpassword']")
    })
    private WebElement confirmPasswordField;

    @FindAll({
        @FindBy(name = "submit"),
        @FindBy(className = "btn btn-primary"),
        @FindBy(tagName = "BUTTON"),
        @FindBy(xpath = "//BUTTON[contains(.,'Save changes')]")
    })
    private WebElement saveChangesButton;

    @FindAll({
        @FindBy(linkText = "Dashboard"),
        @FindBy(xpath = "//A[normalize-space(.)='Dashboard']")
    })
    private WebElement dashboardLink;

    @FindAll({
        @FindBy(linkText = "Brands"),
        @FindBy(xpath = "//A[normalize-space(.)='Brands']"),
        @FindBy(xpath = "//*[normalize-space(.)='Brands']")
    })
    private WebElement brandsLink;

    @FindAll({
        @FindBy(linkText = "Vehicles"),
        @FindBy(xpath = "//A[normalize-space(.)='Vehicles']"),
        @FindBy(xpath = "//*[normalize-space(.)='Vehicles']")
    })
    private WebElement vehiclesLink;
    
    @FindAll({
        @FindBy(linkText = "Post a Vehicle"),
        @FindBy(xpath = "//A[normalize-space(.)='Post a Vehicle']")
    })
    private WebElement postVehicleLink;

    @FindAll({
        @FindBy(linkText = "Manage Vehicles"),
        @FindBy(xpath = "//A[normalize-space(.)='Manage Vehicles']")
    })
    private WebElement manageVehiclesLink;
    
    @FindAll({
        @FindBy(linkText = "Create Brand"),
        @FindBy(xpath = "//A[normalize-space(.)='Create Brand']")
    })
    private WebElement createBrandLink;

    @FindAll({
        @FindBy(linkText = "Manage Brands"),
        @FindBy(xpath = "//A[normalize-space(.)='Manage Brands']")
    })
    private WebElement manageBrandsLink;

    @FindAll({
        @FindBy(linkText = "Manage Booking"),
        @FindBy(xpath = "//A[normalize-space(.)='Manage Booking']")
    })
    private WebElement manageBookingLink;

    @FindAll({
        @FindBy(linkText = "Manage Testimonials"),
        @FindBy(xpath = "//A[normalize-space(.)='Manage Testimonials']")
    })
    private WebElement manageTestimonialsLink;

    @FindAll({
        @FindBy(linkText = "Manage Conatctus Query"),
        @FindBy(xpath = "//A[normalize-space(.)='Manage Conatctus Query']")
    })
    private WebElement manageContactUsQueryLink;

    @FindAll({
        @FindBy(linkText = "Reg Users"),
        @FindBy(xpath = "//A[normalize-space(.)='Reg Users']")
    })
    private WebElement regUsersLink;

    @FindAll({
        @FindBy(linkText = "Manage Pages"),
        @FindBy(xpath = "//A[normalize-space(.)='Manage Pages']")
    })
    private WebElement managePagesLink;

    @FindAll({
        @FindBy(linkText = "Update Contact Info"),
        @FindBy(xpath = "//A[normalize-space(.)='Update Contact Info']")
    })
    private WebElement updateContactInfoLink;

    @FindAll({
        @FindBy(linkText = "Manage Subscribers"),
        @FindBy(xpath = "//A[normalize-space(.)='Manage Subscribers']")
    })
    private WebElement manageSubscribersLink;

    public Homepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Methods to interact with the page
    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void enterNewPassword(String newPassword) {
        newPasswordField.sendKeys(newPassword);
    }

    public void enterConfirmPassword(String confirmPassword) {
        confirmPasswordField.sendKeys(confirmPassword);
    }

    public void clickSaveChanges() {
        saveChangesButton.click();
    }

    public void clickDashboardLink() {
        dashboardLink.click();
    }

    public void clickBrandsLink() {
        brandsLink.click();
    }

    public void clickVehiclesLink() {
        vehiclesLink.click();
    }

    public void clickManageBookingLink() {
        manageBookingLink.click();
    }

    public void clickManageTestimonialsLink() {
        manageTestimonialsLink.click();
    }

    public void clickManageContactUsQueryLink() {
        manageContactUsQueryLink.click();
    }

    public void clickRegUsersLink() {
        regUsersLink.click();
    }

    public void clickManagePagesLink() {
        managePagesLink.click();
    }

    public void clickUpdateContactInfoLink() {
        updateContactInfoLink.click();
    }

    public void clickManageSubscribersLink() {
        manageSubscribersLink.click();
    }

    public void clickCreateBrandLink() {
        createBrandLink.click();
    }

    public void clickManageBrandsLink() {
        manageBrandsLink.click();
    }

    public void clickPostVehicleLink() {
        postVehicleLink.click();
    }

    public void clickManageVehiclesLink() {
        manageVehiclesLink.click();
    }

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getNewPasswordField() {
		return newPasswordField;
	}

	public WebElement getConfirmPasswordField() {
		return confirmPasswordField;
	}

	public WebElement getSaveChangesButton() {
		return saveChangesButton;
	}

	public WebElement getDashboardLink() {
		return dashboardLink;
	}

	public WebElement getBrandsLink() {
		return brandsLink;
	}

	public WebElement getVehiclesLink() {
		return vehiclesLink;
	}

	public WebElement getPostVehicleLink() {
		return postVehicleLink;
	}

	public WebElement getManageVehiclesLink() {
		return manageVehiclesLink;
	}

	public WebElement getCreateBrandLink() {
		return createBrandLink;
	}

	public WebElement getManageBrandsLink() {
		return manageBrandsLink;
	}

	public WebElement getManageBookingLink() {
		return manageBookingLink;
	}

	public WebElement getManageTestimonialsLink() {
		return manageTestimonialsLink;
	}

	public WebElement getManageContactUsQueryLink() {
		return manageContactUsQueryLink;
	}

	public WebElement getRegUsersLink() {
		return regUsersLink;
	}

	public WebElement getManagePagesLink() {
		return managePagesLink;
	}

	public WebElement getUpdateContactInfoLink() {
		return updateContactInfoLink;
	}

	public WebElement getManageSubscribersLink() {
		return manageSubscribersLink;
	}
    
    
    
    
}