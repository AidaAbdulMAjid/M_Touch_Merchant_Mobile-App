import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.MobileElement as MobileElement
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.MultiTouchAction as MultiTouchAction
import io.appium.java_client.TouchAction as TouchAction
import io.appium.java_client.touch.WaitOptions as WaitOptions
import io.appium.java_client.touch.offset.PointOption as PointOption
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import io.appium.java_client.android.AndroidDriver as AndroidDriver

//Mobile.startExistingApplication('com.atf.ecommercelive_merchant')
Mobile.startApplication('C:\\Users\\Unicorn\\Downloads/M-Touch Seller 1.0.10+3.apk', false)

Mobile.switchToLandscape()

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

Mobile.delay(4)

MobileElement el1 = ((driver.findElement(By.xpath('//*[contains(@text, \'Email\')]'))) as MobileElement)

println(el1.getText())

if (el1.getText() != 'parkjjaekjaek@gmail.com, Email') {
    el1.click()

    driver.getKeyboard().pressKey(Username)

    Mobile.hideKeyboard()
}

CustomKeywords.'myPack.WriteToExcel.demoKey'('Email', 'Credential1')

CustomKeywords.'myPack.WriteToExcel.demoKey'(el1.getText(), 'Credential2')

CustomKeywords.'myPack.WriteToExcel.demoKey'('Pass', 'Credential3')

MobileElement el2 = ((driver.findElement(By.xpath('//*[contains(@text, \'Password\')]'))) as MobileElement)

el2.click()

Mobile.delay(5)

Mobile.hideKeyboard()

driver.getKeyboard().pressKey('Zura1zlita')

CustomKeywords.'myPack.WriteToExcel.demoKey'('Password', 'Credential1')

CustomKeywords.'myPack.WriteToExcel.demoKey'(Password, 'Credential2')

CustomKeywords.'myPack.WriteToExcel.demoKey'('Pass', 'Credential3')

Mobile.swipe(468, 484, 1380, 149)

Mobile.tap(findTestObject('MTouch/android.widget.Button Sign In'), 0)

