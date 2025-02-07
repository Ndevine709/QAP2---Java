// QAP 2 - Advanced Programming (Java)
// Author - Noah Devine
// Due - February 13th

public class Person {
    // Attributes
    private String lastName;
    private String firstName;
    private Address home;

    // Constructors
    public Person(String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }
    
    // Methods
    public String toString () {
        return (this.firstName + " " + this.lastName + ", " + this.home);
    }
}
