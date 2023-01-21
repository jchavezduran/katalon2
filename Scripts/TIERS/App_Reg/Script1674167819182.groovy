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

WebUI.navigateToUrl('https://idev2s1.hhscie.txaccess.net/tiers/LoginServlet?ACTION=LOGIN')

WebUI.verifyElementText(findTestObject('Object Repository/TIERS_App_Reg/Page_HHSC State Portal Login/img_WARNING_benefitsImg'), 
    '')

WebUI.setText(findTestObject('Object Repository/TIERS_App_Reg/Page_HHSC State Portal Login/input_WARNING_username'), 'user3000')

WebUI.setEncryptedText(findTestObject('Object Repository/TIERS_App_Reg/Page_HHSC State Portal Login/input__password'), 'IQrDBZHQC/zUTWs5s+yhgg==')

WebUI.click(findTestObject('Object Repository/TIERS_App_Reg/Page_HHSC State Portal Login/input_Forgot Password_loginButton'))

WebUI.verifyElementText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/a_TIERS Home'), 
    'TIERS Home')

WebUI.click(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/a_Application Registration'))

WebUI.click(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/a_Register an Application'))

WebUI.setText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input__monthdateReceived'), 
    '01')

WebUI.setText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input__datedateReceived'), 
    '01')

WebUI.setText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input__yeardateReceived'), 
    '2023')

WebUI.setText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_First_firstName'), 
    'Katalon')

WebUI.setText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_Last_lastName'), 
    'Certification')

WebUI.click(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_Date Received_top_btn_name_1'))

WebUI.verifyElementText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/label_Register Application - Address'), 
    'Register Application - Address')

WebUI.setText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_Str_streetNumber'), 
    '1200')

WebUI.selectOptionByValue(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/select_ENNENWSSESWW'), 
    'EA', true)

WebUI.setText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_Str. NameRural Addr_streetName2'), 
    'Parmer')

WebUI.selectOptionByValue(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/select_AlleyAnnexArcadeAvenueBayouBeachBend_e55eba'), 
    'LN', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/select_AndersonAndrewsAngelinaAransasArcher_1d5592'), 
    '453', true)

WebUI.setText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_City_city'), 
    'Austin')

WebUI.click(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/li_Austin'))

WebUI.setText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_-_zipCode5'), 
    '78660')

WebUI.selectOptionByValue(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/select_NO YES'), 
    'N', true)

WebUI.click(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input__dynaLocalSubmitButton'))

WebUI.click(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_Date Received_top_btn_name_1'))

WebUI.verifyElementText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/label_Register Application - Type'), 
    'Register Application - Type')

WebUI.selectOptionByValue(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/select_NO YES_1'), 
    'Y', true)

WebUI.click(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_Is this a request for Hospice_actionButton3'))

WebUI.verifyElementText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/label_Register Individual - Modify Non File_ebfe29'), 
    'Register Individual - Modify Non File Cleared Individual')

WebUI.selectOptionByValue(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/select_Unknown Male Female'), 
    'M', true)

int ssn1ssn

int ssn2ssn

int ssn3ssn

int DOB_Month

int DOB_Day

int DOB_Year

DOB_Month = (((Math.random() * 11) + 1) as int)

DOB_Day = (((Math.random() * 27) + 1) as int)

DOB_Year = (((Math.random() * 20) + 1980) as int)

ssn1ssn = (((Math.random() * 699) + 300) as int)

ssn2ssn = (((Math.random() * 89) + 10) as int)

ssn3ssn = (((Math.random() * 7999) + 2000) as int)

System.out.println(DOB_Month)

System.out.println(DOB_Day)

System.out.println(DOB_Year)

System.out.println(ssn1ssn)

System.out.println(ssn2ssn)

System.out.println(ssn3ssn)

WebUI.setText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input__monthdateOfBirth'), 
    '' + DOB_Month)

WebUI.setText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input__datedateOfBirth'), 
    '' + DOB_Day)

WebUI.setText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input__yeardateOfBirth'), 
    '' + DOB_Year)

WebUI.setText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_--_ssn1ssn'), 
    '' + ssn1ssn)

WebUI.setText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_--_ssn2ssn'), 
    '' + ssn2ssn)

WebUI.setText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_--_ssn3ssn'), 
    '' + ssn3ssn)

WebUI.selectOptionByValue(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/select_Hispanic Non-Hispanic Not Provided'), 
    'HS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/select_English Spanish Vietnamese Sign Lang_257107'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_E-mail address_actionButton4'))

WebUI.verifyElementText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/label_Register Individual - Summary'), 
    'Register Individual - Summary')

WebUI.click(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_Male_fileClearance'))

WebUI.click(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_Male_actionButton2'))

WebUI.verifyElementText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/label_File Clearance - Results'), 
    'File Clearance - Results')

WebUI.selectOptionByValue(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/select_NO YES_1_2'), 
    'N', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/select_NO YES_1_2_3'), 
    'Y', true)

WebUI.click(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_Do you wish to establish as a new ind_97d94b'))

WebUI.verifyElementText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/label_Register Individual - Summary'), 
    'Register Individual - Summary')

WebUI.click(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_E-mail address_actionButton4'))

WebUI.verifyElementText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/label_Register Program - Program'), 
    'Register Program - Program')

WebUI.click(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_TANF_txw'))

WebUI.click(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_Medicaid_ltc'))

WebUI.click(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_MAGI_mag'))

WebUI.click(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_OngoingPrior Months Coverage_aidRequestSw'))

WebUI.click(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input__priorMedicaid_0'))

WebUI.click(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_E-mail address_actionButton4'))

WebUI.verifyElementText(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/label_Register Application - Summary'), 
    'Register Application - Summary')

WebUI.selectOptionByValue(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/select_NO YES_1_2_3_4'), 
    'Y', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/select_NO YES_1_2_3_4_5'), 
    'Y', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/select_Inbound Call Lobby Outbound Call'), 
    'LB', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/select_NO YES_1_2_3_4_5_6'), 
    'N', true)

WebUI.click(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_CMA_tlm-CM'))

WebUI.click(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input'))

WebUI.click(findTestObject('Object Repository/TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/input_Applicable Forms_button3'))

CaseNumber = WebUI.getText(findTestObject('TIERS_App_Reg/Page_Texas Integrated Eligibility Redesign System/span_TLM19 Case 1049991331 established. Fle_73d3ed'))

String[] splitted = CaseNumber.split('\\s* \\s*')

System.out.println(splitted[2])

