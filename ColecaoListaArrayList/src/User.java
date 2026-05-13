public class User {

    //propriedades de campo(objeto)
    private String firstName;
    private String lastName;

    //construtor
    public User() {
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName;
    }

    //setters
    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //getters
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
