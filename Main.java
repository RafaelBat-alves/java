import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class testando implements Comparator<Pessoa>{


    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return p1.getNome().compareTo(p2.getNome());
    }
}

public class Main {

    //Binary Search outra forma de fazer busca em coleção ou array
    //ele faz a possição que faz vc inserir possição
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Integer> numero = new ArrayList<>();
        numero.add(3);
        numero.add(2);
        numero.add(5);
        numero.add(7);
        //System.out.println(numero.indexOf(3));
        // System.out.println(numero.indexOf(2));
        //System.out.println(numero.indexOf(1));
        //para mostra indicie onde esta justamente aquilo que vc esta procurando precisa colocar sort
        Collections.sort(numero);
        //ele retorna onde devia esta posição
        // exemplo se um numero fica na posição 1 ele vai dizer posição 1 mais se não existir numero 1 ele retorna mesma possição com menos -1 exemplo
        System.out.println(Collections.binarySearch(numero,1));

        //       return this.nome.compareTo(pessoas.getNome());

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(1,"rafael"));
        pessoas.add(new Pessoa(2,"rian"));
        pessoas.add(new Pessoa(6,"renan"));
        pessoas.add(new Pessoa(8,"janaina"));
        pessoas.add(new Pessoa(34,"armenio"));
        pessoas.add(new Pessoa(8,"amanda"));
Collections.sort(pessoas);
Pessoa pessoa = new Pessoa(7,"amanda");
System.out.println(Collections.binarySearch(pessoas,pessoa));System.out.println(pessoas);


    }
}