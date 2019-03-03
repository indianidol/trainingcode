package page.object.model.espncricinfo.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class landingPage {
	WebDriver driver;
	WebDriverWait wait;

	public landingPage(WebDriver driver, WebDriverWait wait) {

		this.driver = driver;
		this.wait = wait;
		
		//with page factory
		PageFactory.initElements(driver, this);
	}
	
//	By match1 = By.xpath("//span[text()='West Indies v England ']']");
	
	@FindBy(xpath = "//footer[@class]//a[normalize-space(text())='Scorecard']")
	public WebElement scoreCard;
	

	@FindBy(xpath = "//span[text()='West Indies v England']")
	public WebElement match1;

	@FindBy(xpath = "(//div[@class='scorecard-section bowling']//table/tbody)[1]")
	public WebElement scoreBoard;
	
	String part1="(//div[@class='scorecard-section bowling']//table/tbody/tr[";
	
	String part2="]/td[1]/a)[1]";

	
	public String gettitle() {

		return driver.getTitle();

	}

	public void getplayersinfoToMatchdata() {

	/*	match1.click();
		scoreCard.click();*/
		
		
	int rows=scoreBoard.findElements(By.tagName("tr")).size();		
		
	for(int i=1;i<=rows;i++) {
		
	String xpath = part1+i+part2;
	
	String playername= driver.findElement(By.xpath(xpath)).getText();
	
	System.out.println(playername);
	
	}
	//enhanced for loop
	
	List<WebElement> trlist=scoreBoard.findElements(By.tagName("tr"));	
	
	for(WebElement we:trlist) {
		System.out.println(we.getAttribute("data-reactid"));
		
	}
	
	
		

	}

	
	
	
	
	
}
