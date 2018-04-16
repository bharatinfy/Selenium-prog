import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import designwidget.Login;

public class Animation {

	public static void main(String[] args) throws InterruptedException {
		Login lo = new Login();

		WebDriver wd = lo.Log();

		Animation.animat(wd);

		Bharat b = new Bharat();
		b.Aont();

	}

	public static void animat(WebDriver driver) throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		int count = 2;
		for (int i = 0; i < count; i++) {
			Thread.sleep(3000);
			WebElement text = driver.findElement(By.xpath("//p"));

			Thread.sleep(3000);
			Actions act = new Actions(driver);
			act.moveToElement(text).build().perform();
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, -850)", "");
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//section/div[2]/div[1]/ul/li[4]/a")))
					.click();
			WebElement animate = driver
					.findElement(By.xpath("//select[@class='animate-select form-select form-control']"));

			Select s = new Select(animate);

			java.util.List<WebElement> options = s.getOptions();

			count = options.size();

			WebElement w = options.get(i);
			System.out.println(w.getText());

			s.selectByIndex(i);
			Thread.sleep(3000);
			System.out.println(w.getText() + "  " + "is selected and applied succesfully ");
			driver.findElement(By.xpath("//button[text()='Submit']")).click();

			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[@class='preview-website']")).click();
			Thread.sleep(5000);

			driver.findElement(By.xpath("//div[@class='sytion-logo']")).click();

			Thread.sleep(4000);

			driver.findElement(By.xpath("//span[2]/img")).click();

			Thread.sleep(4000);
		}
	}

}
