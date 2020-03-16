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

WebUI.click(findTestObject('Object Repository/HSN PN/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/button_Akzeptieren'))

WebUI.click(findTestObject('Object Repository/HSN PN/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/div_Das Auto ist schon versichert(Versicher_352d7e'))

WebUI.setText(findTestObject('Object Repository/HSN PN/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/input_Wann soll deine FRIDAY Versicherung s_5f7c24'), 
    '01.04.1600')

WebUI.click(findTestObject('Object Repository/HSN PN/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/span_Hups Dieses Datum liegt in der Vergang_fb99d3'))

WebUI.setText(findTestObject('Object Repository/HSN PN/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/input_Wann soll deine FRIDAY Versicherung s_5f7c24'), 
    '01.04.2020')

WebUI.click(findTestObject('Object Repository/HSN PN/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/button_Weiter'))

WebUI.click(findTestObject('Object Repository/HSN PN/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/div_Nein'))

WebUI.click(findTestObject('Object Repository/HSN PN/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/div_bei Kauf neu'))

WebUI.click(findTestObject('Object Repository/HSN PN/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/button_Weiter'))

WebUI.click(findTestObject('Object Repository/HSN PN/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/span_HSNTSN eingeben'))

WebUI.setText(findTestObject('Object Repository/HSN PN/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/input_Erstzulassung_monthYear'), 
    '02.2000')

WebUI.setText(findTestObject('Object Repository/HSN PN/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/input_HSN_hsn'), 
    '0009')

WebUI.setText(findTestObject('Object Repository/HSN PN/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/input_TSN_tsn'), 
    'AIE')

WebUI.click(findTestObject('Object Repository/HSN PN/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/p_Diese Informationen findest du auf der mi_f86598'))

WebUI.click(findTestObject('Object Repository/HSN PN/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/button_Weiter'))

WebUI.setText(findTestObject('Object Repository/HSN PN/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/input_Erstzulassung_monthYear'), 
    '02.2004')

WebUI.click(findTestObject('Object Repository/HSN PN/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/input_TSN_tsn'))

WebUI.setText(findTestObject('Object Repository/HSN PN/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/input_HSN_hsn'), 
    '0005')

WebUI.click(findTestObject('Object Repository/HSN PN/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/button_Weiter'))

WebUI.click(findTestObject('Object Repository/HSN PN/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/div_BMW 535D Limousine Diesel 2993 cc 210286 KWPS'))

WebUI.click(findTestObject('Object Repository/HSN PN/Page_FRIDAY Autoversicherung In nur 90 Seku_ba7e08/button_Weiter'))

WebUI.closeBrowser()

