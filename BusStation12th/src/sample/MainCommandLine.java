package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class MainCommandLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Ticket> ticketList = new ArrayList<>();
        ArrayList<Employee> employeeList = new ArrayList<>();
        ArrayList<Customer> customerList = new ArrayList<>();
        ArrayList<BusStation> busStationlist = new ArrayList<>();
        while(true)
        {
            try{
            int choice;
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("""
                           1. Add Bus Station
                           2. Add Employee
                           3. Add Customer
                           4. Create Ticket
                           5. Remove Bus Station
                           6. Remove Employee
                           7. Remove Customer
                           8. Remove Ticket
                           9. Display Complete Employee List
                           10. Display Complete Customer List
                           11. Display Complete Ticket List
                           12. Display Complete Bus Station List
                           13. Display all Tickets of a specific person
                           14. Add a Ticket to a specific person
                           15. Display names and phone numbers of all customers
                           16. Create a new file with Tickets available
                           17. Exit""");
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("Enter your choice: ");
            choice=scan.nextInt();
            if(choice <= 0 || choice>17 )
            {
                throw new IOException();
            }

            switch(choice)
            {
                case 1:
                    System.out.println("--------------------------------------------------------------------------------------");
                    String cityName, stationName, stationID;
                    System.out.println("Enter the number of Bus Stations you want to add: ");
                    int num = scan.nextInt();
                    scan.nextLine();
                    for(int i=0;i<num;i++){
                        System.out.println("Enter Bus Station City: ");
                        cityName=scan.next();
                        System.out.println("Enter Bus Station Name: ");
                        stationName=scan.next();
                        System.out.println("Enter Bus Station ID: ");
                        stationID=scan.next();
                        busStationlist.add(new BusStation(cityName, stationName, stationID));
                    }
                    break;


                case 2:
                    System.out.println("--------------------------------------------------------------------------------------");
                    String name, phoneNo, Station;
                    int ID, age;
                    int employeeC;
                    scan.nextLine();
                    System.out.println("Enter name:");
                    name=scan.nextLine();
                    System.out.println("Enter age: ");
                    age=scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter phone number: ");
                    phoneNo=scan.nextLine();
                    System.out.println("Enter ID: ");
                    ID=scan.nextInt();
                    System.out.println("--------------------------------------------------------------------------------------");
                    int i = 0;
                    for (BusStation bus: busStationlist)
                    {
                        i++;
                        System.out.println(i+" - "+bus.getStationName());
                    }
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println("Choose the station the employee will work in: ");
                    employeeC=scan.nextInt();
                    Station=busStationlist.get(employeeC-1).getStationName();
                    employeeList.add(new Employee(name, age, phoneNo, ID, Station));

                    break;


                case 3:
                    System.out.println("--------------------------------------------------------------------------------------");
                    String custName, custPhoneNo, custID;
                    int custAge;
                    System.out.println("Enter the number of customers you want to add: ");
                    int yC = scan.nextInt();
                    scan.nextLine();
                    System.out.println("--------------------------------------------------------------------------------------");
                    for(i=0;i<yC;i++)
                    {
                        System.out.println("Enter name:");
                        custName=scan.nextLine();
                        System.out.println("Enter age: ");
                        custAge=scan.nextInt();
                        scan.nextLine();
                        System.out.println("Enter phone number: ");
                        custPhoneNo=scan.nextLine();
                        System.out.println("Enter customer ID: ");
                        custID=scan.next();
                        scan.nextLine();
                        customerList.add(new Customer(custName, custAge, custPhoneNo, custID));
                    }
                    break;

                case 4:
                    System.out.println("--------------------------------------------------------------------------------------");
                    int yT, busC;
                    String to, from, tID;
                    String employeeN;
                    System.out.println("Enter the number of tickets you want to add: ");
                    yT=scan.nextInt();
                    for(i=0;i<yT;i++)
                    {
                        int count=0;
                        System.out.println("--------------------------------------------------------------------------------------");
                        for (BusStation bus: busStationlist)
                        {
                            count++;
                            System.out.println(count+"- "+bus.getStationName());
                        }
                        System.out.println("Choose the station of departure: ");
                        busC=scan.nextInt();
                        from=busStationlist.get(busC-1).getStationName();
                        System.out.println("Choose the station of arrival: ");
                        busC=scan.nextInt();
                        to=busStationlist.get(busC-1).getStationName();
                        System.out.println("--------------------------------------------------------------------------------------");
                        count=0;
                        for(Employee employee: employeeList)
                        {
                            count++;
                            System.out.println(count+"- "+employee.getName());
                        }
                        System.out.println("Choose the employee responsible: ");
                        busC=scan.nextInt();
                        employeeN=employeeList.get(busC-1).getName();
                        System.out.println("Enter ticket ID: ");
                        tID=scan.next();
                        scan.nextLine();

                        ticketList.add(new Ticket(from,to,employeeN,tID));
                    }
                    break;

                case 5:
                    System.out.println("--------------------------------------------------------------------------------------");
                    int nullChoice;
                    i=0;
                    for (BusStation bus: busStationlist)
                    {
                        i++;
                        System.out.println(i+"- "+bus.getStationName());
                    }
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println("Enter the number of the station you'd like to remove: ");
                    nullChoice=scan.nextInt();
                    busStationlist.remove(nullChoice-1);
                    break;

                case 6:
                    System.out.println("--------------------------------------------------------------------------------------");
                    i=0;
                    for(Employee employee: employeeList)
                    {
                        i++;
                        System.out.println(i+"- "+employee.getName());
                    }
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println("Enter the number of the employee you'd like to remove: ");
                    nullChoice=scan.nextInt();
                    employeeList.remove(nullChoice-1);
                    break;


                case 7:
                    System.out.println("--------------------------------------------------------------------------------------");
                    i=0;
                    for(Customer customer: customerList)
                    {
                        i++;
                        System.out.println(i+"- "+customer.getName());
                    }
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println("Enter the number of the employee you'd like to remove: ");
                    nullChoice=scan.nextInt();
                    customerList.remove(nullChoice-1);
                    break;


                case 8:
                    System.out.println("--------------------------------------------------------------------------------------");
                    i=0;
                    for(Ticket ticket: ticketList)
                    {
                        i++;
                        System.out.println(i+"- "+ticket.toString());
                    }
                    System.out.println("Enter the number of the ticket you'd like to remove: ");
                    nullChoice=scan.nextInt();
                    ticketList.remove(nullChoice-1);
                    break;

                case 9:
                    System.out.println("--------------------------------------------------------------------------------------");
                    for(Employee employee: employeeList)
                    {
                        System.out.println(employee.toString());
                    }
                    break;


                case 10:
                    System.out.println("--------------------------------------------------------------------------------------");
                    for(Customer customer: customerList)
                    {
                        System.out.println(customer.toString());
                    }
                    break;

                case 11:
                    System.out.println("--------------------------------------------------------------------------------------");
                    for (Ticket ticket: ticketList)
                    {
                        System.out.println(ticket.toString());
                    }
                    break;

                case 12:
                    System.out.println("--------------------------------------------------------------------------------------");
                    for (BusStation bus: busStationlist)
                    {
                        System.out.println(bus.toString());
                    }
                    break;

                case 13:
                    System.out.println("--------------------------------------------------------------------------------------");
                    int count=0;
                    for(Customer customer: customerList)
                    {
                        count++;
                        System.out.println(count+"- "+customer.getName());
                    }
                    System.out.println("Enter the number of the employee you want to know ticket: ");
                    int tickC = scan.nextInt();
                    customerList.get(tickC-1).printTicketlist();
                    break;


                case 14:
                    System.out.println("--------------------------------------------------------------------------------------");
                    count=0;
                    int customerC;
                    for(Customer customer: customerList)
                    {
                        count++;
                        System.out.println(count+"- "+customer.getName());
                    }
                    System.out.println("Enter the number of the customer you want to add tickets for: ");
                    customerC = scan.nextInt();
                    count=0;
                    for(Ticket ticket: ticketList)
                    {
                        count++;
                        System.out.println(count+"- "+ticket.toString());
                    }
                    tickC=scan.nextInt();
                    customerList.get(customerC-1).addTicket(ticketList.get(tickC-1));
                    break;

                case 15:
                    System.out.println("--------------------------------------------------------------------------------------");
                    for(Customer customer: customerList)
                    {
                        customer.DisplayNamePhone();
                    }
                    break;


                case 16:

                    while(true)
                    {
                        try {
                            File ticketFile = new File("tickets.txt");
                            if (ticketFile.createNewFile()) {
                                System.out.println("File created: " + ticketFile.getName());
                            } else {
                                ticketFile.delete();
                            }
                            break;
                            }
                        catch(Exception e)
                        {e.printStackTrace();
                        }
                    }




                        try {
                            FileWriter writer = new FileWriter("tickets.txt");
                            for(Ticket ticket: ticketList)
                            {
                                writer.write(ticket.toString());
                                writer.write("\n");
                            }
                            writer.close();
                            System.out.println("Your file was created.");

                        } catch (IOException e) {
                            e.printStackTrace();

                    }
                    break;


                case 17:
                    System.out.println("--------------------------------------------------------------------------------------");
                    System.out.println("PROGRAM TERMINATING");
                    System.exit(0);



            }



        }
        catch(Exception e)
        {
            System.out.println("ERROR: enter a valid choice: ");
        }
        }

    }
}

