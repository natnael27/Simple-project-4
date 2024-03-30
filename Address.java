public class Address {
    private String streetName;
    private int houseNumber;
    private String city;
    public Address(String streetName, int houseNumber, String city) {
    this.streetName = streetName;
    this.houseNumber = houseNumber;
    this.city = city;
    } 
    public String getStreetName() {
    return streetName;
    } 
    public int getHouseNumber() {
    return houseNumber;
    } 
    public String getCity() {
    return city;
    }
   }
   