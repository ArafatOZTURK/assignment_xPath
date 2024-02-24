package Ödevler;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class xpath_03 extends BaseDriver {

/*
    1) Bu siteye gidin. -> https://www.snapdeal.com/
    2) "teddy bear" aratın ve Search butonuna tıklayın.
    3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
    Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.
 */
    @Test
    public void test1(){
        // 1) Bu siteye gidin. -> https://www.snapdeal.com/
        driver.get("https://www.snapdeal.com/");
        MyFunc.Bekle(2);

        // 2) "teddy bear" aratın ve Search butonuna tıklayın.
        driver.findElement(By.xpath("//*[@id='inputValEnter']")).sendKeys("teddy bear");
        driver.findElement(By.xpath("//*[@class='searchTextSpan']")).click();
        MyFunc.Bekle(2);

        //  3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
        //    Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.
        WebElement sonuc= driver.findElement(By.xpath("//span[@style='color: #212121; font-weight: normal']"));
        Assert.assertTrue("(We've got 308 results for 'teddy bear') yazısı görünemedi",sonuc.getText().contains("We've got 308 results for teddy bear"));
        BekleKapat();






    }






}
