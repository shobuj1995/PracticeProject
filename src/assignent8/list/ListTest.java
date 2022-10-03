package assignent8.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Obaydul");
        strings.add("Nahida");
        strings.add("Ali hasan");
        strings.add("100");
        strings.add(null);
        System.out.println(strings.get(0));
        System.out.println("========================");
        strings.remove(1);
        strings.add(1,"Nahida Removed");
        System.out.println(strings.get(1));
        for (String s:strings){
            System.out.println(s);
        }


    }
}
