import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class FormSubmit {
    private WebDriver driver;

    @BeforeClass
    public void setUp() throws InterruptedException {
        // WebDriver'ı yapılandırma
        System.setProperty("webdriver.chrome.driver", "C:/Users/BEYZA TUNA/Downloads/selenium/ChromeDriver/chromedriver.exe");
        Thread.sleep(5000);
        driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/samplepagetest/");
        Thread.sleep(5000);
        driver.manage().window().maximize();
    }

    @Test
    public void testFileUpload() throws InterruptedException {


        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='file-553']")).sendKeys("C:\\Users\\BEYZA TUNA\\OneDrive\\Resimler\\BeyzaTuna.JPG");

    }

    @Test
    public void testFillTheTextBoxes() throws InterruptedException {
        Thread.sleep(2000);
        WebElement textBox1 = driver.findElement(By.xpath("//input[@id='g2599-name']"));
        textBox1.sendKeys("Beyza");

        WebElement textBox2 = driver.findElement(By.xpath("//input[@id='g2599-email']"));
        textBox2.sendKeys("beyza.tuna100@gmail.com");

        WebElement textBox3 = driver.findElement(By.xpath("//input[@id='g2599-website']"));
        textBox3.sendKeys("www.salptech.com");
    }

    @Test
    public void testDropdownMenu() throws InterruptedException {
        Thread.sleep(1000);
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='g2599-experienceinyears']"));
        Select select = new Select(dropdown);
        Thread.sleep(1000);
        select.selectByValue("0-1");
    }

    @Test
    public void testChecboxButton() {
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='Functional Testing']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@value='Automation Testing']"));
        WebElement checkbox3 = driver.findElement(By.xpath("//input[@value='Manual Testing']"));

        checkbox1.click();
        checkbox2.click();
        checkbox3.click();
    }

    @Test
    public void testRadioButton() {

        WebElement radio1 = driver.findElement(By.xpath("//input[@value='Graduate']"));
        radio1.click();
    }

    @Test
    public void comment() {
        WebElement textarea = driver.findElement(By.xpath("//textarea[@id='contact-form-comment-g2599-comment']"));
        textarea.sendKeys("Hello world.");

    }

    @Test
    public void submit() {
        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
        submit.click();
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
