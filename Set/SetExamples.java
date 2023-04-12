package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class SetExamples {
    public static void main(String[] args) {
        System.out.println("\n Informações sobre Set ");
        System.out.println("° A interface Set representa uma coleção desordenada de elementos únicos, ou seja, não podemos adicionar dois elementos iguais, como: ");
        System.out.printf("[Goku, Goku]");
        System.out.printf("[25, 25]");

        Set<String> mySet = new HashSet<String>();

        Set<String> mySet2 = new TreeSet<String>();
        // A principal diferença entre Tree e Hash é que o Tree ordena
        // os elementos, o hash não
        mySet.add("Maçã");
        System.out.println("\n "+mySet);    

        // o método add retorna um boolean
        boolean added = mySet.add("Goiaba");
        boolean added2 = mySet.add("Goiaba");
        // Aqui vai dar ruim pq no hash não pode ter elementos iguais
        // retornará falso
        System.out.println(added);
        System.out.println(added2);

        Set<String> mySet3 = Set.of("Goiaba", "Pera", "Banana");
        // Adicionando elementos de um jeito diferente, desse jeito
        // podemos passa mais de um elemento
        System.out.println(mySet3);

        System.out.println("\n ===================================================== \n");
        System.out.println("Iterando elementos com Iterator de um Set");
        System.out.println("O TreeSet coloca em ordem, nesse caso comoo é String é alfabética");
        mySet2.add("Macarrão");
        mySet2.add("Lasanha");
        mySet2.add("Pavê");
        mySet2.add("Hambúrguer");
        mySet2.add("Salada de alface");

        Iterator<String> iterator = mySet2.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        System.out.println("\n Usando Foreach para imprimir os elementos: \n");

        for (String elemento : mySet2) {
            System.out.println(elemento);
        }

        System.out.println("\n Conceitos básicos de Stream API: \n");

        Stream<String> stream = mySet2.stream();

        stream.forEach((elemento2) -> System.out.println(elemento2));

        System.out.println("\n Removendo elementos do TreeSet: \n");

        mySet2.add("Corsa 2008 rebaixado");
        System.out.println(mySet2);
        boolean removed1 = mySet2.remove("Corsa 2008 rebaixado");
        boolean removedCueca = mySet2.remove("Cueca");

        System.out.println(removed1);
        System.out.println(removedCueca);

        System.out.println(mySet2);

        System.out.println("\n Limpando toda uma coleção Set: ");
        mySet2.clear();
        System.out.println(mySet2);

        System.out.println("\n Método retainAll, apaga o resto e deixa somente o que está nos parãmetros: \n");
        mySet.retainAll(Set.of("Goiaba"));
        System.out.println(mySet);

        
        System.out.println("\n Imprimindo tamanho de um Set \n");
        int tamanhoSet = mySet3.size();
        System.out.println(tamanhoSet);

        System.out.println("\n Checkando se os três estão vazios \n");

        boolean estaVazioSet = mySet.isEmpty();
        boolean estaVazioSet2 = mySet2.isEmpty();
        boolean estaVazioSet3 = mySet3.isEmpty();

        System.out.println(estaVazioSet);
        System.out.println(estaVazioSet2);
        System.out.println(estaVazioSet3);

        System.out.println("\n Checkando se contém algum elemento específico no Set \n");

        boolean temGoiaba = mySet.contains("Goiaba");
        System.out.println(temGoiaba);
        if(temGoiaba == true){
            System.out.println("Temos Goiaba");
        }else{
            System.out.println("Não temos Goiaba :(");
        }

        System.out.println("\n Adicionando todo um Set dentro de uma lista \n");

        Set<String> sayiajins = new TreeSet<>();

        sayiajins.add("Goku");
        sayiajins.add("Vegeta");
        sayiajins.add("Gohan");
        sayiajins.add("Broly");
        sayiajins.add("Trunks");

        List<String> listSayiajins = new ArrayList<>();
        listSayiajins.addAll(sayiajins);

        System.out.println(listSayiajins);

        // That´s it for now
    }
}
