package Ödevler;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class xpath_01 extends BaseDriver {

    /*
     * Aşağıdaki testlerde aranan elamanın kendi id veya name ini kullanmadan SADECE XPATH yardımı ile
     * gerekiyorsa Child ve kardeş yolu ile bularak testleri yapınız.
     *
     * 1-soru
     *
     *   1) Bu siteye gidin. -> http://demoqa.com/text-box
     *
     *   2) Full Name kısmına "Automation" girin.
     *
     *   3) Email kısmına "Testing@gmail.com" girin.
     *
     *   4) Current Address kısmına "Testing Current Address" girin.
     *
     *   5) Permanent Address kısmına "Testing Permanent Address" girin.
     *
     *   6) Submit butonuna tıklayınız.
     *
     *   7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
     *
     *   8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.
     */

    @Test
    public void test1(){

        // 1- Bu siteye gidin. -> http://demoqa.com/text-box
        driver.get("http://demoqa.com/text-box");
        MyFunc.Bekle(2);

        // 2- Full Name kısmına "Automation" girin.
        WebElement fullName= driver.findElement(By.xpath("//*[@id='userName']"));
        fullName.sendKeys("Automation");
        MyFunc.Bekle(2);

        // 3- Email kısmına "Testing@gmail.com" girin
        WebElement eMail= driver.findElement(By.xpath("//*[@id='userEmail']"));
        eMail.sendKeys("Testing@gmail.com");
        MyFunc.Bekle(2);

        // 4- Current Address kısmına "Testing Current Address" girin.
        WebElement currentAddress= driver.findElement(By.xpath("//*[@id='currentAddress']"));
        currentAddress.sendKeys("Testing Current Address");
        MyFunc.Bekle(2);

        // 5- Permanent Address kısmına "Testing Permanent Address" girin.
        WebElement PermanentAddress= driver.findElement(By.xpath("//*[@id='permanentAddress']"));
        PermanentAddress.sendKeys("Testing Permanent Address");
        MyFunc.Bekle(2);

        // 6- Submit butonuna tıklayınız.
        WebElement SubmitButonuna= driver.findElement(By.xpath("//button[@id='submit']"));
        SubmitButonuna.click();
        // veya boyle: driver.findElement(By.xpath("//button[@id='submit']")).click();
        MyFunc.Bekle(2);

        // 7- Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
        WebElement sonuc= driver.findElement(By.xpath("//p[@id='name']"));
        Assert.assertTrue("Automation kelimesi bulunamadı", sonuc.getText().contains("Automation"));
        MyFunc.Bekle(2);

        // 8- Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.
        WebElement sonuc1= driver.findElement(By.xpath("//p[@id='email']"));
        Assert.assertTrue("Testing kelimesi bulunamadı", sonuc1.getText().contains("Testing"));
        BekleKapat();
    }

}
