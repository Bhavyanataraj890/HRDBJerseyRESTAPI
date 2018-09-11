# HRDBApplication

Its a Simple HR Database Application(RESTful webservices implemented using Jersey).

Maven Details:
Maven 3.5.4 being used, POM file is updated to include all required dependencies.

Employee, Contact and Address are model classes.

EmployeeResources is REST API which expose all its methods as resources.

Resource and URI mapping details:
URI to get all Employees:
http://localhost:8080/HRApp/employees

URI to get individual Employee:
http://localhost:8080/HRApp/employees/{EmpId}

URI to get employees(Employee Name and Contact Details) who stay in Pune and Mumbai
http://localhost:8080/HRApp/employees/Specific

Add an Employee with Post method and URI being
http://localhost:8080/HRApp/employees

Update an Employee with PUT method and URI being 
http://localhost:8080/HRApp/employees/{EmpId}

Delete an Employee using the below url and with DELETE method
http://localhost:8080/HRApp/employees/{EmpId}

EmployeeService is service based class.

EmployeeDatabase DB class which return a static Map Object