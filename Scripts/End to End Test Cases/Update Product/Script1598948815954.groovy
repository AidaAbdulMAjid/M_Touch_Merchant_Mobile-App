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

Mobile.tap(findTestObject('MTouch/android.view.View productBtn'), 0)

Mobile.delay(5)

Mobile.tapAtPosition(1420, 694)

Mobile.delay(5)

Mobile.switchToPortrait()

Mobile.tapAtPosition(550.5, 1268.5)

Mobile.tapAtPosition(289.7, 499.7)

Mobile.delay(3)

//Mobile.tap(findTestObject('MTouch/android.widget.EditText - update Product Name'), 0)

Mobile.tapAtPosition(329.7, 1800)

Mobile.delay(3)

Mobile.switchToLandscape()

Mobile.tapAndHoldAtPosition(180.8, 250.8, 3)

driver.getKeyboard().sendKeys('herbanika')

Mobile.tapAtPosition(444, 421)

Mobile.tapAndHoldAtPosition(136.8, 154.8, 3)

driver.getKeyboard().sendKeys('refreshing breath, sinusitis, nasal congestion')

Mobile.tapAtPosition(605, 404)

Mobile.tapAndHoldAtPosition(157.8, 159.8, 3)

driver.getKeyboard().sendKeys('5.90')

Mobile.tapAtPosition(167.8, 392.5)

driver.getKeyboard().sendKeys(Keys.BACK_SPACE)

driver.getKeyboard().sendKeys('2')

Mobile.tapAndHoldAtPosition(166.8, 512.5, 3)

driver.getKeyboard().sendKeys('100')

Mobile.tap(findTestObject('MTouch/android.widget.Button - update status'), 0)

Mobile.tap(findTestObject('MTouch/android.view.View update disable'), 0)

Mobile.switchToPortrait()

Mobile.tap(findTestObject('MTouch/android.widget.Button - update'), 0)
