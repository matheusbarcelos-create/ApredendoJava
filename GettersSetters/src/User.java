public class User {

    //propriedades (private)
    private String firstname;
    private String lastname;

    //setter
    public void setFirstname(String firstname) {
        this.firstname = firstname.toUpperCase();
    }
    public void setLastname(String lastname) {
        this.lastname = lastname.toUpperCase();
    }

    //getter
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
}

