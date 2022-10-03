package assignent8.list;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Object,Object> maps = new HashMap<>();
        maps.put("name","Obaydul");
        maps.put("id",01);
        maps.put("Country","USA");
        maps.put(10,"Area Code");
        maps.put("Character","Very Good");
        maps.put("Email","12345@gmail.com");
        maps.remove("Character");

        System.out.println(maps);
        System.out.println(maps.get("name"));
    }
}
