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

WebUI.navigateToUrl('https://itest2s1.hhscie.txaccess.net/LoginServlet?ACTION=LOGIN')

WebUI.verifyElementText(findTestObject('Object Repository/TIERS_App_Reg/Page_HHSC State Portal Login/img_WARNING_benefitsImg'),
	'')

WebUI.setText(findTestObject('Object Repository/TIERS_App_Reg/Page_HHSC State Portal Login/input_WARNING_username'), 'user3000')

WebUI.setEncryptedText(findTestObject('Object Repository/TIERS_App_Reg/Page_HHSC State Portal Login/input__password'), 'IQrDBZHQC/zUTWs5s+yhgg==')

WebUI.click(findTestObject('Object Repository/TIERS_App_Reg/Page_HHSC State Portal Login/input_Forgot Password_loginButton'))

WebUI.rightClick(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/img'))

WebUI.verifyElementText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/a_TIERS Home'),
	'TIERS Home')