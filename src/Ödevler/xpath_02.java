package Ödevler;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class xpath_02 extends BaseDriver {

    /*
            2- soru
            1) Bu siteye gidin. -> https://demo.applitools.com/
            2) Username kısmına "ttechno@gmail.com" girin.
            3) Password kısmına "techno123." girin.
            4) "Sign in" buttonunan tıklayınız.
            5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.
        */
    @Test
    public void test1(){

        // 1) Bu siteye gidin. -> https://demo.applitools.com/
        driver.get("https://demo.applitools.com/");
        MyFunc.Bekle(2);

        // 2) Username kısmına "ttechno@gmail.com" girin.
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ttechno@gmail.com");
        MyFunc.Bekle(2);

        // 3) Password kısmına "techno123." girin.
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("techno123.");
        MyFunc.Bekle(2);

        // 4) "Sign in" buttonunan tıklayınız.
        driver.findElement(By.xpath("//*[@id='log-in']")).click();
        MyFunc.Bekle(2);

        // 5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.
        WebElement Sonuc= driver.findElement(By.xpath("//*[@id='time']"));
        Assert.assertTrue("(Your nearest branch closes in: 30m 5s) yazisi bulunamadi",Sonuc.getText().contains("Your nearest branch closes in: 30m 5s"));;

        BekleKapat();


    }

}
