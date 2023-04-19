import java.util.HashMap;
import java.util.Map;

public class mapExample{
    public static void main(String[] args) {
        Map<String, movieTicket> map1 = new HashMap<>();
        // Simple Movie Ticket for practice Map interfaco
        map1.put("Ticket001", new movieTicket("Sonic the Movie", 28d, "Sun"));

        map1.put("Ticket002", new movieTicket("Super Mario Bros The Movie", 28, "Wed"));

        System.out.println(map1.get("Ticket001")+"\n");
        System.out.println(map1.get("Ticket002"));

        System.out.println("Quantos tickets foram criados? "+map1.size());

        System.out.println("Está vazio? "+map1.isEmpty());

        Map map2 = new HashMap<>();
        map2.putAll(map1);
        
        System.out.println("\n Colocando os elementos do Map 1 dentro do Map 2, pelo que vejo pode ser usado pra backup, ou simplesmente guardar \n");
        System.out.println(map2+"\n");
        
        
        
    }
}