package maven;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sample {


	public static class Selenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\eclipse-workspace\\maven\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
}
	}}