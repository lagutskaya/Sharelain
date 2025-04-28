import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class ShoppingCartTest {
    @Test
    public void checkDiscount0Percent() {
        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=Polina" +
                "&last_name=Ivanov&email=test%40tes.com&password1=test1&password2=test1");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");

        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();

        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=7");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("19");
        driver.findElement(By.cssSelector("[value=Update]")).click();

        String discountPercent = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountDollar = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalSum = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();

        softAssert.assertEquals(discountPercent, "0");
        softAssert.assertEquals(discountDollar, "0");
        softAssert.assertEquals(totalSum, "190");

        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkDiscount2Percent() {
        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=Polina" +
                "&last_name=Ivanov&email=test%40tes.com&password1=test1&password2=test1");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");

        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();

        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=7");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("20");
        driver.findElement(By.cssSelector("[value=Update]")).click();

        String discountPercent = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountDollar = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalSum = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();

        softAssert.assertEquals(discountPercent, "2");
        softAssert.assertEquals(discountDollar, "4");
        softAssert.assertEquals(totalSum, "196");

        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkDiscount3Percent() {
        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=Polina" +
                "&last_name=Ivanov&email=test%40tes.com&password1=test1&password2=test1");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");

        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();

        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=7");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("50");
        driver.findElement(By.cssSelector("[value=Update]")).click();

        String discountPercent = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountDollar = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalSum = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();

        softAssert.assertEquals(discountPercent, "3");
        softAssert.assertEquals(discountDollar, "15");
        softAssert.assertEquals(totalSum, "485");

        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkDiscount4Percent() {
        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=Polina" +
                "&last_name=Ivanov&email=test%40tes.com&password1=test1&password2=test1");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");

        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();

        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=7");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("200");
        driver.findElement(By.cssSelector("[value=Update]")).click();

        String discountPercent = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountDollar = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalSum = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();

        softAssert.assertEquals(discountPercent, "4");
        softAssert.assertEquals(discountDollar, "80");
        softAssert.assertEquals(totalSum, "1920");

        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkDiscount5Percent() {
        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=Polina" +
                "&last_name=Ivanov&email=test%40tes.com&password1=test1&password2=test1");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");

        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();

        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=7");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("500");
        driver.findElement(By.cssSelector("[value=Update]")).click();

        String discountPercent = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountDollar = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalSum = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();

        softAssert.assertEquals(discountPercent, "5");
        softAssert.assertEquals(discountDollar, "250");
        softAssert.assertEquals(totalSum, "4750");

        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkDiscount6Percent() {
        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=Polina" +
                "&last_name=Ivanov&email=test%40tes.com&password1=test1&password2=test1");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");

        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();

        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=7");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("3000");
        driver.findElement(By.cssSelector("[value=Update]")).click();

        String discountPercent = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountDollar = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalSum = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();

        softAssert.assertEquals(discountPercent, "6");
        softAssert.assertEquals(discountDollar, "1800");
        softAssert.assertEquals(totalSum, "28200");

        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkDiscount7Percent() {
        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=Polina" +
                "&last_name=Ivanov&email=test%40tes.com&password1=test1&password2=test1");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");

        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();

        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=7");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("5000");
        driver.findElement(By.cssSelector("[value=Update]")).click();

        String discountPercent = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountDollar = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalSum = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();

        softAssert.assertEquals(discountPercent, "7");
        softAssert.assertEquals(discountDollar, "3500");
        softAssert.assertEquals(totalSum, "46500");

        driver.quit();
        softAssert.assertAll();
    }

    @Test
    public void checkDiscount8Percent() {
        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=2&zip_code=12345&first_name=Polina" +
                "&last_name=Ivanov&email=test%40tes.com&password1=test1&password2=test1");
        String email = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");

        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();

        driver.get("https://www.sharelane.com/cgi-bin/add_to_cart.py?book_id=7");
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");

        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("10000");
        driver.findElement(By.cssSelector("[value=Update]")).click();

        String discountPercent = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[2]/td[5]/p/b")).getText();
        String discountDollar = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[2]/td[6]")).getText();
        String totalSum = driver.findElement(By.xpath(
                "//table/tbody/tr[6]/td/table/tbody/tr[2]/td[7]")).getText();

        softAssert.assertEquals(discountPercent, "8");
        softAssert.assertEquals(discountDollar, "8000");
        softAssert.assertEquals(totalSum, "92000");

        driver.quit();
        softAssert.assertAll();
    }
}
