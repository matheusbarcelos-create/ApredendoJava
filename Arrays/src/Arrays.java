public class Arrays {
    public static void main(String[] args) {

        User[] users = new User[10];
        // caixa com vários espaços

        //representação básica:
        // |a|b|c|d|e| <- um local onde a várias opções

        for (int i = 0; i < users.length; i++){
            User actual = new User();
            actual.setFirstName(" nome " + i);
            actual.setLastName(" sobrenome " + i);
            users[i] = actual;
        }

        System.out.println(users[2].getFirstName());
        System.out.println(users[2].getLastName());
    }
}