import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        
    }
    public static <T> void changeArray (T[]arr,int from, int to) {
        if (arr == null || arr.length == 1) {
            throw new IllegalArgumentException("Не верный размер массива");
        }
        if (from < 0 || to < 0 || from > arr.length - 1 || to > arr.length - 1 || from == to) {
            throw new IllegalArgumentException("Не найдено заначение массива");

        }
        T tmp = arr[from];
        arr[from] = arr[to];
        arr[to] = tmp;
    }

    public static <T>ArrayList<T> ArraytoList (T[] arr) {
        ArrayList<T> list = new ArrayList<T>();
        for (T t:  arr ) {
            list.add(t);

        }
        return list;
    }
}
