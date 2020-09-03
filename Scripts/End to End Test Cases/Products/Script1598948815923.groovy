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

WebUI.callTestCase(findTestCase('End to End Test Cases/New Test Case'), [('Username') : 'parkjjaekjaek@gmail.com', ('Password') : 'Zura1zlita'], 
    FailureHandling.STOP_ON_FAILURE)

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

//Mobile.startExistingApplication('com.atf.ecommercelive_merchant')
Mobile.tap(findTestObject('MTouch/android.view.View productBtn'), 0)

Mobile.delay(5)

Mobile.tapAtPosition(2029, 175)

Mobile.delay(4)

Mobile.tapAtPosition(1072, 545)

Mobile.tapAtPosition(1162, 554, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3)

Mobile.tap(findTestObject('MTouch/android.widget.EditText - Product Name'), 0)

driver.getKeyboard().pressKey('test')

Mobile.switchToPortrait()

Mobile.tap(findTestObject('MTouch/android.widget.EditText - Product Description'), 0)

Mobile.switchToLandscape()

driver.getKeyboard().pressKey('test')

Mobile.tapAtPosition(304, 423.6)

WebUI.delay(2)

Mobile.tapAtPosition(323.8, 418.6)

driver.getKeyboard().sendKeys('23.90')

Mobile.delay(3)

Mobile.tapAtPosition(658, 448)

Mobile.tapAtPosition(354, 429)

driver.getKeyboard().sendKeys(Keys.BACK_SPACE)

driver.getKeyboard().sendKeys('1')

Mobile.delay(3)

Mobile.tapAtPosition(648, 652)

Mobile.delay(3)

Mobile.tapAtPosition(308, 472)

driver.getKeyboard().sendKeys(Keys.BACK_SPACE)

driver.getKeyboard().sendKeys('10')

Mobile.tap(findTestObject('MTouch/android.widget.Button - create Product'), 0)

