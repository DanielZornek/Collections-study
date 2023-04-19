import java.util.Map;
import java.util.HashMap;

public class mapExample2 {
    public static void main(String[] args) {
        Map<String, String> map001 = new HashMap<>();
        map001.put("001", "Daniel");
        map001.put("919", "Carter");

        System.out.println(map001.get("001"));

        System.out.println("\n Verificando se contém uma chave "+map001.containsKey("919"));
        System.out.println("Verificando se contém uma chave "+map001.containsKey("819"));

        System.out.println("\nVerificando se contém um valor "+map001.containsValue("Daniel"));
        System.out.println("Verificando se contém um valor "+map001.containsValue("Goku"));

        System.out.println("\n Removendo uma chave: ");
        map001.remove("919");
        System.out.println(map001.size());
        System.out.println(map001.containsKey("919"));

        System.out.println("\n Limpando todo o map");
        map001.clear();
        System.out.println(map001.size());
        System.out.println(map001.isEmpty());

        map001.put("001","Itachi");
        map001.put("002","Pain");
        map001.put("003","Kisame");
        map001.put("004","Konan");
        map001.put("005","Hidan");
        map001.put("006","Kakuzu");
        map001.put("007","Goku");

        String antigo = map001.replace("007","Deidara");
        System.out.println(antigo);
        System.out.println(map001.get("007"));
    }

}
