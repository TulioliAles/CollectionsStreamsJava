import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Exercicio_Queue {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Pamela");
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clientePreferencial = filaBanco.poll();
        System.out.println(clientePreferencial);
        System.out.println(filaBanco);

        String clientesFila = filaBanco.peek();
        System.out.println(clientesFila);
        System.out.println(filaBanco);

       // filaBanco.clear();

        String clientesFilaOuErro = filaBanco.element();
        System.out.println(clientesFilaOuErro);
        System.out.println(filaBanco);

        for(String elemento : filaBanco){
            System.out.println(elemento);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while (iteratorFilaBanco.hasNext()){
            System.out.println("---->" + iteratorFilaBanco.next());
        }
    }
}
