@Grab(group='org.codehaus.groovy.modules.http-builder', module='http-builder', version='0.6')
//@Grab(group='oauth.signpost', module='signpost-core', version='1.2.1.2')
//@Grab(group='oauth.signpost', module='signpost-commonshttp4', version='1.2.1.2')
@Grab(group= 'com.dropbox.core', module='dropbox-core-sdk', version='1.7')
import com.dropbox.core.*
//import groovyx.net.http.HTTPBuilder
//import groovyx.net.http.RESTClient 
//import groovyx.net.http.*
//import static groovyx.net.http.Method.*
//import static groovyx.net.http.ContentType.* 
//import groovy.json.*
import java.io.*;
import java.util.Locale;


def appKey = "4tt9arx8d51yhvu"
def appSecret = "trvmwkprz1utggc"
def accessToken = "lTJ3-BcwWUAAAAAAAAAAOHZfZwc_sc1TtjUp4M0mNgxeN4WSn-aZb1G7tNSAOAlq"

DbxAppInfo appInfo = new DbxAppInfo(appKey, appSecret)
DbxRequestConfig config = new DbxRequestConfig("JavaTutorial/1.0", "en_US")
DbxWebAuthNoRedirect webAuth = new DbxWebAuthNoRedirect(config, appInfo)
String authorizeUrl = webAuth.start()


//println("1. Go to: " + authorizeUrl)
//println("Copy the auth code.")

//String code = new BufferedReader(new InputStreamReader(System.in)).readLine().trim()
//DbxAuthFinish authFinish = webAuth.finish(code)
//String accessToken = authFinish.accessToken;

DbxClient client = new DbxClient(config, accessToken)

File f = new File("PCMACNumbers.txt")

client.uploadFile("/PCMACasdfNumbers.txt", DbxWriteMode.add(),f.length(), new FileInputStream(f))
//client.delete("/PCMACNUMBERS.txt")