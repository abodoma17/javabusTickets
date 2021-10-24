package sample;

public abstract class Person implements display{
    private String name;
    private int age;
    private String phoneNo;
    public Person(String name, int age, String phone)
    {
        this.name=name;
        this.age=age;
        this.phoneNo=phone;
    }
    @Override
    public void DisplayNamePhone(){System.out.println("Name: "+this.name+", Phone Number: "+phoneNo);};
    public String getName(){return this.name;}
    public void setName(String name){this.name=name;}
    public int getAge(){return this.age;}
    public void setAge(int age){this.age=age;}
    public String getPhoneNo(){return this.phoneNo;}
    public void setPhoneNo(String phone){this.phoneNo=phone;}
    public String toString() {
        return "Name: "+this.name+", Age: "+this.age+", Phone Number: "+this.phoneNo;
    }
}
