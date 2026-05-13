public class Construtor {
    public static void main(String[] args) {
        User[] users = new User[]{
            // caixa com vários espaços

            //representação básica:
            // |a|b|c|d|e| <- um local onde a várias opções

            new User("John", "Doe"),
                new User("Matheus", "Barcelos"),
                    new User("text", "text")
        };

        System.out.println(users[2].getFirstName());
        System.out.println(users[2].getLastName());
    }
}