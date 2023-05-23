# FrontEndTest_Java

<h2 align="left"> Selenium/BDD</h2>
<h3 align="left">Nathan Benatti Silva</h3>

## Testing Automation Architecture(PageObjects):

📦src   
 ┣ 📂main   
 ┃ ┣ 📂java   
 ┃ ┗ 📂resources   
 ┗ 📂test   
 ┃ ┣ 📂java   
 ┃ ┃ ┗ 📂PageObjects   
 ┃ ┃ ┃ ┗📜GroceryCrudPage.java   
 ┃ ┃ ┗ 📂Steps   
 ┃ ┃ ┃ ┗📜Steps.java  
 ┃ ┃ ┗ 📂Util   
 ┃ ┃ ┃ ┗ 📜Utils.java  
 ┃ ┃ ┃    
 ┃ ┗ 📂resources    
 ┃ ┃ ┗ 📂Features   
 ┃ ┃ ┃ ┃📜addCustomer.feature    
 ┃ ┃   ┗📜checkbox.feature    
 ┃ ┗ README.md 
 ┗ .gitignore


## Attention!
```java
    Project is set up to run on Microsoft Edge browser. 
     -> If you wish to change the browser, it will be necessary to configure the driver in the GroceryCrudPage.java file.
     (Lines 31, 32 and 35)  
```
## How to execute:
```jav
     ->Open the project through IDE and test using the addCustomer.feature and/or checkbox.feature files.


## Technologies:

- [Java-OpenJDK 19.0.2](https://www.java.com/pt-BR/)
- [Selenium](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.8.0)
- [Cucumber-Java](https://mvnrepository.com/artifact/io.cucumber/cucumber-java/7.10.0)
- [Cucumber-jUnit](https://mvnrepository.com/artifact/io.cucumber/cucumber-junit/7.10.0)
- [Webdrivermanager](https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.2)
