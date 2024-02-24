package Ödevler;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class xpath_04 extends BaseDriver {
    /***
     Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]

     Calculate'e tıklayınız.

     İlk input'a herhangi bir sayı giriniz.

     İkinci input'a herhangi bir sayı giriniz.

     Calculate button'una tıklayınız.

     Sonucu alınız.

     Sonucu yazdırınız.
     */



    @Test
    public void test1(){
        // 1- Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(2);

        // 2- Calculate'e tıklayınız.
        driver.findElement(By.xpath("//*[@id='calculatetest']")).click();
        MyFunc.Bekle(2);
        // 3- İlk input'a herhangi bir sayı giriniz.
        driver.findElement(By.xpath("//input[@id='number1']")).sendKeys("15");
        MyFunc.Bekle(2);

        // 4-  İkinci input'a herhangi bir sayı giriniz.
        driver.findElement(By.xpath("//input[@id='number2']")).sendKeys("4");
        MyFunc.Bekle(2);

        // 5-    Calculate button'una tıklayınız.
        driver.findElement(By.xpath("//input[@value='Calculate']")).click();
        MyFunc.Bekle(2);

        //  6-   Sonucu alınız ve yazdırınız
        WebElement sonuc= driver.findElement(By.xpath("//*[@id='answer']"));
        sonuc.getText();
        System.out.println("sonuc.getText() = " + sonuc.getText());

        BekleKapat();







    }
}
