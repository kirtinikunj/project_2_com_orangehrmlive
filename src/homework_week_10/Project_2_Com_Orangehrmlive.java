package homework_week_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * BaseUrl = https://opensource-demo.orangehrmlive.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Forgot your password?’ link.
 * 7. Print the current url.
 * 8. Navigate back to the login page.
 * 9. Refresh the page.
 * 10. Enter the email to email field.
 * 11. Enter the password to password field.
 * 12. Click on Login Button.
 * 13. Close the browser.
 */
public class Project_2_Com_Orangehrmlive {

    static String browser = "chrome";

    //base URL
    static String baseUrl = " https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {


        //setup  browser
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }

        //open URL
        driver.get(baseUrl);

        //Maximise the browser
        driver.manage().window().maximize();

        //print title of page
        System.out.println("The title of page is : " + driver.getTitle());

        //print current URL
        System.out.println("The current URL is : " + driver.getCurrentUrl());

        //print sourcr of page
        System.out.println("The source of page is : " + driver.getPageSource());

        //click on forgot password link
        driver.findElement(By.className("orangehrm-login-forgot-header")).click();

        //print current URL
        System.out.println("After clicking on forgot password, current URL is : " + driver.getCurrentUrl());

        //navigate back to login page
        driver.navigate().back();

        //refresh the page
        driver.navigate().refresh();

        //Enter Email in email field
        driver.findElement(By.className("oxd-input--active")).sendKeys("Admin");

        //Enter password in password field
        WebElement passwordField = driver.findElement(By.className("oxd-input--active"));
        passwordField.sendKeys("admin123");

        //click on login button
        WebElement loginButton = driver.findElement(By.className("orangehrm-login-button"));

        //close the browser
        driver.quit();
        System.out.println("im out");
    }
}
