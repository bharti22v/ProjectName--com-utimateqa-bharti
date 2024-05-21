package comutimateqa1;

/**
 * BaseUrl = https://courses.ultimateqa.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Sign In’ link
 * 7. Print the current url
 * 8. Enter the email to email field.
 * 9. Enter the password to password field.
 * 10. Click on Login Button.
 * 11. Navigate to baseUrl.
 * 12. Navigate forward to Homepage.
 * 13. Navigate back to baseUrl.
 * 14. Refresh the page.
 * 15. Close the browser.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComUtimateqa {
    public static void main(String[] args) {

        //1.set up chrome browser.
        String baseUrl = "https://courses.ultimateqa.com/";
        //launch chrome browser
        WebDriver driver = new ChromeDriver();

        //2. Open URL
        driver.get(baseUrl);

        //3.Print the title of the page
        System.out.println("The title ofthe page:" + driver.getTitle());

        //4.Print the current Url
        System.out.println("The current url:" + driver.getCurrentUrl());

        //5.print the page source
        System.out.println("The page source:" + driver.getPageSource());

        //6.Click on Sign In link
        driver.findElement(By.linkText("Sign In")).click();

        //7.Print the current Url
        System.out.println("The current URL:" + driver.getCurrentUrl());

        //8.Enter the email to email field
        driver.findElement(By.id("user[email]")).sendKeys("prime123@gmail.com");

        //9.Enter the password to password field
        driver.findElement(By.id("user[password]")).sendKeys("prime123");

        //10.Click on the login button
        driver.findElement(By.className("button")).click();

        //11.Navigate to baseUrl
        driver.get(baseUrl);

        //12.Navigate forward to homepage
        driver.navigate().forward();

        //13.Navigate back to baseUrl
        driver.navigate().back();

        //14.Refresh the page
        driver.navigate().refresh();

        //15.Close the browser
        driver.quit();
    }
}