import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import necessário para cod

public class Main {
    public static void main(String[] args) {

        User User1 = new User("Matheus", "123");
        User User2 = new User("Barcelos", "456");
        System.out.println(User2.saida());
        System.out.println(User1.saida(false));

    }
}