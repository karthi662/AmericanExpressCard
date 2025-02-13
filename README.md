# UI Automation Framework

This is a Selenium WebDriver-based test automation framework designed for web applications. It uses Java, Cucumber BDD,JVM Report and Maven for test execution and reporting.

## Project Structure

├── src/main/java 
│   ├── objects              # Page Object Repository
│   ├── pages                # #Custome Page Object Model classes
│   ├── utils                # Main framework utilities (e.g., file reader)
├── src/main/resources
│   ├── datas                # Data stored in properties file
├── src/test/java
│   ├── stepdefinition       # matching step definitions
│   ├── testrunner           # Test runner class to execute test cases
├── src/test/resources
│   ├── features             # cucumber feature files
├── JVMReports/              # UI friendly html report
├── target/                  # xml and json reporting
├── pom.xml                  # Maven dependencies
├── README.md                # Documentation

## Technologies Used
- Java 11+
- Selenium WebDriver
- Cucumber
- junit
- Maven
- JVM Reports
- Log4j for logging
