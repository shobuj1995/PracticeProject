package generics;

public class MainTest {
    public static void main(String[] args) {
        DataTypeTest<Integer> intergerData = new DataTypeTest<>(25);
        int value;
        value =intergerData.getData();
        System.out.println(value);
        DataTypeTest<String> stringDataTypeTest = new DataTypeTest<>("This is a String DataType");
        System.out.println(stringDataTypeTest.getData());
        DataTypeTest<Double> doubleDataTypeTest = new DataTypeTest<>(7.680);
        System.out.println(doubleDataTypeTest.getData());
    }
}
