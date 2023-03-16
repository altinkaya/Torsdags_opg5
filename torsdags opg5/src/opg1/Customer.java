package opg1;

public class Customer {


    private String firstName;
    private String lastName;
    private String username;
    private int id;


    public Customer(String firstName, String lastName, String username) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;


    }

    public String toString() {
        return ("Full name " + firstName+ " "+ lastName + " " +"username " + username);

    }

}
