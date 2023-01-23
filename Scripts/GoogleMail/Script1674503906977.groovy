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
/*
WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com/?gws_rd=ssl')

if (WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Google/div_Google recommends using Chrome'), FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/Page_Google/button_Dont switch'))

    println('---------------------- ELEMENT EXISTED AND CLICKED DO NOT SWITCH---------------------- ')
} else {
    println('---------------------- ELEMENT DIDN\'T EXISTED---------------------- ')
}

WebUI.click(findTestObject('Object Repository/Page_Google/svg_Images_gb_Ze'))

WebUI.click(findTestObject('Object Repository/Page_Google/span_News_MrEfLc'))

WebUI.click(findTestObject('Object Repository/Page_Gmail/span_Create account'))

WebUI.click(findTestObject('Object Repository/Page_Gmail/span_For my personal use'))

WebUI.click(findTestObject('Object Repository/Page_Create your Google Account/span_Sign in instead'))

WebUI.click(findTestObject('Object Repository/Page_Gmail/span_Sign in'))

if (true) {
}

WebUI.closeBrowser()


*/






WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com/?gws_rd=ssl')

if (WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Google/div_Google recommends using Chrome'), FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/Page_Google/button_Dont switch'))

    println('---------------------- ELEMENT EXISTED AND CLICKED DO NOT SWITCH---------------------- ')
} else {
    println('---------------------- ELEMENT DIDN\'T EXISTED---------------------- ')
}

WebUI.click(findTestObject('Object Repository/Page_Google/svg_Images_gb_Ze'))

WebUI.delay(3)

WebUI.navigateToUrl('https://accounts.google.com/')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Gmail/span_Create account'))

WebUI.click(findTestObject('Object Repository/Page_Gmail/span_For my personal use'))

WebUI.click(findTestObject('Object Repository/Page_Create your Google Account/span_Sign in instead'))

WebUI.delay(5)

if (WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Gmail/span_Sign in'), FailureHandling.STOP_ON_FAILURE)) {
    println('---------------------- Landed in correct page ---------------------- ')
} else {
    println('---------------------- Element not found. ---------------------- ')
}

WebUI.closeBrowser()



