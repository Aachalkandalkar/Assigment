# **About**
### **Name :-** StudentDetails
### **Framework :-** Spring
### **Language :-** Java
### **Database :-** MySQL
---
### **Data Flow**
### **Application Properties**
1. spring.datasource.driver-class-name = com.mysql.cj.jdbc.Driver
2. spring.datasource.url = jdbc:mysql://localhost:3306/student
3. spring.datasource.username = root
4. spring.datasource.password = root
5. spring.jpa.hibernate.ddl-auto=update
6. spring.jpa.properties.hibernate.show_sql=true
7. spring.jpa.properties.hibernate.use_sql_comments=true
8. spring.jpa.properties.hibernate.format_sql=true
___
### **Controller Package**
This Package Handles the HTTP Request from the client.
It contains the Five classes 
1. StudentController
2. AddressController
3. LaptopController
4. CourseController
5. BookController

All of these consist of :
1. **@GetMapping:**
   1. The @GetMapping annotation is used to map HTTP GET requests to a specific method in the controller class.
   2. It is used to retrieve or fetch data from the server.
   3. It can be applied to a class or a specific method.
1. **@PostMapping:**
   1. The @PostMapping annotation is used to map HTTP POST requests to a specific method in the controller class. 
   2. It is used to submit or create new data on the server. 
   3. It can be applied to a class or a specific method.
2. **@PutMapping:**
   1. The @PutMapping annotation is used to map HTTP PUT requests to a specific method in the controller class. 
   2. It is used to update or modify existing data on the server. 
   3. It can be applied to a class or a specific method.
3. **@DeleteMapping:**
   1. The @DeleteMapping annotation is used to map HTTP DELETE requests to a specific method in the controller class. 
   2. It is used to delete or remove data from the server. 
   3. 1.It can be applied to a class or a specific method.
___
### **Service Package**
This is a Java Spring Boot service class that contains methods for performing CRUD (Create, Read, Update, Delete) operations on job objects. It is annotated with **@Service**, which is a Spring stereotype annotation indicating that this class is a service.
This package also consist of Four classes for each module.
___
### **Repository Package**
This package consist of interfaces. Which defines a set of methods that can be used to interact with the underlying database. The interface extends the JpaRepository interface and specifies the Job entity and the data type of its primary key Integer.
The interface contains several custom finder methods that use the naming convention of Spring Data JPA to automatically generate the queries.
In summary, this code implements a simple REST ful API for managing Job objects with endpoints for performing CRUD operations.
___
### **Model package**
Model package Consist of Five Classes
1. Student
2. Address
3. Laptop
4. Course
5. Book

All below annotations are applied on each class :
1. **@Entity:** Indicates that this class is a JPA entity and should be mapped to a database table.
2. **@Table:** Specifies the name of the database table to which this entity is mapped.
3. **@Id:** Indicates that the id field is the primary key of the entity.
4. **@GeneratedValue:** Specifies the strategy for generating values for the primary key. In this case, it uses GenerationType.AUTO.
___
### **Assignment Summary**
This assignment is used to get Mappings more clear.
