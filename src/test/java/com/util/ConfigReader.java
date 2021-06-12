/*
package com.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ConfigReader {

    private Properties prop;

    public Properties init_prop(){
        prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream("./src/test/java/com/config/config.properties");
            prop.load(fis);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return  prop;
    }

    */
/*public  void initialization(){
        String browserName = prop.getProperty("browser");
        if(browserName.equals("chrome")){
            WebDriverManager.chromedriver().setup();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();;
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));
    }*//*

}
*/
