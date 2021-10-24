package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;

public class Main extends Application {
    static ArrayList<BusStation> busStationList = new ArrayList<>();
    static ArrayList<Employee> employeeList = new ArrayList<>();
    static ArrayList<Customer> customerList = new ArrayList<>();
    static ArrayList<Ticket> ticketList = new ArrayList<>();
    private static Stage stg;
    @Override
    public void start(Stage primaryStage) throws Exception{
        stg = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("loginPage.fxml"));
        primaryStage.setTitle("Bus Station Ticket Application");
        primaryStage.setScene(new Scene(root, 673, 400));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public void changeScene(String fxml) throws IOException
    {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }

    public void addTicket(String from, String destination, String employeeName, String tID)
    {
        ticketList.add(new Ticket(from, destination, employeeName, tID));
    }

    public void removeTicket(int i){ticketList.remove(i);}

    public void ticketFile()
    {
        while(true)
            try {
                File ticketFile = new File("Tickets.txt");
                if (ticketFile.createNewFile()) {
                    System.out.println("File created: " + ticketFile.getName());
                }
                else {
                    ticketFile.delete();
                }
                break;
            }
            catch(Exception e)
            {e.printStackTrace();
            }
        try {
            FileWriter writer = new FileWriter("Tickets.txt");
            for(Ticket ticket: ticketList)
            {
                writer.write(ticket.toString());
                writer.write("\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public void addCustomer(String name, int age, String phone, String ID)
    {
        customerList.add(new Customer(name, age, phone, ID));
    }

    public void customerFile()
    {
        while(true)
            try {
                File customerFile = new File("Customers.txt");
                if (customerFile.createNewFile()) {
                    System.out.println("File created: " + customerFile.getName());
                }
                else {
                    customerFile.delete();
                }
                break;
            }
            catch(Exception e)
            {e.printStackTrace();
            }
        try {
            FileWriter writer = new FileWriter("Customers.txt");
            for(Customer cust: customerList)
            {
                writer.write(cust.toString());
                writer.write("\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public void removeCustomer(int i)
    {
        customerList.remove(i);
    }

    public void displayCustomers()
    {
        for(Customer cust: customerList)
        {
            System.out.println(cust.toString());
        }
    }

    public void addBusStation(String busCity, String busName, String busID)
    {
        busStationList.add(new BusStation(busCity, busName, busID));
    }

    public void addEmployee(String name, int age, String phone, int ID, String Station)
    {
        employeeList.add(new Employee(name, age, phone, ID, Station));
    }

    public void employeeFile()
    {
        while(true)
            try {
                File employeeFile = new File("Employees.txt");
                if (employeeFile.createNewFile()) {
                    System.out.println("File created: " + employeeFile.getName());
                }
                else {
                    employeeFile.delete();
                }
                break;
            }
            catch(Exception e)
            {e.printStackTrace();
            }
        try {
            FileWriter writer = new FileWriter("Employees.txt");
            for(Employee emp: employeeList)
            {
                writer.write(emp.toString());
                writer.write("\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    public void displayEmployees()
    {
        for(Employee emp: employeeList)
        {
            System.out.println(emp.toString());
        }
    }

    public void removeEmployee(int i){employeeList.remove(i);}

    public void busStationFile()
    {
        while(true)
        try {
            File busFile = new File("BusStations.txt");
            if (busFile.createNewFile()) {
                System.out.println("File created: " + busFile.getName());
            }
            else {
                busFile.delete();
            }
            break;
        }
        catch(Exception e)
        {e.printStackTrace();
             }
                        try {
        FileWriter writer = new FileWriter("BusStations.txt");
        for(BusStation bus: busStationList)
        {
            writer.write(bus.toString());
            writer.write("\n");
        }
        writer.close();
        } catch (IOException e) {
        e.printStackTrace();

    }

    }

    public void displayBusStations()
    {
        for (BusStation bus: busStationList)
        {
            System.out.println(bus.toString());
        }
    }

    public void removeBus(int i)
    {
        busStationList.remove(i);
    }

    public static void main(String[] args) {
        launch(args);
    }



}
