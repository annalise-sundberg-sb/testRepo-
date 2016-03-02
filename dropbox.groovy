import groovy.json.JsonSlurper

String appKey = '4tt9arx8d51yhvu'
String appSec = 'trvmwkprz1utggc'

String auth="https://dropbox.com/1/oauth2/token"
def authURL = new URL(auth)
def authConnection =  authURL.openConnection()
authConnection.setRequestMethod("GET")
authConnection.setRequestProperty("grant_type", "authorization_code")
authConnection.setRequestProperty("code","lTJ3-BcwWUAAAAAAAAAACSduXRspmUJV6FfuNS-IT7g")
println authConnection.responseCode