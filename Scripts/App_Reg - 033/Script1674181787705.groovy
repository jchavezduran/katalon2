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



int ssn1ssn,ssn2ssn,ssn3ssn, DOB_Month,DOB_Day,DOB_Year
DOB_Month = (((Math.random() * 11) + 1) as int)
DOB_Day = (((Math.random() * 27) + 1) as int)
DOB_Year = (((Math.random() * 20) + 1980) as int)
ssn1ssn = (((Math.random() * 699) + 200) as int)
ssn2ssn = (((Math.random() * 89) + 10) as int)
ssn3ssn = (((Math.random() * 6999) + 2000) as int)
System.out.println(DOB_Month)
System.out.println(DOB_Day)
System.out.println(DOB_Year)
System.out.println(ssn1ssn)
System.out.println(ssn2ssn)
System.out.println(ssn3ssn)
WebUI.setText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input__monthdateOfBirth'),     '' + DOB_Month)
WebUI.setText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input__datedateOfBirth'),     '' + DOB_Day)
WebUI.setText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input__yeardateOfBirth'),     '' + DOB_Year)
WebUI.setText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_--_ssn1ssn'),     '' + ssn1ssn)
WebUI.setText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_--_ssn2ssn'),     '' + ssn2ssn)
WebUI.setText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_--_ssn3ssn'),     '' + ssn3ssn)
 