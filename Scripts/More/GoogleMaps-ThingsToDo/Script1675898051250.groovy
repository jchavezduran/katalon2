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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com/')
 

WebUI.delay(2)


//WebUI.verifyElementVisible(findTestObject, FailureHandling.STOP_ON_FAILURE)
//WebUI.verifyElementPresent(findTestObject, 0, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

if (WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Google/div_Google recommends using Chrome'), FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('Object Repository/Page_Google/button_Dont switch'))
	println("---------------------- ELEMENT EXISTED AND CLICKED DO NOT SWITCH---------------------- ")
}
else {
	println("---------------------- ELEMENT DIDN'T EXISTED---------------------- ")
}

//WebUI.click(findTestObject('Object Repository/Page_Google/div_Google recommends using Chrome'))


WebUI.click(findTestObject('Object Repository/Page_Google/svg_Images_gb_Ze'))

WebUI.takeScreenshot()

//WebUI.click(findTestObject('Object Repository/Page_Google/span_Search_MrEfLc'))

WebUI.navigateToUrl('https://www.google.com/maps')

WebUI.delay(4)
 
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Page_Google Maps/input_Search Google Maps_q'), 'Texas')

WebUI.click(findTestObject('Object Repository/Page_Google Maps/button_Menu_searchbox-searchbutton'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_Texas - Google Maps/span_Things to do'))

WebUI.delay(4)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Google/div_Google recommends using Chrome'), 5, FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('Object Repository/Page_Google/button_Dont switch'))
	println("---------------------- ELEMENT EXISTED AND CLICKED DO NOT SWITCH---------------------- ")
}
else {
	println("---------------------- ELEMENT DIDN'T EXISTED---------------------- ")
}

WebUI.takeScreenshot()

WebUI.closeBrowser()

