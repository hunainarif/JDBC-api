# JDBC-api
JDBC API (Type1 Driver)

Author: Hunain Arif | BSCS2B | 00479

JDBC (JAVA Database Connectivity) API is an application-programming interface in Java to provide user to interact with Database (MySQL) for data manipulation, management and creation. Currently I have implemented Type 1 JDBC API, which means it utilizes JDBC-ODBC Bridge underlying JDBC API. 
ODBC API for different underlying database can be acquired by specific vendor’s documentation and can be plugged into JDBC API’s data source.
Currently, JDBC API has following interface implemented from java.sql package, which provides basic database interaction:
•	Driver.java 
This class holds the actual driver and all the dada manipulations are handled here.
•	Connection.java 
This class helps to creates a connection with a database
•	Statement.java
This class helps to prepare statements for the queries, which are to be executed. 
•	ResultSet.java
This class receives the result-set of any query and provides the output in user handled form 

Testing (JUnit Test Cases)
Standard testing is carried out against all the implemented interfaces to check its functionality and correctness. Testing is carried out incrementally therefore I have created following three test cases:
•	Driver Test
This test simply checks if the driver gets registered successfully or not. If it successfully registers the driver, test passes else it fails.
•	Statement Test
This test checks whether the statement is created correctly or not. Test passes if statement is created successfully without raising any exceptions  
•	Result Set Test
This is a complete test, which registers the driver, creates a statement, executes a statement, extract results from result-set and then closes the connection.
