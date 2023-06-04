package pagePackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//input[@name='username']") private WebElement usernameTB;
	@FindBy(xpath = "//input[@name='pwd']") private WebElement passwordTB;
	@FindBy(xpath = "//a[@id='loginButton']") private WebElement loginButton;
	@FindBy(xpath = "//input[@id='keepLoggedInCheckBox']") private WebElement keepMeLoginCheckBox;
	@FindBy(xpath = "//a[text()='Actimind Inc.']") private WebElement actiMindLink;

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);// searchContext and Object
	}

	public WebElement getUsernameTB() {
		return usernameTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getKeepMeLoginCheckBox() {
		return keepMeLoginCheckBox;
	}

	public WebElement getActiMindLink() {
		return actiMindLink;
	}

	public void validLogin(String validUsername, String validPassword) {

		usernameTB.sendKeys(validUsername);
		passwordTB.sendKeys(validPassword);
		loginButton.click();
	}

	public void inValidLogin(String invalidUsername, String invalidPassword) throws InterruptedException {

		usernameTB.sendKeys(invalidUsername);
		passwordTB.sendKeys(invalidPassword);
		loginButton.click();
		Thread.sleep(2000);
		usernameTB.clear();
	}

}

