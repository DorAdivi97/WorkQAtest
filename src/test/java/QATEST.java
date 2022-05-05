import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class QATEST {

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
//       System.setProperty("webdriver.chrom.driver.driver","resources/chromdriver.exe");
    }

    @Test                                                    //  1  טסט זה משתמש בקוד לבדיקת להעלת האתר
    public void OpenBrowser() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.get(K.ACE);
        Thread.sleep(3000);
        driver.quit();
    }



    @Test                                               //         פתיחת קטגוריות לחיצה על שם <תגית> פותחת ריהוט  2
    public void Addpick() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(K.ACE);
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        WebElement CornerBTN = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.CATEGORIES)));
        WebElement pIcUPbTn = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.VOVO)));
        WebElement BTN = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.DDDD)));
        CornerBTN.click();
        Thread.sleep(3000);
        pIcUPbTn.click();
        Thread.sleep(3000);
        BTN.click();
        Thread.sleep(3000);
        driver.quit();


    }


    @Test
    //  3 טסט זה משתמש בקוד להגיע לדף הראשי ולאחר מכן לחיצה על כפתור סניפים להצגת הסניפים

    public void clickBranches() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(K.ACE);
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement storsBtn = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.BRANCHES)));
        storsBtn.click();
        Thread.sleep(5000);
        driver.quit();
    }



    @Test //קוד זה מגיע לאתר אייס לסניפים ופותח את האינפורמציה לאיסוף עצמי 4
    public void StoreInfo() throws InterruptedException {
//        System.setProperty(K.Chrome[0], K.Chrome[1]);
        WebDriver driver = new ChromeDriver();
        driver.get(K.STORES);
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement expended = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"ui-id-1\"]")));
        expended.click();
        Thread.sleep(5000);
        driver.quit();

       }


    @Test // פקודה זו מובילה לאתר ACE ופותחת את ההתחברות לרישום5
    public void signin() throws InterruptedException {
//            System.setProperty(K.Chrome[0], K.Chrome[1]);
        WebDriver driver = new ChromeDriver();
        driver.get(K.ACE);
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement enterBtn = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"loginSection\"]/a")));
        enterBtn.click();
        Thread.sleep(5000);
        driver.quit();
    }


    @Test //  פקודה זו מובילה לאתר ACE ופותחת את ההתחברות לרישום ובלחיצה על התחברות מופיעות שגיאות 6
    public void enterLog() throws InterruptedException {
//        System.setProperty(K.Chrome[0], K.Chrome[1]);
        WebDriver driver = new ChromeDriver();
        driver.get(K.ACE);
//            Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement enterBtn = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"loginSection\"]/a")));
        enterBtn.click();
        WebElement Button = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"loginModal\"]/div/div/div/div/div[1]/button")));
        Thread.sleep(5000);
        Button.click();
        Thread.sleep(5000);
        driver.quit();

    }


    @Test  //  טסט זה באמצעות הקוד פותח את האתר ממלא את הפרטים ונכנס לאתר 7
    public void loginUser() throws InterruptedException {
//        System.setProperty(K.Chrome[0], K.Chrome[1]);
        WebDriver driver = new ChromeDriver();
        driver.get(K.ACE);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));
        WebElement enterBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.ENTERBTN)));
        WebElement logidFiled = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(K.LOGINID1)));
        WebElement passwordFiled = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.PASSWORDID)));
        WebElement loginBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.LOGINBTN)));
        enterBtn.click();
        Thread.sleep(5000);
        logidFiled.sendKeys(K.USERNAME3);
        Thread.sleep(4000);
        passwordFiled.sendKeys(K.PASSWORD);
        Thread.sleep(5000);
        loginBtn.click();
        Thread.sleep(20000);
        driver.quit();


        

    }


    @Test //  טסט זה משתמש בקוד כדי להרשם ומקבל הודעת שגיאה מייל לא תקין 8
    public void wrongloginuser() throws InterruptedException {
//        System.setProperty(K.Chrome[0], K.Chrome[1]);
        WebDriver driver = new ChromeDriver();
        driver.get(K.ACE);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));
        WebElement enterBTN = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.ENTERBTN)));
        WebElement log  = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id(K.LOGINID)));
        WebElement paAsword = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.INPUT)));
        WebElement logBTN = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.BUTTON)));
        enterBTN.click();
        Thread.sleep(5000);
        log.sendKeys(K.USERNAME1);
        Thread.sleep(5000);
        paAsword.sendKeys(K.PASSWORD1);
        Thread.sleep(4000);
        logBTN.click();
        Thread.sleep(4000);
        driver.quit();


    }


    @Test // טסט זה בודק התאמה לטקסט בפרטיות ואבטחה טקסט תקין 9
    public void aceTest() throws InterruptedException {
//        System.setProperty(K.Chrome[0], K.Chrome[1]);
        WebDriver driver = new ChromeDriver();
        driver.get(K.ACE1);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement paragraph = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(K.ACEPARGRAPHCSS)));
        String WordText = paragraph.getText();
        Assert.assertEquals(K.ACEPARGRAPHTEXT,WordText);
        Thread.sleep(3000);
        driver.quit();

    }


    @Test // טסט זה בודק התאמה לטקסט בפרטיות ואבטחה טסט זה לא תואם לטקסט לכן נכשל 10
    public void aceTest1(){
//        System.setProperty(K.Chrome[0], K.Chrome[1]);
        WebDriver driver = new ChromeDriver();
        driver.get(K.ACE1);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement paragraph = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(K.ACEPARGRAPHCSS)));
        String WordText = paragraph.getText();
        Assert.assertEquals(K.ACEPARGRAPHTEXT1,WordText);
        driver.quit();

    }



    @Test //טסט זה משתמש בקוד כדי למלא בשורת החיפוש ולחיצה אוטומטית על חיפוש והצגת המוצר 11
    public void inputText() throws InterruptedException {
//        System.setProperty(K.Chrome[0], K.Chrome[1]);
        WebDriver driver = new ChromeDriver();
        driver.get(K.ACE);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement SearchInput = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(" //*[@id=\"search\"]")));
        WebElement Bottom = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"search_mini_form\"]/div/button")));
        SearchInput.sendKeys(K.INLINE);
        Bottom.click();
        Thread.sleep(5000);
        driver.quit();
    }



    @Test// פקודה זו מגדילה את החלון 12
    public void extendBrowser() throws InterruptedException {
//        System.setProperty(K.Chrome[0], K.Chrome[1]);
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.get(K.ACE);
        driver.manage().window().fullscreen();
        Thread.sleep(5000);
        driver.quit();

    }



    @Test // טסט זה מכניס   משתמשים לפי סדר בצורה אוטמיטית 13
    public void loginUsers() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        for (int i = 0; i <K.USERSNAMEARR.length ; i++) {
            driver.get(K.ACE);
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
            WebElement LOGINBTN = wait
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.BTNID)));
            WebElement loginfield =wait
                    .until(ExpectedConditions.presenceOfElementLocated(By.id(K.LOGINID)));
            WebElement passwordfiled = wait
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.INPUT)));
            WebElement SIGIN = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.SIGINBUTTON)));
            LOGINBTN.click();
            Thread.sleep(5000);
            loginfield.sendKeys(K.USERSNAMEARR[i]);
            Thread.sleep(6000);
            passwordfiled.sendKeys(K.PASSWORD3);
            Thread.sleep(5000);
            SIGIN.click();


        }
        Thread.sleep(5000);
        driver.quit();
    }



    @Test //   טסט זה על ידי לחיצה על באנר אייס מרענן את הדף הבית 14
    public void supremekeys() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(K.ACE);
        WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(4));
        WebElement hometab =wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.ICON)));
        hometab.click();
        Thread.sleep(4000);
        driver.quit();
    }


    @Test //  מעביר אותנו לדף למוצרי רכב 15
    public void tabtwo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(K.ACE);
        WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(4));
        WebElement hometab =wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.AUTODEPO)));
        hometab.click();
        Thread.sleep(7000);
        driver.quit();

    }
    @Test  // מעביר אותנו לדף של שירות לקוחות Test 16
    public void fourtab() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(K.ACE);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        WebElement hometab = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.CUSTOMERS)));
        hometab.click();
        Thread.sleep(4000);
        driver.quit();



    }

    @Test //פתיחת הרשמה לאתר אייס 17
    public void register() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(K.ACE);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement BTN1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.RegisterBTN)));
        WebElement BTN2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.REGISTRATION)));
        BTN1.click();
        Thread.sleep(5000);
        BTN2.click();
        Thread.sleep(5000);
        driver.quit();
    }
    @Test // לחיצה על ההזמנות שלי במידה ואין משתמש יפתח חלון להתחברות לאתר או לכניסה
    public void fivetab() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(K.ACE);
        WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(4));
        WebElement hometab =wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(K.MYORDERS)));
        hometab.click();
        Thread.sleep(5000);
        driver.quit();
    }


    }








