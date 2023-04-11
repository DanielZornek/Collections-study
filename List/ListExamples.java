import java.util.ArrayList;
import java.util.List;

public class ListExamples{
    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add("Object 1"); // 0
        myList.add("Object 2"); // 1
        myList.add("Object 3"); // 2

        myList.remove(2); // removing object in the index 2
        System.out.println("Removemos o elemento do índice 2, vamos ver como ficou: " + myList);
        myList.get(0); // pegando objeto no primeiro index
        
        String firstObject = (String) myList.get(0);
        System.out.println("Primeiro Objeto da lista: "+firstObject);
        // Armazenando o primeiro indice em uma variável
        // precisamos fazer o cast

        int sizeOfList = myList.size();
        // armazenado o tamanho do Array em um variavel
        System.out.println("Tamanho da lista: "+sizeOfList);
    }
}