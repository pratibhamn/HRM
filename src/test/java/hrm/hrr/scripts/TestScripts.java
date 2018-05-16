package hrm.hrr.scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import hrm.hrr.generic.BasePage;
import hrm.hrr.generic.BaseTest;
import hrm.hrr.generic.Excel;
import hrm.hrr.generic.GenericUtils;
import hrm.hrr.pom.HomePage;

public class TestScripts extends BaseTest{
	@Test(enabled=false)
	public void testCreateEmployee() throws EncryptedDocumentException, InvalidFormatException, IOException{
		HomePage pi=new HomePage(driver);
		pi.setUserName(Excel.readData("Sheet1", 0, 1));
		pi.setPwd(Excel.readData("Sheet1", 1, 1));
		pi.clickLogin();
		BasePage.verifyTitle("OrangeHRM");
		pi.clickPim_Menu();
		pi.clickAddEmp_Menu();
		pi.setFirstName("Adithya");
		pi.setLastName("Bhargav");
		pi.clickSaveBtn();
		pi.verifyFirstName("Adithya");
	}
	@Test(enabled=true)
	public void testSortListBox() throws EncryptedDocumentException, InvalidFormatException, IOException{
		HomePage pi=new HomePage(driver);
		pi.setUserName(Excel.readData("Sheet1", 0, 1));
		pi.setPwd(Excel.readData("Sheet1", 1, 1));
		pi.clickLogin();
		BasePage.verifyTitle("OrangeHRM");
		pi.clickPim_Menu();
		pi.clickEmpList();
		GenericUtils.sortListBox(driver.findElement(By.xpath("//select[@id='empsearch_job_title']")));
		
	}

}
