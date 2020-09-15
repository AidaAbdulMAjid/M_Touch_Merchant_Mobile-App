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

//Mobile.startExistingApplication('com.atf.ecommercelive_merchant')
Mobile.startApplication('C:\\Users\\Unicorn\\Downloads/M-Touch Seller 1.0.10+3.apk', false)

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

Mobile.tapAtPosition(766, 1800)

Mobile.delay(5)

Mobile.tapAtPosition(228.8, 546.7)

driver.getKeyboard().sendKeys(email)

CustomKeywords.'myPack.Register.demoKey'(email, 'email')

Mobile.takeScreenshot(((((GlobalVariable.RegisterImagePath + 'email') + todaysDate) + '-') + nowTime) + '.png')

String emailImagePath = ((((GlobalVariable.RegisterImagePath + 'email') + todaysDate) + '-') + nowTime) +
'.png'

CustomKeywords.'myPack.Register.demoKey'(emailImagePath, 'email image path')

Mobile.tapAtPosition(349.8, 700.7)

driver.getKeyboard().sendKeys(name)

CustomKeywords.'myPack.Register.demoKey'(name, 'name')

Mobile.takeScreenshot(((((GlobalVariable.RegisterImagePath + 'name') + todaysDate) + '-') + nowTime) + '.png')

String nameImagePath = ((((GlobalVariable.RegisterImagePath + 'name') + todaysDate) + '-') + nowTime) +
'.png'

CustomKeywords.'myPack.Register.demoKey'(nameImagePath, 'name image path')

Mobile.tap(findTestObject('MTouch/android.widget.EditText - Register Mobile'), 0)

driver.getKeyboard().sendKeys(mobile)

CustomKeywords.'myPack.Register.demoKey'(mobile, 'mobile')

Mobile.takeScreenshot(((((GlobalVariable.RegisterImagePath + 'mobile') + todaysDate) + '-') + nowTime) + '.png')

String mobileImagePath = ((((GlobalVariable.RegisterImagePath + 'mobile') + todaysDate) + '-') + nowTime) +
'.png'

CustomKeywords.'myPack.Register.demoKey'(mobileImagePath, 'mobile image path')

Mobile.tap(findTestObject('MTouch/android.widget.EditText - Register Password'), 0)

driver.getKeyboard().sendKeys(password)

CustomKeywords.'myPack.Register.demoKey'(password, 'password')

Mobile.takeScreenshot(((((GlobalVariable.RegisterImagePath + 'password') + todaysDate) + '-') + nowTime) + '.png')

String passwordImagePath = ((((GlobalVariable.RegisterImagePath + 'password') + todaysDate) + '-') + nowTime) +
'.png'

CustomKeywords.'myPack.Register.demoKey'(passwordImagePath, 'password image path')

Mobile.tap(findTestObject('MTouch/android.widget.EditText - Register Confirm Password'), 0)

driver.getKeyboard().sendKeys(confirmPassword)

CustomKeywords.'myPack.Register.demoKey'(confirmPassword, 'confirm password')

Mobile.takeScreenshot(((((GlobalVariable.RegisterImagePath + 'confirm password') + todaysDate) + '-') + nowTime) + '.png')

String confirmPasswordImagePath = ((((GlobalVariable.RegisterImagePath + 'confirm password') + todaysDate) + '-') + nowTime) +
'.png'

CustomKeywords.'myPack.Register.demoKey'(confirmPasswordImagePath, 'confirm password')

Mobile.tap(findTestObject('MTouch/android.widget.Button Register'), 0)

CustomKeywords.'myPack.Register.demoKey'('Pass', 'result')

String RImagePath = ((((GlobalVariable.RegisterImagePath + 'Acknowledgement') + todaysDate) + '-') + nowTime) + '.png'

Mobile.takeScreenshot(((((GlobalVariable.RegisterImagePath + 'Acknowledgement') + todaysDate) + '-') + nowTime) + '.png')

CustomKeywords.'myPack.Register.demoKey'(RImagePath, 'result image path')


