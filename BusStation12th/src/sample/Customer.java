package sample;

import java.util.ArrayList;
public class Customer extends Person {
    private String customerID;
    ArrayList<Ticket> tickets = new ArrayList<>();
    public Customer(String name, int age, String phone){
        super(name, age, phone);
    }
    public Customer(String name, int age, String phone, String ID){
        super(name, age, phone);
        this.customerID=ID;

    }
    public void addTicket(Ticket ticket){tickets.add(ticket);}
    public void addTicket(ArrayList<Ticket> inpTickets){tickets=inpTickets;}
    public void printTicketlist()
    {
        int i=0;
        for (Ticket ticket: tickets)
        {
            i++;
            System.out.println(i+" - "+ticket.toString());
        }
    }
    public void setCustomerID(String cID)
    {
        this.customerID=cID;
    }

    public String getCustomerID() {
        return customerID;
    }

    @Override
    public String toString() {
        return super.toString() +", Customer ID: "+ this.customerID +", Number of tickets: "+tickets.size();
    }
}

