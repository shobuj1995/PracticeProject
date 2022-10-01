package generics;

public class DataTypeTest<T> {
    private T data;
    public DataTypeTest(T data){
        this.data = data;
    }
    public T getData(){
        return data;
    }

}
