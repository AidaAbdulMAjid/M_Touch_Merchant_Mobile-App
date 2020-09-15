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
import org.openqa.selenium.Keys as Keys
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.MobileElement as MobileElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import org.openqa.selenium.remote.DesiredCapabilities as DesiredCapabilities
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import io.appium.java_client.android.nativekey.KeyEventFlag as KeyEventFlag
import org.openqa.selenium.Point as Point
import io.appium.java_client.MultiTouchAction as MultiTouchAction
import io.appium.java_client.TouchAction as TouchAction
import io.appium.java_client.touch.WaitOptions as WaitOptions
import io.appium.java_client.touch.offset.PointOption as PointOption
import org.openqa.selenium.WebElement as WebElement
import io.appium.java_client.MobileBy as MobileBy
import java.time.Duration as Duration
import static io.appium.java_client.touch.LongPressOptions.longPressOptions
import static io.appium.java_client.touch.TapOptions.tapOptions
import static io.appium.java_client.touch.WaitOptions.waitOptions
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import java.net.URL as URL
import org.apache.commons.io.FileUtils as FileUtils

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')


WebUI.callTestCase(findTestCase('End to End Test Cases/New Test Case'), [('Username') : 'parkjjaekjaek@gmail.com', ('Password') : 'Zura1zlita'], 
    FailureHandling.STOP_ON_FAILURE)

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

//Mobile.startExistingApplication('com.atf.ecommercelive_merchant')
Mobile.tap(findTestObject('MTouch/icon product'), 0)

Mobile.delay(5)

Mobile.tapAtPosition(2029, 175)

Mobile.delay(4)

Mobile.tapAtPosition(1072, 545)

Mobile.tapAtPosition(1162, 554, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3)

Mobile.tap(findTestObject('MTouch/android.widget.EditText - Product Name'), 0)

driver.getKeyboard().pressKey(name)

CustomKeywords.'myPack.Product.demoKey'(name, 'name')

Mobile.takeScreenshot(((((GlobalVariable.ProductImagePath + 'name') + todaysDate) + '-') + nowTime) + '.png')

String NameImagePath = ((((GlobalVariable.ProductImagePath + 'name') + todaysDate) + '-') + nowTime) + '.png'

CustomKeywords.'myPack.Product.demoKey'(NameImagePath, 'name image path')

Mobile.switchToPortrait()

Mobile.tap(findTestObject('MTouch/android.widget.EditText - Product Description'), 0)

Mobile.switchToLandscape()

driver.getKeyboard().pressKey(description)

CustomKeywords.'myPack.Product.demoKey'(description, 'description')

Mobile.takeScreenshot(((((GlobalVariable.ProductImagePath + 'description') + todaysDate) + '-') + nowTime) + '.png')

String DescImagePath = ((((GlobalVariable.ProductImagePath + 'description') + todaysDate) + '-') + nowTime) + '.png'

CustomKeywords.'myPack.Product.demoKey'(DescImagePath, 'description image path')

Mobile.tapAtPosition(304, 423.6)

WebUI.delay(2)

Mobile.tapAtPosition(323.8, 418.6)

driver.getKeyboard().sendKeys(price)

CustomKeywords.'myPack.Product.demoKey'(price, 'price')

Mobile.takeScreenshot(((((GlobalVariable.ProductImagePath + 'price') + todaysDate) + '-') + nowTime) + '.png')

String PriceImagePath = ((((GlobalVariable.ProductImagePath + 'price') + todaysDate) + '-') + nowTime) + '.png'

CustomKeywords.'myPack.Product.demoKey'(PriceImagePath, 'price image path')


Mobile.delay(3)

Mobile.tapAtPosition(658, 448)

Mobile.tapAtPosition(354, 429)

driver.getKeyboard().sendKeys(Keys.BACK_SPACE)

driver.getKeyboard().sendKeys(minOrder)

CustomKeywords.'myPack.Product.demoKey'(minOrder, 'minOrder')

Mobile.takeScreenshot(((((GlobalVariable.ProductImagePath + 'minOrder') + todaysDate) + '-') + nowTime) + '.png')

String minOrderImagePath = ((((GlobalVariable.ProductImagePath + 'minOrder') + todaysDate) + '-') + nowTime) + '.png'

CustomKeywords.'myPack.Product.demoKey'(minOrderImagePath, 'minOrder image path')

Mobile.delay(3)

Mobile.tapAtPosition(648, 652)

Mobile.delay(3)

Mobile.tapAtPosition(308, 472)

driver.getKeyboard().sendKeys(Keys.BACK_SPACE)

driver.getKeyboard().sendKeys(avaibility)

CustomKeywords.'myPack.Product.demoKey'(avaibility, 'avaibility')

Mobile.takeScreenshot(((((GlobalVariable.ProductImagePath + 'avaibility') + todaysDate) + '-') + nowTime) + '.png')

String avaibilityImagePath = ((((GlobalVariable.ProductImagePath + 'avaibility') + todaysDate) + '-') + nowTime) + '.png'

CustomKeywords.'myPack.Product.demoKey'(avaibilityImagePath, 'avaibility image path')


Mobile.tap(findTestObject('MTouch/android.widget.Button - create Product'), 0)

CustomKeywords.'myPack.Product.demoKey'('Pass', 'result')

String RImagePath = ((((GlobalVariable.ProductImagePath + 'Acknowledgement') + todaysDate) + '-') + nowTime) + '.png'

Mobile.takeScreenshot(((((GlobalVariable.ProductImagePath + 'Acknowledgement') + todaysDate) + '-') + nowTime) + '.png')

CustomKeywords.'myPack.Product.demoKey'(RImagePath, 'result image path')

