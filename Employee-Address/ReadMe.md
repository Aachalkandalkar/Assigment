# **About Assignment**
## **Name :-** Employee-Address
## **Framework :-** Spring
## **Language :-** Java
## **Database :-** MySQL
---
## **Data Flow**
### **Controller Package**
This package consist of two classes **EmployeeController** and **AddressController**. 

#### **EmployeeController Class**
1. **employeeService.getAll():** This method call returns a list of all employees.
1. **employeeService.getById(id):** This method call returns an employee with the specified id.
1. **employeeService.save(employee):** This method call saves a new employee to the database.
1. **employeeService.updateEmployee(employee, id):** This method call updates an existing employee with the specified id.
1. **employeeService.deleteById(id):** This method call deletes an employee with the specified id.

#### **AddressController Class**
1. **getAddresses():** handles the GET request to retrieve all Address objects from the database. It returns a list of Address objects.
1. **getAddress():** handles the GET request to retrieve a specific Address object by its id. It takes an id parameter as a path variable and returns an Optional<Address> object.
1. **addEmployee():** handles the POST request to create a new Address object. It takes an Address object in the request body and returns a string indicating whether the object was saved or not.
1. **updateAddress():** handles the PUT request to update an existing Address object by its id. It takes an Address object in the request body and the id parameter as a path variable. It returns a string indicating whether the object was updated or not.
1. **deleteEmployee():** handles the DELETE request to delete an Address object by its id. It takes the id parameter as a path variable and returns a string indicating whether the object was deleted or not.
___
### **Service Package**
This package consist of two classes **EmployeeService** and **AddressService**

#### **EmployeeService class**
1. **getAll():** This method returns a list of all employees in the database by calling the findAll() method on the injected IEmployeeRepo instance.
1. **getById():** This method takes an ID parameter and returns an Optional<Employee> object that represents the employee with that ID (if it exists) by calling the findById() method on the injected IEmployeeRepo instance.
1. **save():** This method takes an Employee object and saves it to the database by calling the save() method on the injected IEmployeeRepo instance. If the save operation was successful, it returns the string "Employee Saved"; otherwise, it returns the string "Employee Not Saved".
1. **updateEmployee():** This method takes an Employee object and an ID parameter, sets the ID of the employee object to the provided ID, and updates the employee in the database by calling the save() method on the injected IEmployeeRepo instance. If the update operation was successful, it returns the string "Employee with id {id} updated"; otherwise, it returns the string "Employee with id {id} not updated".
1. **deleteById():** This method takes an ID parameter and deletes the employee with that ID from the database by calling the deleteById() method on the injected IEmployeeRepo instance. If the delete operation was successful, it returns the string "Employee with id : {id} has been deleted"; otherwise, it returns the string "Employee with id : {id} has not been deleted".

#### **AddressService class**
1. **getAll():** This method returns a list of all addresses in the database by calling the findAll() method on the injected IAddressRepo instance.
1. **getById():** This method takes an ID parameter and returns an Optional<Address> object that represents the address with that ID (if it exists) by calling the findById() method on the injected IAddressRepo instance.
1. **save():** This method takes an Address object and saves it to the database by calling the save() method on the injected IAddressRepo instance. If the save operation was successful, it returns the string "Address Saved"; otherwise, it returns the string "Address Not Saved".
1. **deleteById():** This method takes an ID parameter and deletes the address with that ID from the database by calling the deleteById() method on the injected IAddressRepo instance. If the delete operation was successful, it returns the string "Address with id : {id} has been deleted"; otherwise, it returns the string "Address with id : {id} has not been deleted".
1. **updateAddress():** This method takes an Address object and an ID parameter, sets the ID of the address object to the provided ID, and updates the address in the database by calling the save() method on the injected IAddressRepo instance. If the update operation was successful, it returns the string "Address with id {id} updated"; otherwise, it returns the string "Address with id {id} not updated".
___
### **Repository Package**
This package consist two interface **IEmployeeRepo** and **IAddressRepo**
#### **IEmployeeRepo and IAddressRepo**
This code is written in Java and defines an interface called "IEmployeeRepo" and "IAddressRepo". These interface extends the JpaRepository interface, which is part of the Spring Data JPA library, and provides a way to perform CRUD (Create, Read, Update, Delete) operations on a database table representing the "Address" entity.
The @Repository annotation is provided by the Spring Framework and indicates that this interface should be treated as a repository, which provides a way to interact with a persistence layer (such as a database) using a higher-level, object-oriented interface.
* The **IEmployeeRepo** interface has two type parameters: Employee and Long. Employee is the entity type that this repository manages, and Long is the type of the entity's primary key.
* The **IAddressRepo** interface has two type parameters: Address and Long. Address is the entity type that this repository manages, and Long is the type of the entity's primary key.

The JpaRepository interface provides several methods for performing CRUD operations on the entity, such as save(), findById(), findAll(), deleteById(), and so on. These methods are inherited by IAddressRepo and can be used to interact with the "Address" entity in the database. Additional custom methods can also be defined in the interface, which can be used to query the database in more complex ways.
___
### **Model package**
Model package Consist of two **class** : **Employee** and **Address**
Both the class Uses **Lombok**
1. **@Data:** This annotation is provided by the Lombok library and generates getters, setters, toString, hashCode and equals methods automatically, based on the class's fields.
1. **@AllArgsConstructor:** This annotation generates a constructor with parameters for all fields in the class.
1. **@NoArgsConstructor:** This annotation generates a constructor with no parameters.
1. **@Entity:** This annotation is provided by the Java Persistence API (JPA) and indicates that this class is a JPA entity, which can be stored and retrieved from a database.

#### **Employee class**
This code is written in Java and defines a class called "Employee". The class is annotated with several annotations, which provide additional information about the class to the compiler and runtime environment.
The class has three fields:
1. **id:** This is a Long field annotated with @Id, which indicates that it is the primary key of the entity.
1. **firstname:** A String field representing the employee's first name.
1. **lastName:** A String field representing the employee's last name.
The class also has an Address field, which is annotated with **@OneToOne**, indicating that each employee has exactly one address. The "cascade" attribute is set to CascadeType.ALL, which means that any changes made to the employee object (such as deletion) will be cascaded to the associated address object. The "orphanRemoval" attribute is set to true, which means that if an address object becomes orphaned (i.e. it is no longer associated with an employee), it will be removed from the database.

#### **Event class**
The class has five fields:
1. **id:** This is a Long field annotated with @Id, which indicates that it is the primary key of the entity.
1. **street:** A String field representing the street name.
1. **city:** A String field representing the city name.
1. **state:** A String field representing the state name.
1. **zipcode:** A String field representing the postal code.

The **@GeneratedValue** annotation is used to specify that the primary key value for a new Address object will be generated automatically by the database, using an identity-based strategy.
