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

Mobile.delay(5)

TouchAction action = new TouchAction(driver)

Mobile.delay(3)

Mobile.tapAtPosition(931, 475)

Mobile.switchToPortrait()

Mobile.tap(findTestObject('MTouch/UpdateStream/UpdateStreamTitle'), 0)

Mobile.tapAndHoldAtPosition(248.8, 505.7, 3)

driver.getKeyboard().pressKey(title)

CustomKeywords.'myPack.UpdateStream.demoKey'(title, 'title')

Mobile.takeScreenshot(((((GlobalVariable.UpdateStreamImagePath + 'title') + todaysDate) + '-') + nowTime) + '.png')

String TitleImagePath = ((((GlobalVariable.UpdateStreamImagePath + 'title') + todaysDate) + '-') + nowTime) + '.png'

CustomKeywords.'myPack.UpdateStream.demoKey'(TitleImagePath, 'title image path')

Mobile.delay(2)

Mobile.tap(findTestObject('MTouch/UpdateStream/UpdateStreamDescription'), 0)

Mobile.tapAndHoldAtPosition(278.7, 721.7, 3)

Mobile.tapAtPosition(625.4, 609.7)

driver.getKeyboard().pressKey(description)

CustomKeywords.'myPack.UpdateStream.demoKey'(description, 'description')

Mobile.takeScreenshot(((((GlobalVariable.UpdateStreamImagePath + 'description') + todaysDate) + '-') + nowTime) + '.png')

String DescriptionImagePath = ((((GlobalVariable.UpdateStreamImagePath + 'description') + todaysDate) + '-') + nowTime) + 
'.png'

CustomKeywords.'myPack.UpdateStream.demoKey'(DescriptionImagePath, 'description image path')

Mobile.delay(2)

Mobile.tap(findTestObject('MTouch/UpdateStream/UpdateStreamDate'), 0)

String xx = driver.findElement(By.xpath('//*/android.view.View[1]/android.widget.SeekBar[1]')).getAttribute('content-desc')

while (xx != date) {
    Point value = null

    value = driver.findElement(By.xpath('//*/android.view.View[1]/android.widget.SeekBar[1]')).getLocation()

    int x = value.x

    int y = value.y

    int y1 = value.y + 120

    action.press(PointOption.point(x, y1)).waitAction(waitOptions(Duration.ofMillis(3000))).moveTo(PointOption.point(x, 
            y)).release().perform()

    xx = driver.findElement(By.xpath('//*/android.view.View[1]/android.widget.SeekBar[1]')).getAttribute('content-desc')
}

CustomKeywords.'myPack.UpdateStream.demoKey'(date, 'date')

Mobile.takeScreenshot(((((GlobalVariable.UpdateStreamImagePath + 'date') + todaysDate) + '-') + nowTime) + '.png')

String DateImagePath = ((((GlobalVariable.UpdateStreamImagePath + 'date') + todaysDate) + '-') + nowTime) + '.png'

CustomKeywords.'myPack.UpdateStream.demoKey'(DateImagePath, 'date image path')

String xy = driver.findElement(By.xpath('//*/android.view.View[1]/android.widget.SeekBar[2]')).getAttribute('content-desc')

while (xy != hour) {
    Point value = null

    value = driver.findElement(By.xpath('//*/android.view.View[1]/android.widget.SeekBar[2]')).getLocation()

    println(value)

    int x = value.x + 80

    int y = value.y + 200

    int y1 = value.y + 100

    action.press(PointOption.point(x, y)).waitAction(waitOptions(Duration.ofMillis(3000))).moveTo(PointOption.point(x, y1)).release().perform()

    xy = driver.findElement(By.xpath('//*/android.view.View[1]/android.widget.SeekBar[2]')).getAttribute('content-desc')
}

CustomKeywords.'myPack.UpdateStream.demoKey'(hour, 'hour')

Mobile.takeScreenshot(((((GlobalVariable.UpdateStreamImagePath + 'hour') + todaysDate) + '-') + nowTime) + '.png')

String HourImagePath = ((((GlobalVariable.UpdateStreamImagePath + 'hour') + todaysDate) + '-') + nowTime) + '.png'

CustomKeywords.'myPack.UpdateStream.demoKey'(HourImagePath, 'hour image path')

String xz = driver.findElement(By.xpath('//*/android.view.View[1]/android.widget.SeekBar[3]')).getAttribute('content-desc')

while (xz != minute) {
    Point value = null

    value = driver.findElement(By.xpath('//*/android.view.View[1]/android.widget.SeekBar[3]')).getLocation()

    println(value)

    int x = value.x + 80

    int y = value.y + 200

    int y1 = value.y + 100

    action.press(PointOption.point(x, y)).waitAction(waitOptions(Duration.ofMillis(3000))).moveTo(PointOption.point(x, y1)).release().perform()

    xz = driver.findElement(By.xpath('//*/android.view.View[1]/android.widget.SeekBar[3]')).getAttribute('content-desc')
}

CustomKeywords.'myPack.UpdateStream.demoKey'(minute, 'minute')

Mobile.takeScreenshot(((((GlobalVariable.UpdateStreamImagePath + 'minute') + todaysDate) + '-') + nowTime) + '.png')

String MinuteImagePath = ((((GlobalVariable.UpdateStreamImagePath + 'minute') + todaysDate) + '-') + nowTime) + '.png'

CustomKeywords.'myPack.UpdateStream.demoKey'(MinuteImagePath, 'minute image path')

Mobile.tapAtPosition(959, 1518)

driver.pressKeyCode(66)

Mobile.tap(findTestObject('MTouch/UpdateStream/UpdateStreamButton'), 0)

CustomKeywords.'myPack.UpdateStream.demoKey'('Pass', 'result')

String RImagePath = ((((GlobalVariable.UpdateStreamImagePath + 'Acknowledgement') + todaysDate) + '-') + nowTime) + '.png'

Mobile.takeScreenshot(((((GlobalVariable.UpdateStreamImagePath + 'Acknowledgement') + todaysDate) + '-') + nowTime) + '.png')

CustomKeywords.'myPack.UpdateStream.demoKey'(RImagePath, 'result image path')

