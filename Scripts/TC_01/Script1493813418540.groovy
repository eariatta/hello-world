import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\eariatta\\Desktop\\Enrico\\apkFiles\\it.unieuro.unieuro-1.apk', false)

Mobile.verifyElementVisible(findTestObject('UniEuroFirstPages/waitCircle_page_1'), 50)

Mobile.delay(30)

Mobile.verifyElementVisible(findTestObject('UniEuroFirstPages/HomePage_Carrello'), 500)

Mobile.verifyElementVisible(findTestObject('UniEuroFirstPages/HomePage_Home'), 500)

Mobile.verifyElementVisible(findTestObject('UniEuroFirstPages/HomePage_IO'), 500)

Mobile.delay(30)

Mobile.verifyElementVisible(findTestObject('UniEuroFirstPages/HomePage_Unieuroimage1'), 500)

Mobile.tap(findTestObject('UniEuroFirstPages/HomePage_Searchbox_TXT'), 10)

Mobile.setText(findTestObject('UniEuroFirstPages/HomePage_Searchbox_TXT'), 'APPLE', 20)

Mobile.tap(findTestObject('UniEuroFirstPages/HOmePage_Search_BTN'), 10)

Mobile.delay(30)

