import java.util.ArrayList;
public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array = library.FillRandomArray(20);
        library.PrintArray(array);
        DeleteEvenNumber(array);
        library.PrintArray(array);
    }

    public static void DeleteEvenNumber(ArrayList<Integer> list) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) list.remove(i);
            else i++;
        }
    }
}
