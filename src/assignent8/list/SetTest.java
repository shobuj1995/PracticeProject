package assignent8.list;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Number> numberSet = new HashSet<>();
        numberSet.add(56);
        numberSet.add(12);
        numberSet.add(45);
        numberSet.add(12);
        numberSet.add(null);
        for(Number i:numberSet){
            System.out.println(i);
        }
    }
}
