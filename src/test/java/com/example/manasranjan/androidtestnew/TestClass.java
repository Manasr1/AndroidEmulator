package com.example.manasranjan.androidtestnew;

/**
 * Created by Manas.Ranjan on 06-10-2017.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.URL;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Created by Manas.Ranjan on 06-10-2017.
 */

public class TestClass {

    AppiumDriver driver;

    @BeforeTest
    public void testCaseSetup()throws  Exception
    {

        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X API 25");// ANDROID Device
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "4000");
        cap.setCapability(MobileCapabilityType.APP, "C://Users//Manas.Ranjan//AppData//Local//Android//sdk//platform-tools//selendroid-test-app-0.17.0.apk");C://Users//Manas.Ranjan//AppData//Local//Android//sdk//platform-tools//selendroid-test-app-0.17.0.apk
    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

    }

    /*    @Test
        public void testnamewithcartextdisplayed()throws  Exception
        {

        // Tap on chrome icon


        //Insert your name using Keys  or SendKeys Method


        // Select the car option from the drop down by any of the option select by id - by value - by displayed text


        // click on the button send me your name


        // apply assertor verify to validate this



        }*/
    @AfterTest
    public void testCaseTearDown()
    {
        driver.quit();
    }
}




