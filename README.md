# Notion-Android-App

Android app leveraging the Notion API and database integration to display my Reading List. 

After making a database in Notion following the guides on https://developers.notion.com/docs/getting-started, I was able to populate my database with Book Titles and descriptive Tags. 
I used Retrofit, a type-safe HTTP client for Android and Java to make my network requests. Retrofit turns your HTTP API into a Java interface. The Retrofit documentation can be found here: https://square.github.io/retrofit/.  I also used JSON to Plain Old Java Object converter https://www.jsonschema2pojo.org/ to help create model objects that matched the JSON response. 

In order to run this app, clone this repository and open in Android Studio or a compatible IDE that can run android code with an emulator. 


 1. Was there anything you got stuck on, and if so what did you do to resolve it?
 - I ran into some difficulty in the beginning with properly making my HTTP requests using the necessary headers before I leveraged Retrofit to make my life easier. 
    
 2. Do you have any suggestions for improving the API documentation to make it clearer or easier to use?
 - I could suggest that there was a lot of Web focused code samples that were very helpful on the Notion Developers page, but I found that it lacked Mobile focused code samples unless you did some digging into the Notion Github. 
 
    
3. A list of links to any major sources you relied on, if any (e.g. a StackOverflow response about how to parse JSON data in Swift)
https://square.github.io/retrofit/ 
https://www.jsonschema2pojo.org/


4. A list of major open-source libraries you chose to use, if any (e.g. "Alamofire for networking")
- Retrofit for Networking. - https://square.github.io/retrofit/ 
- Flipper for Debugging (Provides a nice stack trace instead of relying on Logcat. - https://fbflipper.com/
