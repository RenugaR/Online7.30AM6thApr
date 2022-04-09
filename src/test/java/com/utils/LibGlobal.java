package com.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;

	/*
	 * It will initialize the Webdriver
	 */
	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	/*
	 * It is used to launch the url of the application
	 * 
	 * @Param - url -String
	 */

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void quitBrowser() {
		driver.quit();
	}

	public static void insertType(WebElement ele, String value) {
		ele.sendKeys(value);
	}

	public static void click(WebElement ele) {
		ele.click();
	}

	public void switchToFrameUsingIdorName(String value) {
		driver.switchTo().frame(value);
	}

	public static String getData(int row, int cell) throws IOException {
		File loc = new File("C:\\Users\\god\\eclipse-workspace\\Online7.30AM7thMarFrame\\input\\Data.xlsx");
		FileInputStream fi = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		int cellType = c.getCellType();
		String value = null;
		if (cellType == 1) {
			value = c.getStringCellValue();
			System.out.println(value);
		} else if (cellType == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-MM-YYYY");
				value = sim.format(dateCellValue);
				System.out.println(value);
			} else {
				double numericCellValue = c.getNumericCellValue();
				long l = (long) numericCellValue;
				value = String.valueOf(l);
				System.out.println(value);
			}
		}
		return value;
	}

	public static void copyValue() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}

	public static void righClick(WebElement ele) {
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}

	public static void dDusingSelectByValue(WebElement ele, String value) {
		Select s = new Select(ele);
		s.selectByValue(value);
	}

	public static void getText(WebElement ele) {
		String text = ele.getText();
		System.out.println(text);
	}

	public static String getAttribute(WebElement ele, String name) {
		String attribute = ele.getAttribute(name);
		return attribute;
	}

	public static void switchToAlertusingAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public static boolean isDisplayed(WebElement ele) {
		boolean displayed = ele.isDisplayed();
		return displayed;
	}

	public static boolean isEnabled(WebElement ele) {
		boolean enabled = ele.isEnabled();
		System.out.println(enabled);
		return enabled;
	}

	public static void switchToParentPage() {
		driver.switchTo().defaultContent();
	}

	@SuppressWarnings("deprecation")
	public static void implictWait(long time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public static void clickJS(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
	}

	public static void pause(long mills) throws InterruptedException {
		Thread.sleep(mills);
	}
}
