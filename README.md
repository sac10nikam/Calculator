# Calculator
Simple Expression Calculator

Summary:
Simple calculator program created as a maven project. We are generating its code coverage report using Jacoco plugin.
Import this project in IDE (Eclipse/STS) and ensure you have download rights and internet access before building this project
Maven build will be executed with the following command:

Build jar file
mvn clean install

Run StringCalculator
java -jar {jarName.jar}

Features:
Addtion
Substraction
Multiplication
Division
Exponential

e.g.
  Scenario: 1. Add two numbers
    Given the numbers 3 and 4
    When I add the two numbers
    Then the result should be 7

  Scenario: 2. Subtract two numbers
    Given the numbers 2 and 1
    When I subtract the two numbers
    Then the result should be 1

Code Coverage Report:
You can view code coverage report at ../Calculator/target/site/jacoco/index.html
	
Technical Stack:
Java8
Eclipse IDE
Junit
Open source libraries like commons-lang3, SLJ4j, logback-core
Jacoco plugin for code coverage
Git
Maven
etc.

Note:
1) Added Application.java as a Main class or run executable jar file which is getting created under target folder. 
You can run it if you want to. Else you can execute test cases and see Jacoco report in html, csv, and xml format
