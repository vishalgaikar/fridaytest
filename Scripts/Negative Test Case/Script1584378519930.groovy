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

WebUI.click(findTestObject('Object Repository/Negative/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/button_Akzeptieren'))

WebUI.click(findTestObject('Object Repository/Negative/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/div_In 90 Sekunden zum BeitragDas Auto ist _b7ae03'))

WebUI.setText(findTestObject('Object Repository/Negative/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/input_Wann soll deine FRIDAY Versicherung s_5f7c24'), 
    '01.04.2020')

WebUI.click(findTestObject('Object Repository/Negative/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/button_Weiter'))

WebUI.click(findTestObject('Object Repository/Negative/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/span_Nein'))

WebUI.click(findTestObject('Object Repository/Negative/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/span_bei Kauf neu'))

WebUI.click(findTestObject('Object Repository/Negative/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/button_Weiter'))

WebUI.setText(findTestObject('Object Repository/Negative/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/input_HSNTSN eingeben_makeFilter'), 
    'hy')

WebUI.doubleClick(findTestObject('Object Repository/Negative/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/input_HSNTSN eingeben_makeFilter'))

WebUI.setText(findTestObject('Object Repository/Negative/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/input_HSNTSN eingeben_makeFilter'), 
    'Hy')

WebUI.click(findTestObject('Object Repository/Negative/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/div_HYUNDAI'))

WebUI.setText(findTestObject('Object Repository/Negative/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/input_Whle dein Automodell_modelFilter'), 
    'i20')

WebUI.click(findTestObject('Object Repository/Negative/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/div_i20'))

WebUI.click(findTestObject('Object Repository/Negative/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/div_Coupe'))

WebUI.click(findTestObject('Object Repository/Negative/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/div_Diesel'))

WebUI.click(findTestObject('Object Repository/Negative/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/div_I20 14 CRDIHSN 5984 TSN ABA'))

WebUI.setText(findTestObject('Object Repository/Negative/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/input_Erstzulassung (Monat und Jahr)_monthY_7fb2aa'), 
    '01.2020')

WebUI.click(findTestObject('Object Repository/Negative/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/button_Weiter'))

WebUI.closeBrowser()

