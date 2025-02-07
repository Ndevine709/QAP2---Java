// QAP 2 - Advanced Programming (Java)
// Author - Noah Devine
// Due - February 13th

public class Address {
    // Attributes
    private String street;
    private String city;
    private String state;
    private String zip;

    // Constructors
    public Address (String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // Methods
    public String toString () {
        return (this.street + ", " + this.city + ", " + this.state + " " + this.zip);
    }
}
