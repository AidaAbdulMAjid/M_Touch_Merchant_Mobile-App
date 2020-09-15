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

Mobile.tap(findTestObject('MTouch/icon product'), 0)

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

driver.getKeyboard().sendKeys(name)

CustomKeywords.'myPack.UpdateProduct.demoKey'(name, 'name')

Mobile.takeScreenshot(((((GlobalVariable.UpdateProductImagePath + 'name') + todaysDate) + '-') + nowTime) + '.png')

String nameImagePath = ((((GlobalVariable.UpdateProductImagePath + 'name') + todaysDate) + '-') + nowTime) +
'.png'

CustomKeywords.'myPack.UpdateProduct.demoKey'(nameImagePath, 'name image path')

Mobile.tapAtPosition(444, 421)

Mobile.tapAndHoldAtPosition(136.8, 348.8, 3)

driver.getKeyboard().sendKeys(description)

CustomKeywords.'myPack.UpdateProduct.demoKey'(description, 'description')

Mobile.takeScreenshot(((((GlobalVariable.UpdateProductImagePath + 'description') + todaysDate) + '-') + nowTime) + '.png')

String descriptionImagePath = ((((GlobalVariable.UpdateProductImagePath + 'description') + todaysDate) + '-') + nowTime) +
'.png'

CustomKeywords.'myPack.UpdateProduct.demoKey'(descriptionImagePath, 'description image path')

Mobile.tapAtPosition(605, 404)

Mobile.tapAndHoldAtPosition(157.8, 350.8, 3)

driver.getKeyboard().sendKeys(price)

CustomKeywords.'myPack.UpdateProduct.demoKey'(price, 'price')

Mobile.takeScreenshot(((((GlobalVariable.UpdateProductImagePath + 'price') + todaysDate) + '-') + nowTime) + '.png')

String priceImagePath = ((((GlobalVariable.UpdateProductImagePath + 'price') + todaysDate) + '-') + nowTime) +
'.png'

CustomKeywords.'myPack.UpdateProduct.demoKey'(priceImagePath, 'price image path')

Mobile.tapAtPosition(146.8, 385.5)

Mobile.delay(2)

driver.getKeyboard().sendKeys(Keys.BACK_SPACE)

driver.getKeyboard().sendKeys(minOrder)

CustomKeywords.'myPack.UpdateProduct.demoKey'(minOrder, 'minOrder')

Mobile.takeScreenshot(((((GlobalVariable.UpdateProductImagePath + 'minOrder') + todaysDate) + '-') + nowTime) + '.png')

String minOrderImagePath = ((((GlobalVariable.UpdateProductImagePath + 'minOrder') + todaysDate) + '-') + nowTime) +
'.png'

CustomKeywords.'myPack.UpdateProduct.demoKey'(minOrderImagePath, 'minOrder image path')


Mobile.tapAndHoldAtPosition(166.8, 512.5, 3)

driver.getKeyboard().sendKeys(inventory)

CustomKeywords.'myPack.UpdateProduct.demoKey'(inventory, 'inventory')

Mobile.takeScreenshot(((((GlobalVariable.UpdateProductImagePath + 'inventory') + todaysDate) + '-') + nowTime) + '.png')

String inventoryImagePath = ((((GlobalVariable.UpdateProductImagePath + 'inventory') + todaysDate) + '-') + nowTime) +
'.png'

CustomKeywords.'myPack.UpdateProduct.demoKey'(inventoryImagePath, 'inventory image path')

Mobile.tap(findTestObject('MTouch/android.widget.Button - update status'), 0)

Mobile.tap(findTestObject('MTouch/android.view.View update disable'), 0)

Mobile.switchToPortrait()

Mobile.tap(findTestObject('MTouch/android.widget.Button - update'), 0)

CustomKeywords.'myPack.UpdateProduct.demoKey'('Pass', 'result')

String RImagePath = ((((GlobalVariable.UpdateProductImagePath + 'Acknowledgement') + todaysDate) + '-') + nowTime) + '.png'

Mobile.takeScreenshot(((((GlobalVariable.UpdateProductImagePath + 'Acknowledgement') + todaysDate) + '-') + nowTime) + '.png')

CustomKeywords.'myPack.UpdateProduct.demoKey'(RImagePath, 'result image path')