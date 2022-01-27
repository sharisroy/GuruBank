							Guru99 Bank Testing

							
							
Link : https://demo.guru99.com/V4/index.php
User ID  : mngr381950
Password : AqAqyhE



------------------------------------------------------------

1. Create Maven Project
2. Add Packages: pageObjectives, testCases, testData, utilities.
3. Add Folders : Configuration, Driver, Screenshots.
4. Add Dependencies: junit, selenium-java, testng, Apache poi, poi-ooxml, extentreports, webdrivermanager,log4j,
	extentreports,  
5. Add Log4j/Log4j2 Properties in home directory(report will be store in logReport Folder.
6. Add extent reports: extent-config.xml file, Add Listener class into utility package and add also listener into TestNg.xml
7. Add Data Driven Test : Add XlUtils class, Create Excel sheet into testData Package, Crate TestCase Class(DataDriven), Change TextNg File
8. Add Customer : Create AddcustomerPage, TestClass and edit TestNg.
9. Add Customer : Edit customerPage, TestClass and edit TestNg.

10. Run This using Pom.xml : add plugin maven-compiler-plugin, maven-surefire-plugin and run maven test or clean

11. Run : command prompt, create bat file, Jenkins(Continuous Integration)
	Jenkins: install, active, run: http://localhost:8080/
	Execute project using Maven(pom.xml) or run.bat file.
	Pom.xml : 
		a. Add Plugins : Manage Jenkns-> Maven Plagin-> Available ->> Maven Integration and Maven Release Plugin,
			Maven Invoker, Repository Connector, Maven Repository Scheduled Cleanup,Maven Repository Server, Maven Info,
		b. Global Tool Configuration: JDK Path.
		c. Create Item, select Maven Project , Setting : Build Enviroment -> Build ->Root POM: pom.xml Path, Goals and option: clean install
			Post-build Actions: Editable Email Notification.
			
			
12. Git : install git
13. GitHub : Create New Repository : https://github.com/sharisroy/GuruBank.git

-------------------------Git Comment-----------------------------------
1.  $ git init     (create empty repository Locally)
2.  $ git remote add origin "https://github.com/sharisroy/GuruBank.git" ( make it remote reposotory)
3.  $ git status  ( what are fikes ready to commit in git repository
4.  $ git add -A  ( Add all files into sataging area)
5.  
	

Costomer id : 58863, 33397,67452,21526, 29731,