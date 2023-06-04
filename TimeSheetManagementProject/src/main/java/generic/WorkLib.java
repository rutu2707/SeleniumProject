package generic;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WorkLib extends BaseTest {

	public void acceptAlert() {

		driver.switchTo().alert().accept();
	}

	public void dismissAlert() {

		driver.switchTo().alert().dismiss();
	}

	public void acceptConfirmation() {

		driver.switchTo().alert().accept();

	}

	public void dismissConfirmation() {

		driver.switchTo().alert().dismiss();

	}

	public void rightClickMethod(WebElement target) {

		Actions act = new Actions(driver);
		act.contextClick(target);
	}

	public void doubleClickMethod(WebElement target) {

		Actions act = new Actions(driver);
		act.doubleClick(target);
	}

	public void moeHoverMethod(WebElement target) {

		Actions act = new Actions(driver);
		act.moveToElement(target);
	}

	public void dragAndDropMethod(WebElement src, WebElement target) {
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target);
	}

	public void handleFrameByIndex(int frameIndex) {

		driver.switchTo().frame(frameIndex);
	}

	public void handleFrameNameOrId(String nameOrId) {

		driver.switchTo().frame(nameOrId);
	}

	public void handleFrameByFrameElement(WebElement frameElement) {

		driver.switchTo().frame(frameElement);
	}
	
	public void dropDownSelect(WebElement element,String name )
	{
	   Select sel = new Select(element);
	   sel.selectByVisibleText(name);
	}

}
