import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CallBackTest {

        private WebDriver driver;

        @BeforeAll
        static void setUpAll(){
            System.setProperty("webdriver.chrome.driver","driver\\chromedriver-win64\\chromedriver.exe" );
        }

        @BeforeEach
    void setUp(){driver = new ChromeDriver();}

    @AfterEach
    void tearDown() {
            driver.quit();
            driver = null;
    }
    @Test
    void  shouldTestSomething() throws InterruptedException {
            driver.get("http://localhost:9999/");
           // WebElement form = driver.findElement(By.cssSelector("[data-test-id=callback-form]"));
        List<WebElement> elements = driver.findElements(By.className("input__control"));
        elements.get(0).sendKeys("Ewan");
        elements.get(1).sendKeys("+79545465465");
        /*
        form.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Ewan");
            form.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79545465465");

         */
        /*
             form.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        form.findElement(By.cssSelector("[data-test-id=submit]")).click();

         */
        driver.findElement(By.className("checkbox__box")).click();
        driver.findElement(By.className("button")).click();


        String text = driver.findElement(By.className("alert-success")).getText();
        assertEquals("Ваша заявка успешно отправлена!", text.trim());
        Thread.sleep(500);
        //загрузить страницу
        //поиск элементов
        //взаимодействие с элементами

    }

}
