import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio_List {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");
        System.out.println(nomes);

        for(String nomesLista : nomes) {
            System.out.println(nomesLista);
        }

        nomes.set(2, "Roberto");
        System.out.println(nomes);

        String nome = nomes.get(1);
        System.out.println(nome);

        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("Larissa");
        System.out.println(nomes);

        int total = nomes.size();
        System.out.println(total);

        Boolean temJuliano = nomes.contains("Juliano");
        System.out.println(temJuliano);

        List<String> novaLista= new ArrayList<>();

        novaLista.add("Ismael");
        novaLista.add("Rodrigo");
        System.out.println(novaLista);

        nomes.addAll(novaLista);
        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);

        Boolean estaVazia = nomes.isEmpty();
        System.out.println(estaVazia);
    }
}
