package Ödevler;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;

public class Xpath_05 extends BaseDriver {

    /*
    Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]

Fake Alerts' tıklayınız.

Show Alert Box'a tıklayınız.

Ok'a tıklayınız.

Alert kapanmalıdır
     */

    @Test
    public void test1(){

        // 1- Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(2);

        // 2- Fake Alerts' tıklayınız.
        driver.findElement(By.xpath("//*[@id='fakealerttest']")).click();
        MyFunc.Bekle(2);


        // 3- Show Alert Box'a tıklayınız.
        driver.findElement(By.xpath("//input[@id='fakealert']")).click();
        MyFunc.Bekle(2);

        // 4- Ok'a tıklayınız. *(Alert kapanmalıdır)
        driver.findElement(By.xpath("//button[@id='dialog-ok']")).click();
        BekleKapat();



    }
}
