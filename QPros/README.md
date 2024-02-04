## AutomationTaskFor E-commerce Website Using_Shaft_Engine

### About
-This project aims to automate E2E Testcase for E-Commerce website

### Tools Used
- This Framework has been built using SHAFT Engine with:
  - Selenium WebDriver usin Java
  - TestNG
  - Apache Maven
  - Extent report

  ### Installation
  - JDK 21 :https://www.oracle.com/java/technologies/downloads/#jdk21-windows
  - Intelij IDEA Commuity Edition: https://www.jetbrains.com/idea/
  - Git: https://git-scm.com/downloads
  - Apache Maven "Binary Zip" :https://maven.apache.org/download.cgi

  ### Framework Structure
  - This Framework is designed using POM design pattern "Page Object Model" ,which is classified into:
  - ### Main Folder pages package
     - where it conains page object classes for each page, that have locators and logic implementations for each page
  - ###  Test Package :
     - # Where it contains the tests writtten for the fllowing bussiness flow:
     -  Asserting Thinking in HTML book exist along with its price
     - Clicking on Add to Basket for Thinking in HTML book
     - Clicking on Shopping Cart
     - Asserting Item added to cart with its details
     - Clicking on Proceed to Checkout
     - Assert Billing Details form displayed

   ### How to Run Scenarios:
   - Firstly, Clone the project using "git clone 'url of the project'.
   - Then, you should add 'com.shaft.listener.TestNGListener' in TestNG in InteliJ configuraton, Here are the steps:
      - From the header Menu, Click on Run --> 'Edit configuration'
      - Click on Edit configuration Templates
      - Click on TestNG
      - Click on 'Listeners' tab
      - Click on'+' icon, and add the listeners
      - Save the configuration.
   - Secondly for a single Test scenario you can run it directly from InteliJ by right- Click on any test class and run it directly   .
   
