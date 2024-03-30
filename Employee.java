public class Employee {
    private String name;
    private int id;
    private double salary;
    private Address address; 
    public Employee(String name, int id, double salary, Address address) {
    this.name = name;
    this.id = id;
    this.salary = salary;
    this.address = address;
    } 
    public String getName() {
    return name;
    } 
    public int getId() {
    return id;
    } 
    public double getSalary() {
    return salary;
    } 
    public Address getAddress() {
    return address;
    } 
    
   public void setName(String name) {
    this.name = name;
    } 
    public void setId(int id) {
    this.id = id;
    } 
    public void setSalary(double salary) {
    this.salary = salary;
    } 
    public void setAddress(Address address) {
    this.address = address;
    } 
    public void nameTokenizing() {
    String[] tokens = name.split(" ");
    System.out.println("Name tokens:");
    for (String token : tokens) {
    System.out.println(token);
    }
    }
   }