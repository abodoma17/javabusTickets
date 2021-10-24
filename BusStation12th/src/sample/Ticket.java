package sample;

public class Ticket{
    private String destination;
    private String from;
    private String employeeName;
    private String ticketID;
    public Ticket(String from, String destination, String employeeName)
    {
        this.from=from;
        this.destination=destination;
        this.employeeName=employeeName;
    }
    public Ticket(String from, String destination, String employeeName, String tID)
    {
        this.from=from;
        this.destination=destination;
        this.employeeName=employeeName;
        this.ticketID=tID;
    }
    public void setTicketID(String tID){this.ticketID=tID;}
    public String getTicketID() {
        return ticketID;
    }
    public void setDestination(String dest){this.destination=dest;}
    public void setFrom(String from){this.from=from;}
    public void setEmployeeName(String name){this.employeeName=name;}
    public String getDestination(){return this.destination;}
    public String getFrom(){return this.from;}
    public String getEmployeeName(){return this.employeeName;}
    public String toString(){return "From: "+this.from+", To: "+this.destination+", Ticket ID: "+ this.ticketID  +", Made by: "+this.employeeName;}

}

