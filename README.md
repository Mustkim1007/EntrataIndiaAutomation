#### Automate EntrataIndia Application !

###### This project utilizes Java and Selenium WebDriver to automate test cases for the Entrata India website, ensuring efficiency and reliability in validating its functionalities.
###### https://www.entrata.com

#### Highlights:

###### 3-5 pre-defined test cases covering key functionalities like watchdemo, login, Pageurl, and Pagetitle and watchdemo form submission. Easily expand the test suite to cater to additional functionalities.

#### Built with popular technologies:

###### Java
###### Selenium WebDriver
###### TestNG (testing framework)
###### Maven (project management)
###### TestNG-powered execution: Choose specific tests or run the entire suite seamlessly.

#### Getting Started:

###### Clone the repository: git clone https://github.com/Mustkim1007/EntrataIndiaAutomation.git
###### Import the project into Eclipse.
###### Wait for dependencies to download. This might take a while depending on your internet speed.
###### /src - > main -> resources -> Chromedriver: Webdriver added
###### /src -> main -> resources > ExcelFile ExcelData file is added

#### Running the Tests:

###### In Eclipse, click on Project > Run as > mvn verify.
###### Run the test classes -> Go to the testng.xml file -> Run as the testngSuite.

#### Test Cases:

###### 1. Compare expected and actual results in Assertions for the page title name and URL of https://www.entrata.com.
###### 2. The WatchDemo link section should be validated by comparing the expected and actual results in the assertion based on the URL of the WatchDemo link section.
###### 3. Validation of WatchDemo section form - To check form is accepting data properly in the textboxes and should submit when click on watchdemo button.
###### 4. The SignIn Link section url should be validated by comparing the expected and actual results in the assertion based on the URL of theSignIn Link section url.
###### 5. Validation of SignIn section - To check using username and password accepting in the textboxes and should login suceffully when click on login button.

#### Additional Information

###### Additionally, a TestCasesExcel File and an emailable report have been added into TestCasesExcelFile to this repository.
