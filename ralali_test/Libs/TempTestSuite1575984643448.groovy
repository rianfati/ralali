import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/ralali')

suiteProperties.put('name', 'ralali')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\ralali_test\\ralali_test\\Reports\\ralali\\20191210_203043\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/ralali', suiteProperties, [new TestCaseBinding('Test Cases/ralali - Iteration 1', 'Test Cases/ralali',  [ 'responseStatusCode' : '200' , 's' : 'Lord' , 'apiKey' : 'b0aa8ce' ,  ]), new TestCaseBinding('Test Cases/ralali - Iteration 2', 'Test Cases/ralali',  [ 'responseStatusCode' : '200' , 's' : 'The%20Lord%20of%20the%20Rings:%20The%20Fellowship%20of%20the%20Ring' , 'apiKey' : 'b0aa8ce' ,  ]), new TestCaseBinding('Test Cases/ralali - Iteration 3', 'Test Cases/ralali',  [ 'responseStatusCode' : '401' , 's' : 'lord' , 'apiKey' : '' ,  ]), new TestCaseBinding('Test Cases/ralali - Iteration 4', 'Test Cases/ralali',  [ 'responseStatusCode' : '401' , 's' : 'lord' , 'apiKey' : 'xxx123!' ,  ]), new TestCaseBinding('Test Cases/ralali - Iteration 5', 'Test Cases/ralali',  [ 'responseStatusCode' : '200' , 's' : '' , 'apiKey' : 'b0aa8ce' ,  ]), new TestCaseBinding('Test Cases/ralali - Iteration 6', 'Test Cases/ralali',  [ 'responseStatusCode' : '200' , 's' : 'tegining' , 'apiKey' : 'b0aa8ce' ,  ]), new TestCaseBinding('Test Cases/ralali - Iteration 7', 'Test Cases/ralali',  [ 'responseStatusCode' : '401' , 's' : '' , 'apiKey' : '' ,  ]), new TestCaseBinding('Test Cases/ralali - Iteration 8', 'Test Cases/ralali',  [ 'responseStatusCode' : '200' , 's' : 'l' , 'apiKey' : 'b0aa8ce' ,  ])])
