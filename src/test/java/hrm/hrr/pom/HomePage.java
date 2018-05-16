package hrm.hrr.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import hrm.hrr.generic.BasePage;

public class HomePage extends  BasePage{
	public HomePage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="txtUsername")
	private WebElement userTxtBox;	
	@FindBy(id="txtPassword")
	private WebElement pwdTxtBox;	
	@FindBy(id="btnLogin")
	private WebElement loginBtn;
	@FindBy(id="menu_pim_viewPimModule")
	private WebElement pim_Menu;
	@FindBy(id="menu_pim_addEmployee")
	private WebElement addEmp_Menu;
	@FindBy(id="firstName")
	private WebElement fName;
	@FindBy(id="lastName")
	private WebElement lName;
	@FindBy(id="btnSave")
	private WebElement saveBtn;
	@FindBy(id="personal_txtEmpFirstName")
	private WebElement firstName1;
	
	public void setUserName(String un){
		userTxtBox.sendKeys(un);	
	}
	
	public void setPwd(String pwd){
		pwdTxtBox.sendKeys(pwd);	
	}
	public void clickLogin(){
		loginBtn.click();	
	}
	public void clickPim_Menu(){
		pim_Menu.click();
	}
	public void clickAddEmp_Menu(){
		addEmp_Menu.click();
	}
	public void setFirstName(String fn){
		fName.sendKeys(fn);	
	}
	public void setLastName(String ln){
		lName.sendKeys(ln);	
	}
	public void clickSaveBtn(){
		saveBtn.click();
		
	}
	public void verifyFirstName(String eFn){
		String aFn = firstName1.getAttribute("value");
		Assert.assertEquals(aFn, eFn);
		
	}
	//To verify the list box sorted or not
	@FindBy(id="menu_pim_viewEmployeeList")
	private WebElement EmpList_Btn;
	public void clickEmpList(){
		EmpList_Btn.click();
		
		
	}

}
