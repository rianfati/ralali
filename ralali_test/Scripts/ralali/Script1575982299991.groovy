import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonSlurper
import internal.GlobalVariable

//define input
GlobalVariable.apikey = apiKey
GlobalVariable.s = s

//post to api
def request = (RequestObject) findTestObject('Ralali')
def response = WS.sendRequest(request)

//get response
println (request.getRestUrl())
def bodyContent = response.responseBodyContent
def respDataMap = new JsonSlurper().parseText(bodyContent)
def statusCode = response.statusCode
println (respDataMap)
println (statusCode)

//verify status code
WS.verifyEqual(statusCode, responseStatusCode)

