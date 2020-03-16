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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hello.friday.de/quote/selectPrecondition')

WebUI.click(findTestObject('Object Repository/Positive/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/button_Akzeptieren'))

WebUI.click(findTestObject('Object Repository/Positive/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/span_Das Auto ist schon versichert'))

WebUI.setText(findTestObject('Object Repository/Positive/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/input_Wann soll deine FRIDAY Versicherung s_5f7c24'), 
    '15.04.2020')

WebUI.click(findTestObject('Object Repository/Positive/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/button_Weiter'))

WebUI.click(findTestObject('Object Repository/Positive/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/button_Weiter'))

WebUI.click(findTestObject('Object Repository/Positive/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/div_VW'))

WebUI.click(findTestObject('Object Repository/Positive/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/div_Polo'))

WebUI.click(findTestObject('Object Repository/Positive/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/div_Kombi'))

WebUI.click(findTestObject('Object Repository/Positive/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/div_Benzin'))

WebUI.click(findTestObject('Object Repository/Positive/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/div_74 kW  101 PS'))

WebUI.click(findTestObject('Object Repository/Positive/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/div_POLO VARIANT 16HSN 0603 TSN 357'))

WebUI.setText(findTestObject('Object Repository/Positive/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/input_Erstzulassung (Monat und Jahr)_monthY_7fb2aa'), 
    '02.2020')

WebUI.setText(findTestObject('Object Repository/Positive/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/input_Zulassung auf dich (Monat und Jahr)_m_b318b0'), 
    '03.2020')

WebUI.click(findTestObject('Object Repository/Positive/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/button_Weiter'))

WebUI.closeBrowser()

