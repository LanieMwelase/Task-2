package lanie;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class one {
	static XSSFWorkbook wb;
	static XSSFSheet sheet1;
	
	public static void main(String[] args) throws IOException {
	
	
		System.setProperty("webdriver.chrome.driver", "/Users/User/Desktop/Thobelani Khanyi/Selenium/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//navigate to the website
		driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
		
		//validate user
		if (driver.getPageSource().contains("testadmin"))
		{
			System.out.println ("Test Admin is present on the user list table");	
		}
		else {
			   System.out.println("User not found");
			}
		
		//Click add user 
		driver.findElement(By.xpath("/html/body/table/thead/tr[2]/td/button")).click();
		
		//Add user1
		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@src='http://www.way2automation.com/angularjs-protractor/webtables/")));
		
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("FName1");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("LName1");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("User1");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("Pass1");	
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[1]/input")).click();
		
		Select dropdown = new Select(driver.findElement(By.id("RoleId")));
		dropdown.selectByVisibleText("admin");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[7]/td[2]/input")).sendKeys("admin@mail.com");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[8]/td[2]/input")).sendKeys("082555");
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/button[2]")).click();
	    
		sheet1.getRow(1).createCell(0).setCellValue("FName1");
		sheet1.getRow(1).createCell(1).setCellValue("LName1");
		sheet1.getRow(1).createCell(2).setCellValue("User1");
		sheet1.getRow(1).createCell(3).setCellValue("Pass1");
		sheet1.getRow(1).createCell(4).setCellValue("CompanyAAA");
		sheet1.getRow(1).createCell(5).setCellValue("Admin");
		sheet1.getRow(1).createCell(6).setCellValue("admin@mail.com");
		sheet1.getRow(1).createCell(7).setCellValue("082555");
		
		wb.close();
		
		//Validate user1 is added 
		if (driver.getPageSource().contains("FName1"))
		{
			System.out.println ("FName1 successfully added");	
		}
		else {
			   System.out.println("User unsuccessfully added");
			}
		
			
		//Add user2//www.way2automation.com/angularjs-protractor/webtables/")));
				
		driver.switchTo().frame( driver.findElement(By.xpath("//iframe[contains(@src,'modal-backdrop')]")) );
				driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("FName1");
				driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("LName1");
				driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[3]/td[2]/input")).sendKeys("User1");
				driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("Pass1");	
				driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[5]/td[2]/label[1]/input")).click();
				
				Select dropdown1 = new Select(driver.findElement(By.id("RoleId")));
				dropdown1.selectByVisibleText("admin");
				
				driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[7]/td[2]/input")).sendKeys("admin@mail.com");
				driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/table/tbody/tr[8]/td[2]/input")).sendKeys("082444");
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/button[2]")).click();
			    
				sheet1.getRow(2).createCell(0).setCellValue("FName2");
				sheet1.getRow(2).createCell(1).setCellValue("LName2");
				sheet1.getRow(2).createCell(2).setCellValue("User2");
				sheet1.getRow(2).createCell(3).setCellValue("Pass2");
				sheet1.getRow(2).createCell(4).setCellValue("CompanyBBB");
				sheet1.getRow(2).createCell(5).setCellValue("Customer");
				sheet1.getRow(2).createCell(6).setCellValue("customer@mail.com");
				sheet1.getRow(2).createCell(7).setCellValue("082555");
				
				wb.close();
				
				//Vallidate user2 is added 
				if (driver.getPageSource().contains("FName1"))
				{
					System.out.println ("FName1 successfully added");	
				}
				else {
					   System.out.println("User unsuccessfully added");
					}
				
	}
}

