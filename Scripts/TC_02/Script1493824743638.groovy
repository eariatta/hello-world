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

Mobile.delay(70)

Mobile.verifyElementVisible(findTestObject('UniEuroFirstPages/HomePage_Carrello'), 5)

Mobile.verifyElementVisible(findTestObject('UniEuroFirstPages/HomePage_Home'), 5)

Mobile.verifyElementVisible(findTestObject('UniEuroFirstPages/HomePage_IO'), 5)

Mobile.tap(findTestObject('UniEuroFirstPages/HomePage_Searchbox_TXT'), 10)

Mobile.setText(findTestObject('UniEuroFirstPages/HomePage_Searchbox_TXT'), 'APPLE', 5)

Mobile.tap(findTestObject('UniEuroFirstPages/HOmePage_Search_BTN'), 10)

Mobile.tap(findTestObject('UniEuroSearchPage/AppleSelection'), 5)

Mobile.delay(40)

Mobile.verifyElementVisible(findTestObject('UniEuroSearchPage/MACBOOK_selection2'), 10)

Mobile.tap(findTestObject('UniEuroSearchPage/MACBOOK_selection2'), 10)

Mobile.verifyElementVisible(findTestObject('UniEuroSearchPage/MACBOOK_text'), 5)

Mobile.verifyElementExist(findTestObject('UniEuroSearchPage/MACBOOK_text'), 5)

Mobile.swipe(-100, 0, 200, 0)

Mobile.verifyElementVisible(findTestObject('UniEuroSearchPage/MACBOOK_page_back_BTN'), 5)

Mobile.tap(findTestObject('UniEuroSearchPage/MACBOOK_page_back_BTN'), 5)

Mobile.verifyElementVisible(findTestObject('UniEuroSearchPage/MacBookSelection'), 5)

Mobile.tap(findTestObject('UniEuroSearchPage/MyUniEuro'), 5)

