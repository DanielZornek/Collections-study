import java.util.ArrayList;
import java.util.Iterator;
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

        System.out.println("\n *Iterando* uma lista com Iterator \n");

        Iterator Iterator = myList.iterator();
        
        while(Iterator.hasNext()){
            Object next = Iterator.next();
            System.out.println(next);
        }

        System.out.println("\n Iterando com um laço *foreach* \n");

        for (Object next2 : myList) {
            System.out.println(next2);
        }

        System.out.println("\n Iterando com um laço *for* \n");

        for(int i = 0; i < myList.size(); i++){
            Object next3 = myList.get(i);
            System.out.println(next3);
        }

        System.out.println("\n Limpando uma lista \n");
        myList.clear();
        System.out.println(myList);
        if(myList.size() == 0){
            System.out.println("A lista está vazia");
        }else{
            System.out.println("A lista não está vazia");
        }

        System.out.println("\n Adicionando elementos na lista de uma maneira diferente \n");

        List<Pessoa> myList2 = new ArrayList<Pessoa>();
        myList2.add(new Pessoa("Ken Kaneki", 19, "Masculino"));
        System.out.println(myList2);

        System.out.println("\n List com generics do tipo String \n");

        List<String> myList3 = new ArrayList<>();
        myList3.add(new String("Goku"));
        myList3.add(new String("Vegeta"));
        myList3.add(new String("Gohan"));
        myList3.add(new String("Piccolo"));
        Iterator<String> iterator3 = myList3.iterator();
        // Retorno String do iterator
        while(iterator3.hasNext()){
            String next3 = iterator3.next();
            System.out.println(next3);
        }

        System.out.println("\n Imprimindo com um Foreach \n");

        for (String next4 : myList3) {
            System.out.println(next4);
        }
        
    }
}