public class User {

    private String username;
    private String password;

    private static int count = 0;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        count = count + 1;
    }

    public int getCount() {
        return count;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
}