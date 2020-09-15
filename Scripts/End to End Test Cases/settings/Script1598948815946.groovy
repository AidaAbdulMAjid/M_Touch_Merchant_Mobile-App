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

Date today = new Date()

String todaysDate = today.format('MM_dd_yy')

String nowTime = today.format('hh_mm_ss')


WebUI.callTestCase(findTestCase('End to End Test Cases/New Test Case'), [('Username') : 'parkjjaekjaek@gmail.com', ('Password') : 'Zura1zlita'], 
    FailureHandling.STOP_ON_FAILURE)

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

Mobile.delay(5)

Mobile.tap(findTestObject('MTouch/icon settings'), 0)

Mobile.switchToPortrait()

Mobile.tapAtPosition(289.7, 499.7)

Mobile.tapAndHoldAtPosition(259.7, 1108.5, 3)

driver.getKeyboard().sendKeys(mobile)

CustomKeywords.'myPack.Settings.demoKey'(mobile, 'mobile')

Mobile.takeScreenshot(((((GlobalVariable.SettingImagePath + 'mobile') + todaysDate) + '-') + nowTime) + '.png')

String mobileImagePath = ((((GlobalVariable.SettingImagePath + 'mobile') + todaysDate) + '-') + nowTime) +
'.png'

CustomKeywords.'myPack.Settings.demoKey'(mobileImagePath, 'mobile image path')

Mobile.tapAndHoldAtPosition(222.8, 1439.5, 3)

driver.getKeyboard().sendKeys(name)

CustomKeywords.'myPack.Settings.demoKey'(name, 'name')

Mobile.takeScreenshot(((((GlobalVariable.SettingImagePath + 'name') + todaysDate) + '-') + nowTime) + '.png')

String nameImagePath = ((((GlobalVariable.SettingImagePath + 'name') + todaysDate) + '-') + nowTime) +
'.png'

CustomKeywords.'myPack.Settings.demoKey'(nameImagePath, 'name image path')

Mobile.tapAndHoldAtPosition(198.8, 1126.8, 3)

driver.getKeyboard().sendKeys(description)

CustomKeywords.'myPack.Settings.demoKey'(description, 'description')

Mobile.takeScreenshot(((((GlobalVariable.SettingImagePath + 'description') + todaysDate) + '-') + nowTime) + '.png')

String descriptionImagePath = ((((GlobalVariable.SettingImagePath + 'description') + todaysDate) + '-') + nowTime) +
'.png'

CustomKeywords.'myPack.Settings.demoKey'(descriptionImagePath, 'description image path')


Mobile.tap(findTestObject('MTouch/android.widget.Button settings update'), 0)

CustomKeywords.'myPack.Settings.demoKey'('Pass', 'result')

String RImagePath = ((((GlobalVariable.SettingImagePath + 'Acknowledgement') + todaysDate) + '-') + nowTime) + '.png'

Mobile.takeScreenshot(((((GlobalVariable.SettingImagePath + 'Acknowledgement') + todaysDate) + '-') + nowTime) + '.png')

CustomKeywords.'myPack.Settings.demoKey'(RImagePath, 'result image path')

