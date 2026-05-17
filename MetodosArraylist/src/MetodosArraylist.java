import java.util.ArrayList;
import java.util.List;
// import do método usado

public class MetodosArraylist {
    public static void main(String[] args) {

        // String[] = (fixo)
        // new ArrayList<String>() = (dinâmicos)

        List<String> names = new ArrayList<>();
        // como adicionar elementos no array:

        names.add("Joao"); // 0
        names.add("Maria"); // 1
        names.add("Mari"); // 2
        names.add("Joan"); // 3

        // como buscar o elemento especifíco pelo indice get()
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        // como buscar o indice apartir de 1 elemento
        int index = names.indexOf("Joan");
        System.out.println(index);

        // verifica se a lista está vazia
        System.out.println(names.isEmpty()); //<- contem elemento

        // verifica se a lista contem elemento
        System.out.println(names.contains("matheus")); //<- n contem nada

        // verifica tamanho da lista
        System.out.println(names.size());

        //limpar a lista (remover os valores do objeto)
        names.clear();
        System.out.println(names.isEmpty());
    }
}