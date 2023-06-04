package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import genericPackage.WorkLib;

public class ProjectAndCustomerCreationPage {

	@FindBy(xpath = "//a[text()='Projects & Customers']") private WebElement ProjectAndCustomers ;
	
	@FindBy(xpath = "//input[@value='Create New Customer']") private WebElement CreateNewCustomerButton;
	@FindBy(xpath = "//input[@name = 'name']") private WebElement CustomerNameTB;
	@FindBy(xpath = "//input[@name ='createCustomerSubmit']") private WebElement CreateCustomerButton;
	@FindBy(xpath = "//input[@value ='      Cancel      ']") private WebElement cancelCustomerCreationButton;
	
	@FindBy(xpath = "//input[@value='Create New Project']")private WebElement CreateNewProjectButton;
	@FindBy(xpath = "//select[@name ='customerId']") private WebElement SelectCustomerDropDown ;
	@FindBy(xpath = "//input[@name ='name']") private WebElement ProjectNameTB ;
	@FindBy(xpath = "//input[@value='Create Project']") private WebElement CreateProjectButton ;
	@FindBy(xpath = "//input[@value='    Cancel    ']") private WebElement cancelProjectCreation ;
	
	public ProjectAndCustomerCreationPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	public WebElement getProjectAndCustomers() {
		return ProjectAndCustomers;
	}
	public WebElement getCreateNewCustomerButton() {
		return CreateNewCustomerButton;
	}
	public WebElement getCustomerNameTB() {
		return CustomerNameTB;
	}
	public WebElement getCreateCustomerButton() {
		return CreateCustomerButton;
	}
	public WebElement getCancelCustomerCreationButton() {
		return cancelCustomerCreationButton;
	}
	public WebElement getCreateNewProjectButton() {
		return CreateNewProjectButton;
	}
	public WebElement getSelectCustomerDropDown() {
		return SelectCustomerDropDown;
	}
	public WebElement getProjectNameTB() {
		return ProjectNameTB;
	}
	public WebElement getCreateProjectButton() {
		return CreateProjectButton;
	}
	public WebElement getCancelProjectCreation() {
		return cancelProjectCreation;
	}
	
	public void createCustomerMethod(String customerName) {
		
		CreateNewCustomerButton.click();
		CustomerNameTB.sendKeys(customerName);
		CreateCustomerButton.click();
	}
	
    public void createProjectMethod(String customerName , String projectName) {
    	
    	CreateNewProjectButton.click();
    	SelectCustomerDropDown.click();
        WorkLib wl = new WorkLib();
        wl.dropDownSelect(SelectCustomerDropDown,projectName);
    	CreateProjectButton.click();
    }
   	
}
