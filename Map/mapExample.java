import java.util.HashMap;
import java.util.Map;

public class mapExample{
    public static void main(String[] args) {
        Map<String, movieTicket> map1 = new HashMap<>();
        // Simple Movie Ticket for practice Map interfaco
        map1.put("Ticket001", new movieTicket("Sonic the Movie", 28d, "Sun"));

        System.out.println(map1);
    }
}