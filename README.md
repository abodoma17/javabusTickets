
 

 
 

DESCRIPTION 

 

This is a bus company system for multiple bus stations that has a database of employees and customers and their information. This program can create tickets to be used but it is mainly meant for the use of the people working in the bus company not the customers. 

 

 
 USAGE INSTRUCTIONS 

    RUN the server class 

    RUN the main class 

    For access, use username admin and password admin 

USERNAME AND PASWORD ARE CASE-SENSITIVE 


 

Bus Station Class 

    Bus Station class has 3 private variables (with their setters and getters to access them): 1-stationName, 2-stationCity, 3-stationID. 

    Public constructor that initializes stationName and stationCity. 

    Another public constructor that initializes: stationName and stationCity and stationID 

    toString function with a string return value that prints all info of the bus station class. 

(I used encapsulation and Overloading in this class) 

 

 

Person Class 

 

    This class has 3 private variables (with their setters and getters): int age, String name, String phoneNo. 

    Constructor that initializes values of age, name and phoneNo. 

    This is an abstract class that implements the interface display and uses the method DisplayNamePhone() which displays the names and phone numbers of the person. 

    toString() function with a string return type to print all info on the Person. 

 

 

 

display Interface 

 

    Has a function called DisplayNamePhone() that is implemented in the class person and all its subclasses (Employee and Customer). 

 

 

Employee Class 

(Used Inheritence and Override) 

    Extends Person class so it uses the same variables, methods of the Person class and has some variables and methods of its own. 

    Has 2 private variables (and their setters and getters) int ID and String station. 

    Has a constructor that uses the super’s constructor to initialize age, name and phoneNo and it initializes Employee’s variables also (which are ID and station) 

    Has a toString() method that overrides the method in the Person class and prints its own. 

 

 

Customer Class 

 

(Used Inheritence, Override and Overload) 

(Used Aggregation) 

    Extends the class Person so it uses its variables and methods. 

    I use no new variables in this class. 

    There is an arraylist of objects Ticket that stores the tickets that this customer bought. 

    2 methods called addTicket, one of them receives an individual object Ticket and adds it to the array list and the other method receives an arraylist of objects tickets and makes it the new array. 

    toString() function that overrides the toString function  and also prints something other than the one in Person class. (POLYMORPHISM) 

 

Ticket Class 

 

    Has 4 private variables (and their setters and getters to access them): String from, String destination, String employeeName and String ticketID. 

    Has a toString() method that displays all the ticket information. 

 

Main 

    This is what you should run. It has a full GUI and some methods. 

    It has an arraylist for every class. (BusStation, Employee, Customer and Ticket) 

    It has a changeScene method that takes a parameter which is the fxml file name and it changes to that fxml file. 

    It has add, remove, file and display for every one of the classes I have (BusStation, Employee, Customer and Ticket) 

    The add method uses the class’s constructer with the parameters it’s called by and adds a new object with the input to the arraylist. 

    The remove method takes an index number and removes the object at this object’s arraylist. 

    File method creates a .txt file with all the toString’s of an arraylist object. It first checks if the file if already exists it deletes that file and creates a new one. 

 

 

 

 

 

UML 

 