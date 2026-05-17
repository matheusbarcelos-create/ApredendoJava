import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import necessário para cod

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        // add elementos array
        names.add("John");
        names.add("Jane");
        names.add("Julie");
        names.add("Matheus");

        Collections.sort(names); //<- deixa em ordem na regra que decidir, tanto como:
                                // alfabética,decimal,numérica,cronológica

        //indice tipo for diferente
        for(String name : names) {
            System.out.println(name);
        }

    }
}