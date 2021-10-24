package sample;

public class Employee extends Person{
    private int ID;
    private String station;

    public Employee(String name, int age, String phone, int ID, String Station){
        super(name, age, phone);
        this.ID=ID;
        this.station=Station;
    }
    public void setStation(String Station)
    {
        this.station=Station;
    }
    public String getStation(){return this.station;}

    @Override
    public String toString() {
        return super.toString() + ", ID: " + this.ID + ", Works at station: "+this.station;
    }

}
