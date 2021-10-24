package sample;

public class BusStation {
    private String stationCity;
    private String stationName;
    private String stationID;
    public BusStation(String stationCity, String stationName)
    {
        this.stationCity=stationCity;
        this.stationName=stationName;
    }
    public BusStation(String stationCity, String stationName, String stationID)
    {
        this.stationCity=stationCity;
        this.stationName=stationName;
        this.stationID=stationID;
    }

    public String getStationCity(){return this.stationCity;}
    public void setStationCity(String station){this.stationCity=station;}
    public String getStationName(){return this.stationName;}
    public void setStationName(String station){this.stationName=station;}
    public String getStationID(){return this.stationID;}
    public void setStationID(String station){this.stationID=station;}
    public String toString() {
        return "City: "+this.stationCity+", Station Name: "+this.stationName+", Station ID: "+this.stationID;
    }

}

