public class User {

    //propriedades de campo(objeto)
    private String firstName;
    private String lastName;

    //construtor
    public User() {
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
