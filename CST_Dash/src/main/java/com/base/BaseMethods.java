package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseMethods {

		public static WebDriver driver;//variable---null
	
			//SetProperty
			public static void setProperty() {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();

				//WebDriverManager.chromedriver().setup();
				//driver = new ChromeDriver();
				
				//WebDriverManager.edgedriver().setup();
				//driver =new EdgeDriver();
	
				 driver.manage().window().maximize();
			}
			
			
			//SendKeys
			public static void sendkeys(WebElement element, String value) {
				element.sendKeys(value);				
			}
			
			
			//Click
			public static void click(WebElement element) {
				element.click();
			}
			
			
			//Wait
			public static void wait(int w) throws InterruptedException {
				Thread.sleep(w);
			}
			
			
			//clear
			public static void clear(WebElement element) {
				element.clear();
			}
			
			
			//close
			public static void close() {
				driver.close();
			}
			
			
			//quit
			
			public static void quit() {
				driver.quit();
			}
			
			
			//DropDown
			public static void DropDown(WebElement element, String options, String value) {
				Select s=new Select(element);
				if(options.equalsIgnoreCase("Index")) {
					s.selectByIndex(Integer.parseInt(value));//string into Integer
				}else if(options.equalsIgnoreCase("visibletext")) {
					s.selectByVisibleText(value);
				}else if(options.equalsIgnoreCase("value")) {
					s.selectByValue(value);	
				}
			}
			
			
			//Frames
			public static void frameMethods(String frametype, String id,WebElement element, int index) {
				if(frametype.equalsIgnoreCase("id")) {
					driver.switchTo().frame(id);
				}
				else if(frametype.equalsIgnoreCase("Webelement")) {
					driver.switchTo().frame(element);
				}
				else if(frametype.equalsIgnoreCase("index")) {
					driver.switchTo().frame(index);
				}
				else if(frametype.equalsIgnoreCase("parentframe")) {
					driver.switchTo().parentFrame();
				}
				else if(frametype.equalsIgnoreCase("DefaultContent")) {
					driver.switchTo().defaultContent();
				}
				
			}
			
			
			
			//Alert
			public static void Alert(String alert) {
				if(alert.equalsIgnoreCase("accept")) {
					driver.switchTo().alert().accept();
				}else if(alert.equalsIgnoreCase("dismiss")) {
					driver.switchTo().alert().dismiss();
				}else if(alert.equalsIgnoreCase("gettext")) {
					driver.switchTo().alert().getText();
				}
			}
			
			
			//WebDriver Methods
			public static void webdrivermethods(String method) {
				if(method.equalsIgnoreCase("currenturl")) {
					System.out.println(driver.getCurrentUrl());
				}else if(method.equalsIgnoreCase("title")) {
					String title = driver.getTitle();
					System.out.println(title); 
				}
			}
			
			
			
			//Actions
			public static void action(WebElement element, String option) {
				Actions a=new Actions(driver);
				if(option.equalsIgnoreCase("perform")) {
					a.moveToElement(element).perform();
				}else if(option.equalsIgnoreCase("build")) {
					a.moveToElement(element).build().perform();
				}else if(option.equalsIgnoreCase("click")) {
					a.moveToElement(element).click().build().perform();
				}
			}
			
			
			//DragAndDrop
			public static void draganddrop(WebElement draggable, WebElement droppable) {
				Actions a=new Actions(driver);
				a.dragAndDrop(draggable, droppable).build().perform();
			}
				
				
			
			//radio
			public static void radio(WebElement element) {
				element.click();
				
			}
			//check
			public static void checkbox(WebElement element) {
				element.click();

			}
			/*//screenshot
				public static void screenshot(String path) throws IOException {
					TakesScreenshot ss=(TakesScreenshot)d;
					File src=ss.getScreenshotAs(OutputType.FILE);
					File target=new File(path);
					FileUtils.copyFile(src,target);
					

				}*/
				
				//Scroll
				/*public static void scroll(int s1, int s2) {
					
					int sr1=s1;
					int sr2=s2;
					 JavascriptExecutor js =  (JavascriptExecutor) d;
					
				        js.executeScript("window.scrollBy("+sr1+","+sr2+")");
				  }*/
				
				//URL
				public static void url(String url) {
					driver.get(url);
				}

				
				//Navigate URL
				public static void nurl( String url) {
							
					driver.navigate().to(url);
				}
				
				
				//navigate methods
				public static void navigate(String method) {
					if(method.equalsIgnoreCase("refresh")) {
						driver.navigate().refresh();
					}else if(method.equalsIgnoreCase("back")) {
						driver.navigate().back();
					}else if(method.equalsIgnoreCase("forward")) {
						driver.navigate().forward();
					}

				}
								
				
				//get Attribute
				public static void getAttribute(WebElement element, String value) {
					element.getAttribute(value);
				}
				


}
