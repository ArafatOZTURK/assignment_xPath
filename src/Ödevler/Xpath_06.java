package Ödevler;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;

public class Xpath_06 extends BaseDriver {


    /*
    Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html

Fake Alerts'e tıklayınız.

Show modal dialog buttonuna tıklayınız.

Ok'a tıklayınız.

Alert kapanmalıdır.
     */
    @Test
    public void test1(){
        // 1- Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(2);

        // 2- Fake Alerts'e tıklayınız.
        driver.findElement(By.xpath("//*[@id='fakealerttest']")).click();
        MyFunc.Bekle(2);

        // 3- Show modal dialog buttonuna tıklayınız.
        driver.findElement(By.xpath("//input[@id='modaldialog']")).click();
        MyFunc.Bekle(2);

        // 4- Ok'a tıklayınız.(Alert kapanmalıdır.)
        driver.findElement(By.xpath("//button[@id='dialog-ok']")).click();
        BekleKapat();


        // org.seleniumhq.selenium:selenium-java:4.11.0
        // org.slf4j:slf4j-nop:1.7.30
    }
}
