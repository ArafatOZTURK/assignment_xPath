package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver;

    // public static void DriverBaslat(){  bu metod ilk calistigi icin asagidaki gibi yapabiliriz
     static {   // bunun şartı extend olması ve başta olması
        driver= new ChromeDriver();

        // driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti

    }


    public static void BekleKapat(){

        MyFunc.Bekle(3);
        driver.quit();
    }







}
