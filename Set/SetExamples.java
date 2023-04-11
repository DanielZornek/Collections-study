package Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

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

    }
}
